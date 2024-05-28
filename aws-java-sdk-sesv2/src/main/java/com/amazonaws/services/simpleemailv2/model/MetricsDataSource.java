/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the data source for the metrics export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/MetricsDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains a mapping between a <code>MetricDimensionName</code> and
     * <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than 3
     * unique ones.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> dimensions;
    /**
     * <p>
     * The metrics namespace - e.g., <code>VDM</code>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * A list of <code>ExportMetric</code> objects to export.
     * </p>
     */
    private java.util.List<ExportMetric> metrics;
    /**
     * <p>
     * Represents the start date for the export interval as a timestamp.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * Represents the end date for the export interval as a timestamp.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * An object that contains a mapping between a <code>MetricDimensionName</code> and
     * <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than 3
     * unique ones.
     * </p>
     * 
     * @return An object that contains a mapping between a <code>MetricDimensionName</code> and
     *         <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than
     *         3 unique ones.
     */

    public java.util.Map<String, java.util.List<String>> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * An object that contains a mapping between a <code>MetricDimensionName</code> and
     * <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than 3
     * unique ones.
     * </p>
     * 
     * @param dimensions
     *        An object that contains a mapping between a <code>MetricDimensionName</code> and
     *        <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than
     *        3 unique ones.
     */

    public void setDimensions(java.util.Map<String, java.util.List<String>> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * An object that contains a mapping between a <code>MetricDimensionName</code> and
     * <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than 3
     * unique ones.
     * </p>
     * 
     * @param dimensions
     *        An object that contains a mapping between a <code>MetricDimensionName</code> and
     *        <code>MetricDimensionValue</code> to filter metrics by. Must contain a least 1 dimension but no more than
     *        3 unique ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource withDimensions(java.util.Map<String, java.util.List<String>> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Add a single Dimensions entry
     *
     * @see MetricsDataSource#withDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource addDimensionsEntry(String key, java.util.List<String> value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * The metrics namespace - e.g., <code>VDM</code>.
     * </p>
     * 
     * @param namespace
     *        The metrics namespace - e.g., <code>VDM</code>.
     * @see MetricNamespace
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The metrics namespace - e.g., <code>VDM</code>.
     * </p>
     * 
     * @return The metrics namespace - e.g., <code>VDM</code>.
     * @see MetricNamespace
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The metrics namespace - e.g., <code>VDM</code>.
     * </p>
     * 
     * @param namespace
     *        The metrics namespace - e.g., <code>VDM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricNamespace
     */

    public MetricsDataSource withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The metrics namespace - e.g., <code>VDM</code>.
     * </p>
     * 
     * @param namespace
     *        The metrics namespace - e.g., <code>VDM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricNamespace
     */

    public MetricsDataSource withNamespace(MetricNamespace namespace) {
        this.namespace = namespace.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code>ExportMetric</code> objects to export.
     * </p>
     * 
     * @return A list of <code>ExportMetric</code> objects to export.
     */

    public java.util.List<ExportMetric> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * A list of <code>ExportMetric</code> objects to export.
     * </p>
     * 
     * @param metrics
     *        A list of <code>ExportMetric</code> objects to export.
     */

    public void setMetrics(java.util.Collection<ExportMetric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<ExportMetric>(metrics);
    }

    /**
     * <p>
     * A list of <code>ExportMetric</code> objects to export.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        A list of <code>ExportMetric</code> objects to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource withMetrics(ExportMetric... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<ExportMetric>(metrics.length));
        }
        for (ExportMetric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ExportMetric</code> objects to export.
     * </p>
     * 
     * @param metrics
     *        A list of <code>ExportMetric</code> objects to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource withMetrics(java.util.Collection<ExportMetric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp.
     * </p>
     * 
     * @param startDate
     *        Represents the start date for the export interval as a timestamp.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp.
     * </p>
     * 
     * @return Represents the start date for the export interval as a timestamp.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * Represents the start date for the export interval as a timestamp.
     * </p>
     * 
     * @param startDate
     *        Represents the start date for the export interval as a timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * Represents the end date for the export interval as a timestamp.
     * </p>
     * 
     * @param endDate
     *        Represents the end date for the export interval as a timestamp.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * Represents the end date for the export interval as a timestamp.
     * </p>
     * 
     * @return Represents the end date for the export interval as a timestamp.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * Represents the end date for the export interval as a timestamp.
     * </p>
     * 
     * @param endDate
     *        Represents the end date for the export interval as a timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsDataSource withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsDataSource == false)
            return false;
        MetricsDataSource other = (MetricsDataSource) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        return hashCode;
    }

    @Override
    public MetricsDataSource clone() {
        try {
            return (MetricsDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.MetricsDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
