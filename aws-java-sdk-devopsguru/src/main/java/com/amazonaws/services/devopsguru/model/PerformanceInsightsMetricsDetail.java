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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about Performance Insights metrics.
 * </p>
 * <p>
 * Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on
 * data captured from a running DB instance. DB load is measured as average active sessions. Performance Insights
 * provides the data to API consumers as a two-dimensional time-series dataset. The time dimension provides DB load data
 * for each time point in the queried time range. Each time point decomposes overall load in relation to the requested
 * dimensions, measured at that time point. Examples include SQL, Wait event, User, and Host.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon Aurora DB instances, go to the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html"> Amazon Aurora User
 * Guide</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon RDS DB instances, go to the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Amazon RDS User Guide</a>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PerformanceInsightsMetricsDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetricsDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name used for a specific Performance Insights metric.
     * </p>
     */
    private String metricDisplayName;
    /**
     * <p>
     * The unit of measure for a metric. For example, a session or a process.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * A single query to be processed for the metric. For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     * .
     * </p>
     */
    private PerformanceInsightsMetricQuery metricQuery;
    /**
     * <p>
     * For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     * .
     * </p>
     */
    private java.util.List<PerformanceInsightsReferenceData> referenceData;
    /**
     * <p>
     * The metric statistics during the anomalous period detected by DevOps Guru;
     * </p>
     */
    private java.util.List<PerformanceInsightsStat> statsAtAnomaly;
    /**
     * <p>
     * Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it compares them
     * to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * </p>
     */
    private java.util.List<PerformanceInsightsStat> statsAtBaseline;

    /**
     * <p>
     * The name used for a specific Performance Insights metric.
     * </p>
     * 
     * @param metricDisplayName
     *        The name used for a specific Performance Insights metric.
     */

    public void setMetricDisplayName(String metricDisplayName) {
        this.metricDisplayName = metricDisplayName;
    }

    /**
     * <p>
     * The name used for a specific Performance Insights metric.
     * </p>
     * 
     * @return The name used for a specific Performance Insights metric.
     */

    public String getMetricDisplayName() {
        return this.metricDisplayName;
    }

    /**
     * <p>
     * The name used for a specific Performance Insights metric.
     * </p>
     * 
     * @param metricDisplayName
     *        The name used for a specific Performance Insights metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withMetricDisplayName(String metricDisplayName) {
        setMetricDisplayName(metricDisplayName);
        return this;
    }

    /**
     * <p>
     * The unit of measure for a metric. For example, a session or a process.
     * </p>
     * 
     * @param unit
     *        The unit of measure for a metric. For example, a session or a process.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure for a metric. For example, a session or a process.
     * </p>
     * 
     * @return The unit of measure for a metric. For example, a session or a process.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure for a metric. For example, a session or a process.
     * </p>
     * 
     * @param unit
     *        The unit of measure for a metric. For example, a session or a process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * A single query to be processed for the metric. For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     * .
     * </p>
     * 
     * @param metricQuery
     *        A single query to be processed for the metric. For more information, see
     *        <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     *        .
     */

    public void setMetricQuery(PerformanceInsightsMetricQuery metricQuery) {
        this.metricQuery = metricQuery;
    }

    /**
     * <p>
     * A single query to be processed for the metric. For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     * .
     * </p>
     * 
     * @return A single query to be processed for the metric. For more information, see
     *         <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     *         .
     */

    public PerformanceInsightsMetricQuery getMetricQuery() {
        return this.metricQuery;
    }

    /**
     * <p>
     * A single query to be processed for the metric. For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     * .
     * </p>
     * 
     * @param metricQuery
     *        A single query to be processed for the metric. For more information, see
     *        <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsMetricQuery.html">PerformanceInsightsMetricQuery</a> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withMetricQuery(PerformanceInsightsMetricQuery metricQuery) {
        setMetricQuery(metricQuery);
        return this;
    }

    /**
     * <p>
     * For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     * .
     * </p>
     * 
     * @return For more information, see
     *         <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     *         .
     */

    public java.util.List<PerformanceInsightsReferenceData> getReferenceData() {
        return referenceData;
    }

    /**
     * <p>
     * For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     * .
     * </p>
     * 
     * @param referenceData
     *        For more information, see
     *        <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     *        .
     */

    public void setReferenceData(java.util.Collection<PerformanceInsightsReferenceData> referenceData) {
        if (referenceData == null) {
            this.referenceData = null;
            return;
        }

        this.referenceData = new java.util.ArrayList<PerformanceInsightsReferenceData>(referenceData);
    }

    /**
     * <p>
     * For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceData(java.util.Collection)} or {@link #withReferenceData(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceData
     *        For more information, see
     *        <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withReferenceData(PerformanceInsightsReferenceData... referenceData) {
        if (this.referenceData == null) {
            setReferenceData(new java.util.ArrayList<PerformanceInsightsReferenceData>(referenceData.length));
        }
        for (PerformanceInsightsReferenceData ele : referenceData) {
            this.referenceData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For more information, see
     * <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     * .
     * </p>
     * 
     * @param referenceData
     *        For more information, see
     *        <code> <a href="https://docs.aws.amazon.com/devops-guru/latest/APIReference/API_PerformanceInsightsReferenceData.html">PerformanceInsightsReferenceData</a> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withReferenceData(java.util.Collection<PerformanceInsightsReferenceData> referenceData) {
        setReferenceData(referenceData);
        return this;
    }

    /**
     * <p>
     * The metric statistics during the anomalous period detected by DevOps Guru;
     * </p>
     * 
     * @return The metric statistics during the anomalous period detected by DevOps Guru;
     */

    public java.util.List<PerformanceInsightsStat> getStatsAtAnomaly() {
        return statsAtAnomaly;
    }

    /**
     * <p>
     * The metric statistics during the anomalous period detected by DevOps Guru;
     * </p>
     * 
     * @param statsAtAnomaly
     *        The metric statistics during the anomalous period detected by DevOps Guru;
     */

    public void setStatsAtAnomaly(java.util.Collection<PerformanceInsightsStat> statsAtAnomaly) {
        if (statsAtAnomaly == null) {
            this.statsAtAnomaly = null;
            return;
        }

        this.statsAtAnomaly = new java.util.ArrayList<PerformanceInsightsStat>(statsAtAnomaly);
    }

    /**
     * <p>
     * The metric statistics during the anomalous period detected by DevOps Guru;
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatsAtAnomaly(java.util.Collection)} or {@link #withStatsAtAnomaly(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statsAtAnomaly
     *        The metric statistics during the anomalous period detected by DevOps Guru;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withStatsAtAnomaly(PerformanceInsightsStat... statsAtAnomaly) {
        if (this.statsAtAnomaly == null) {
            setStatsAtAnomaly(new java.util.ArrayList<PerformanceInsightsStat>(statsAtAnomaly.length));
        }
        for (PerformanceInsightsStat ele : statsAtAnomaly) {
            this.statsAtAnomaly.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric statistics during the anomalous period detected by DevOps Guru;
     * </p>
     * 
     * @param statsAtAnomaly
     *        The metric statistics during the anomalous period detected by DevOps Guru;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withStatsAtAnomaly(java.util.Collection<PerformanceInsightsStat> statsAtAnomaly) {
        setStatsAtAnomaly(statsAtAnomaly);
        return this;
    }

    /**
     * <p>
     * Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it compares them
     * to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * </p>
     * 
     * @return Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it
     *         compares them to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     */

    public java.util.List<PerformanceInsightsStat> getStatsAtBaseline() {
        return statsAtBaseline;
    }

    /**
     * <p>
     * Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it compares them
     * to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * </p>
     * 
     * @param statsAtBaseline
     *        Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it
     *        compares them to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     */

    public void setStatsAtBaseline(java.util.Collection<PerformanceInsightsStat> statsAtBaseline) {
        if (statsAtBaseline == null) {
            this.statsAtBaseline = null;
            return;
        }

        this.statsAtBaseline = new java.util.ArrayList<PerformanceInsightsStat>(statsAtBaseline);
    }

    /**
     * <p>
     * Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it compares them
     * to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatsAtBaseline(java.util.Collection)} or {@link #withStatsAtBaseline(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param statsAtBaseline
     *        Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it
     *        compares them to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withStatsAtBaseline(PerformanceInsightsStat... statsAtBaseline) {
        if (this.statsAtBaseline == null) {
            setStatsAtBaseline(new java.util.ArrayList<PerformanceInsightsStat>(statsAtBaseline.length));
        }
        for (PerformanceInsightsStat ele : statsAtBaseline) {
            this.statsAtBaseline.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it compares them
     * to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * </p>
     * 
     * @param statsAtBaseline
     *        Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it
     *        compares them to <code>StatsAtBaseline</code> to help determine if they are anomalous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricsDetail withStatsAtBaseline(java.util.Collection<PerformanceInsightsStat> statsAtBaseline) {
        setStatsAtBaseline(statsAtBaseline);
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
        if (getMetricDisplayName() != null)
            sb.append("MetricDisplayName: ").append(getMetricDisplayName()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getMetricQuery() != null)
            sb.append("MetricQuery: ").append(getMetricQuery()).append(",");
        if (getReferenceData() != null)
            sb.append("ReferenceData: ").append(getReferenceData()).append(",");
        if (getStatsAtAnomaly() != null)
            sb.append("StatsAtAnomaly: ").append(getStatsAtAnomaly()).append(",");
        if (getStatsAtBaseline() != null)
            sb.append("StatsAtBaseline: ").append(getStatsAtBaseline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceInsightsMetricsDetail == false)
            return false;
        PerformanceInsightsMetricsDetail other = (PerformanceInsightsMetricsDetail) obj;
        if (other.getMetricDisplayName() == null ^ this.getMetricDisplayName() == null)
            return false;
        if (other.getMetricDisplayName() != null && other.getMetricDisplayName().equals(this.getMetricDisplayName()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getMetricQuery() == null ^ this.getMetricQuery() == null)
            return false;
        if (other.getMetricQuery() != null && other.getMetricQuery().equals(this.getMetricQuery()) == false)
            return false;
        if (other.getReferenceData() == null ^ this.getReferenceData() == null)
            return false;
        if (other.getReferenceData() != null && other.getReferenceData().equals(this.getReferenceData()) == false)
            return false;
        if (other.getStatsAtAnomaly() == null ^ this.getStatsAtAnomaly() == null)
            return false;
        if (other.getStatsAtAnomaly() != null && other.getStatsAtAnomaly().equals(this.getStatsAtAnomaly()) == false)
            return false;
        if (other.getStatsAtBaseline() == null ^ this.getStatsAtBaseline() == null)
            return false;
        if (other.getStatsAtBaseline() != null && other.getStatsAtBaseline().equals(this.getStatsAtBaseline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricDisplayName() == null) ? 0 : getMetricDisplayName().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getMetricQuery() == null) ? 0 : getMetricQuery().hashCode());
        hashCode = prime * hashCode + ((getReferenceData() == null) ? 0 : getReferenceData().hashCode());
        hashCode = prime * hashCode + ((getStatsAtAnomaly() == null) ? 0 : getStatsAtAnomaly().hashCode());
        hashCode = prime * hashCode + ((getStatsAtBaseline() == null) ? 0 : getStatsAtBaseline().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceInsightsMetricsDetail clone() {
        try {
            return (PerformanceInsightsMetricsDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.PerformanceInsightsMetricsDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
