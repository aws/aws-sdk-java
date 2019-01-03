/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single query to be processed. You must provide the metric to query. If no other parameters are specified,
 * Performance Insights returns all of the data points for that metric. You can optionally request that the data points
 * be aggregated by dimension group ( <code>GroupBy</code>), and return only those data points that match your criteria
 * (<code>Filter</code>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/MetricQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
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
     */
    private String metric;
    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     */
    private DimensionGroup groupBy;
    /**
     * <p>
     * One or more filters to apply in the request. Restrictions:
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
     * The name of a Performance Insights metric to be measured.
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
     * 
     * @param metric
     *        The name of a Performance Insights metric to be measured.</p>
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
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
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
     * 
     * @return The name of a Performance Insights metric to be measured.</p>
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
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
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
     * 
     * @param metric
     *        The name of a Performance Insights metric to be measured.</p>
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQuery withMetric(String metric) {
        setMetric(metric);
        return this;
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
     */

    public void setGroupBy(DimensionGroup groupBy) {
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

    public DimensionGroup getGroupBy() {
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

    public MetricQuery withGroupBy(DimensionGroup groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * One or more filters to apply in the request. Restrictions:
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
     * @return One or more filters to apply in the request. Restrictions:</p>
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
     * One or more filters to apply in the request. Restrictions:
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
     *        One or more filters to apply in the request. Restrictions:</p>
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
     * One or more filters to apply in the request. Restrictions:
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
     *        One or more filters to apply in the request. Restrictions:</p>
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

    public MetricQuery withFilter(java.util.Map<String, String> filter) {
        setFilter(filter);
        return this;
    }

    public MetricQuery addFilterEntry(String key, String value) {
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

    public MetricQuery clearFilterEntries() {
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

        if (obj instanceof MetricQuery == false)
            return false;
        MetricQuery other = (MetricQuery) obj;
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
    public MetricQuery clone() {
        try {
            return (MetricQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.MetricQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
