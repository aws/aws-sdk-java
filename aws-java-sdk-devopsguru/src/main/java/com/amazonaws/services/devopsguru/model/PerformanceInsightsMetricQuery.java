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
 * A single query to be processed. Use these parameters to query the Performance Insights
 * <code>GetResourceMetrics</code> API to retrieve the metrics for an anomaly. For more information, see
 * <code> <a href="https://docs.aws.amazon.com/performance-insights/latest/APIReference/API_GetResourceMetrics.html">GetResourceMetrics</a> </code>
 * in the <i>Amazon RDS Performance Insights API Reference</i>.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PerformanceInsightsMetricQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetricQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code> API for
     * anomaly metrics.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the number of active sessions is less than an internal Performance Insights threshold,
     * <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active sessions
     * is greater than the internal threshold, Performance Insights samples the active sessions, with
     * <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw values, and
     * <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you can query
     * <code>db.load.avg</code> only.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The specification for how to aggregate the data points from a Performance Insights
     * <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions within
     * that group, unless you provide the names of specific dimensions within that group. You can also request that
     * Performance Insights return a limited number of values for a dimension.
     * </p>
     */
    private PerformanceInsightsMetricDimensionGroup groupBy;
    /**
     * <p>
     * One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> filter;

    /**
     * <p>
     * The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code> API for
     * anomaly metrics.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the number of active sessions is less than an internal Performance Insights threshold,
     * <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active sessions
     * is greater than the internal threshold, Performance Insights samples the active sessions, with
     * <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw values, and
     * <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you can query
     * <code>db.load.avg</code> only.
     * </p>
     * 
     * @param metric
     *        The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code>
     *        API for anomaly metrics.</p>
     *        <p>
     *        Valid values for <code>Metric</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the number of active sessions is less than an internal Performance Insights threshold,
     *        <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active
     *        sessions is greater than the internal threshold, Performance Insights samples the active sessions, with
     *        <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw
     *        values, and <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you
     *        can query <code>db.load.avg</code> only.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code> API for
     * anomaly metrics.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the number of active sessions is less than an internal Performance Insights threshold,
     * <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active sessions
     * is greater than the internal threshold, Performance Insights samples the active sessions, with
     * <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw values, and
     * <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you can query
     * <code>db.load.avg</code> only.
     * </p>
     * 
     * @return The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code>
     *         API for anomaly metrics.</p>
     *         <p>
     *         Valid values for <code>Metric</code> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *         engine.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the number of active sessions is less than an internal Performance Insights threshold,
     *         <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active
     *         sessions is greater than the internal threshold, Performance Insights samples the active sessions, with
     *         <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw
     *         values, and <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you
     *         can query <code>db.load.avg</code> only.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code> API for
     * anomaly metrics.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the number of active sessions is less than an internal Performance Insights threshold,
     * <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active sessions
     * is greater than the internal threshold, Performance Insights samples the active sessions, with
     * <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw values, and
     * <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you can query
     * <code>db.load.avg</code> only.
     * </p>
     * 
     * @param metric
     *        The name of the meteric used used when querying an Performance Insights <code>GetResourceMetrics</code>
     *        API for anomaly metrics.</p>
     *        <p>
     *        Valid values for <code>Metric</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the number of active sessions is less than an internal Performance Insights threshold,
     *        <code>db.load.avg</code> and <code>db.sampledload.avg</code> are the same value. If the number of active
     *        sessions is greater than the internal threshold, Performance Insights samples the active sessions, with
     *        <code>db.load.avg</code> showing the scaled values, <code>db.sampledload.avg</code> showing the raw
     *        values, and <code>db.sampledload.avg</code> less than <code>db.load.avg</code>. For most use cases, you
     *        can query <code>db.load.avg</code> only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricQuery withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The specification for how to aggregate the data points from a Performance Insights
     * <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions within
     * that group, unless you provide the names of specific dimensions within that group. You can also request that
     * Performance Insights return a limited number of values for a dimension.
     * </p>
     * 
     * @param groupBy
     *        The specification for how to aggregate the data points from a Performance Insights
     *        <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions
     *        within that group, unless you provide the names of specific dimensions within that group. You can also
     *        request that Performance Insights return a limited number of values for a dimension.
     */

    public void setGroupBy(PerformanceInsightsMetricDimensionGroup groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * The specification for how to aggregate the data points from a Performance Insights
     * <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions within
     * that group, unless you provide the names of specific dimensions within that group. You can also request that
     * Performance Insights return a limited number of values for a dimension.
     * </p>
     * 
     * @return The specification for how to aggregate the data points from a Performance Insights
     *         <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions
     *         within that group, unless you provide the names of specific dimensions within that group. You can also
     *         request that Performance Insights return a limited number of values for a dimension.
     */

    public PerformanceInsightsMetricDimensionGroup getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * The specification for how to aggregate the data points from a Performance Insights
     * <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions within
     * that group, unless you provide the names of specific dimensions within that group. You can also request that
     * Performance Insights return a limited number of values for a dimension.
     * </p>
     * 
     * @param groupBy
     *        The specification for how to aggregate the data points from a Performance Insights
     *        <code>GetResourceMetrics</code> API query. The Performance Insights query returns all of the dimensions
     *        within that group, unless you provide the names of specific dimensions within that group. You can also
     *        request that Performance Insights return a limited number of values for a dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricQuery withGroupBy(PerformanceInsightsMetricDimensionGroup groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query.
     *         Restrictions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A single filter for any other dimension in this dimension group.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getFilter() {
        return filter;
    }

    /**
     * <p>
     * One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query.
     *        Restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single filter for any other dimension in this dimension group.
     *        </p>
     *        </li>
     */

    public void setFilter(java.util.Map<String, String> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters to apply to a Performance Insights <code>GetResourceMetrics</code> API query.
     *        Restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any number of filters by the same dimension, as specified in the <code>GroupBy</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single filter for any other dimension in this dimension group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricQuery withFilter(java.util.Map<String, String> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Add a single Filter entry
     *
     * @see PerformanceInsightsMetricQuery#withFilter
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricQuery addFilterEntry(String key, String value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, String>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricQuery clearFilterEntries() {
        this.filter = null;
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceInsightsMetricQuery == false)
            return false;
        PerformanceInsightsMetricQuery other = (PerformanceInsightsMetricQuery) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceInsightsMetricQuery clone() {
        try {
            return (PerformanceInsightsMetricQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.PerformanceInsightsMetricQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
