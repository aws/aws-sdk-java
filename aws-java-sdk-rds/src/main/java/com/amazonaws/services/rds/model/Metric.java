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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The representation of a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/Metric" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Metric implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a metric.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of metric references (thresholds).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricReference> references;
    /**
     * <p>
     * The details of different statistics for a metric. The description might contain markdown.
     * </p>
     */
    private String statisticsDetails;
    /**
     * <p>
     * The query to retrieve metric data points.
     * </p>
     */
    private MetricQuery metricQuery;

    /**
     * <p>
     * The name of a metric.
     * </p>
     * 
     * @param name
     *        The name of a metric.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a metric.
     * </p>
     * 
     * @return The name of a metric.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a metric.
     * </p>
     * 
     * @param name
     *        The name of a metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of metric references (thresholds).
     * </p>
     * 
     * @return A list of metric references (thresholds).
     */

    public java.util.List<MetricReference> getReferences() {
        if (references == null) {
            references = new com.amazonaws.internal.SdkInternalList<MetricReference>();
        }
        return references;
    }

    /**
     * <p>
     * A list of metric references (thresholds).
     * </p>
     * 
     * @param references
     *        A list of metric references (thresholds).
     */

    public void setReferences(java.util.Collection<MetricReference> references) {
        if (references == null) {
            this.references = null;
            return;
        }

        this.references = new com.amazonaws.internal.SdkInternalList<MetricReference>(references);
    }

    /**
     * <p>
     * A list of metric references (thresholds).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferences(java.util.Collection)} or {@link #withReferences(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param references
     *        A list of metric references (thresholds).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withReferences(MetricReference... references) {
        if (this.references == null) {
            setReferences(new com.amazonaws.internal.SdkInternalList<MetricReference>(references.length));
        }
        for (MetricReference ele : references) {
            this.references.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metric references (thresholds).
     * </p>
     * 
     * @param references
     *        A list of metric references (thresholds).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withReferences(java.util.Collection<MetricReference> references) {
        setReferences(references);
        return this;
    }

    /**
     * <p>
     * The details of different statistics for a metric. The description might contain markdown.
     * </p>
     * 
     * @param statisticsDetails
     *        The details of different statistics for a metric. The description might contain markdown.
     */

    public void setStatisticsDetails(String statisticsDetails) {
        this.statisticsDetails = statisticsDetails;
    }

    /**
     * <p>
     * The details of different statistics for a metric. The description might contain markdown.
     * </p>
     * 
     * @return The details of different statistics for a metric. The description might contain markdown.
     */

    public String getStatisticsDetails() {
        return this.statisticsDetails;
    }

    /**
     * <p>
     * The details of different statistics for a metric. The description might contain markdown.
     * </p>
     * 
     * @param statisticsDetails
     *        The details of different statistics for a metric. The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withStatisticsDetails(String statisticsDetails) {
        setStatisticsDetails(statisticsDetails);
        return this;
    }

    /**
     * <p>
     * The query to retrieve metric data points.
     * </p>
     * 
     * @param metricQuery
     *        The query to retrieve metric data points.
     */

    public void setMetricQuery(MetricQuery metricQuery) {
        this.metricQuery = metricQuery;
    }

    /**
     * <p>
     * The query to retrieve metric data points.
     * </p>
     * 
     * @return The query to retrieve metric data points.
     */

    public MetricQuery getMetricQuery() {
        return this.metricQuery;
    }

    /**
     * <p>
     * The query to retrieve metric data points.
     * </p>
     * 
     * @param metricQuery
     *        The query to retrieve metric data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withMetricQuery(MetricQuery metricQuery) {
        setMetricQuery(metricQuery);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences()).append(",");
        if (getStatisticsDetails() != null)
            sb.append("StatisticsDetails: ").append(getStatisticsDetails()).append(",");
        if (getMetricQuery() != null)
            sb.append("MetricQuery: ").append(getMetricQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Metric == false)
            return false;
        Metric other = (Metric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        if (other.getStatisticsDetails() == null ^ this.getStatisticsDetails() == null)
            return false;
        if (other.getStatisticsDetails() != null && other.getStatisticsDetails().equals(this.getStatisticsDetails()) == false)
            return false;
        if (other.getMetricQuery() == null ^ this.getMetricQuery() == null)
            return false;
        if (other.getMetricQuery() != null && other.getMetricQuery().equals(this.getMetricQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode + ((getStatisticsDetails() == null) ? 0 : getStatisticsDetails().hashCode());
        hashCode = prime * hashCode + ((getMetricQuery() == null) ? 0 : getMetricQuery().hashCode());
        return hashCode;
    }

    @Override
    public Metric clone() {
        try {
            return (Metric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
