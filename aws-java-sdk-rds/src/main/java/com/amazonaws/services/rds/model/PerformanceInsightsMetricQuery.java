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
 * A single Performance Insights metric query to process. You must provide the metric to the query. If other parameters
 * aren't specified, Performance Insights returns all data points for the specified metric. Optionally, you can request
 * the data points to be aggregated by dimension group (<code>GroupBy</code>) and return only those data points that
 * match your criteria (<code>Filter</code>).
 * </p>
 * <p>
 * Constraints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Must be a valid Performance Insights query.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PerformanceInsightsMetricQuery" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetricQuery implements Serializable, Cloneable {

    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     */
    private PerformanceInsightsMetricDimensionGroup groupBy;
    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * The counter metrics listed in <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     * >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     * 
     * @param groupBy
     *        A specification for how to aggregate the data points from a query result. You must specify a valid
     *        dimension group. Performance Insights will return all of the dimensions within that group, unless you
     *        provide the names of specific dimensions within that group. You can also request that Performance Insights
     *        return a limited number of values for a dimension.
     */

    public void setGroupBy(PerformanceInsightsMetricDimensionGroup groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     * 
     * @return A specification for how to aggregate the data points from a query result. You must specify a valid
     *         dimension group. Performance Insights will return all of the dimensions within that group, unless you
     *         provide the names of specific dimensions within that group. You can also request that Performance
     *         Insights return a limited number of values for a dimension.
     */

    public PerformanceInsightsMetricDimensionGroup getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     * 
     * @param groupBy
     *        A specification for how to aggregate the data points from a query result. You must specify a valid
     *        dimension group. Performance Insights will return all of the dimensions within that group, unless you
     *        provide the names of specific dimensions within that group. You can also request that Performance Insights
     *        return a limited number of values for a dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetricQuery withGroupBy(PerformanceInsightsMetricDimensionGroup groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * The counter metrics listed in <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     * >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
     *        The name of a Performance Insights metric to be measured.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The counter metrics listed in <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     *        >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * The counter metrics listed in <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     * >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
     * @return The name of a Performance Insights metric to be measured.</p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database
     *         engine.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The counter metrics listed in <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     *         >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * The counter metrics listed in <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     * >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
     *        The name of a Performance Insights metric to be measured.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - A scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - The raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The counter metrics listed in <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights_Counters.html#USER_PerfInsights_Counters.OS"
     *        >Performance Insights operating system counters</a> in the <i>Amazon Aurora User Guide</i>.
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
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric());
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
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
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

}
