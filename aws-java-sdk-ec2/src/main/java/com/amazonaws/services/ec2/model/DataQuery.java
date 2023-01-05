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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A query used for retrieving network health data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DataQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQuery implements Serializable, Cloneable {

    /**
     * <p>
     * A user-defined ID associated with a data query that's returned in the <code>dataResponse</code> identifying the
     * query. For example, if you set the Id to <code>MyQuery01</code>in the query, the <code>dataResponse</code>
     * identifies the query as <code>MyQuery01</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The Region or Availability Zone that's the target for the data query. For example, <code>eu-north-1</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is supported,
     * indicating network latency.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     * Performance statistics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For example, a
     * metric of <code>five_minutes</code> is the median of all the data points gathered within those five minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String statistic;
    /**
     * <p>
     * The aggregation period used for the data query.
     * </p>
     */
    private String period;

    /**
     * <p>
     * A user-defined ID associated with a data query that's returned in the <code>dataResponse</code> identifying the
     * query. For example, if you set the Id to <code>MyQuery01</code>in the query, the <code>dataResponse</code>
     * identifies the query as <code>MyQuery01</code>.
     * </p>
     * 
     * @param id
     *        A user-defined ID associated with a data query that's returned in the <code>dataResponse</code>
     *        identifying the query. For example, if you set the Id to <code>MyQuery01</code>in the query, the
     *        <code>dataResponse</code> identifies the query as <code>MyQuery01</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A user-defined ID associated with a data query that's returned in the <code>dataResponse</code> identifying the
     * query. For example, if you set the Id to <code>MyQuery01</code>in the query, the <code>dataResponse</code>
     * identifies the query as <code>MyQuery01</code>.
     * </p>
     * 
     * @return A user-defined ID associated with a data query that's returned in the <code>dataResponse</code>
     *         identifying the query. For example, if you set the Id to <code>MyQuery01</code>in the query, the
     *         <code>dataResponse</code> identifies the query as <code>MyQuery01</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A user-defined ID associated with a data query that's returned in the <code>dataResponse</code> identifying the
     * query. For example, if you set the Id to <code>MyQuery01</code>in the query, the <code>dataResponse</code>
     * identifies the query as <code>MyQuery01</code>.
     * </p>
     * 
     * @param id
     *        A user-defined ID associated with a data query that's returned in the <code>dataResponse</code>
     *        identifying the query. For example, if you set the Id to <code>MyQuery01</code>in the query, the
     *        <code>dataResponse</code> identifies the query as <code>MyQuery01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>.
     * </p>
     * 
     * @param source
     *        The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>.
     * </p>
     * 
     * @return The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>
     *         .
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>.
     * </p>
     * 
     * @param source
     *        The Region or Availability Zone that's the source for the data query. For example, <code>us-east-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the target for the data query. For example, <code>eu-north-1</code>.
     * </p>
     * 
     * @param destination
     *        The Region or Availability Zone that's the target for the data query. For example, <code>eu-north-1</code>
     *        .
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the target for the data query. For example, <code>eu-north-1</code>.
     * </p>
     * 
     * @return The Region or Availability Zone that's the target for the data query. For example,
     *         <code>eu-north-1</code>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the target for the data query. For example, <code>eu-north-1</code>.
     * </p>
     * 
     * @param destination
     *        The Region or Availability Zone that's the target for the data query. For example, <code>eu-north-1</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is supported,
     * indicating network latency.
     * </p>
     * 
     * @param metric
     *        The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is
     *        supported, indicating network latency.
     * @see MetricType
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is supported,
     * indicating network latency.
     * </p>
     * 
     * @return The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is
     *         supported, indicating network latency.
     * @see MetricType
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is supported,
     * indicating network latency.
     * </p>
     * 
     * @param metric
     *        The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is
     *        supported, indicating network latency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public DataQuery withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is supported,
     * indicating network latency.
     * </p>
     * 
     * @param metric
     *        The aggregation metric used for the data query. Currently only <code>aggregation-latency</code> is
     *        supported, indicating network latency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public DataQuery withMetric(MetricType metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     * Performance statistics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For example, a
     * metric of <code>five_minutes</code> is the median of all the data points gathered within those five minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     *        Performance statistics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For
     *        example, a metric of <code>five_minutes</code> is the median of all the data points gathered within those
     *        five minutes.
     *        </p>
     *        </li>
     * @see StatisticType
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     * Performance statistics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For example, a
     * metric of <code>five_minutes</code> is the median of all the data points gathered within those five minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     *         Performance statistics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For
     *         example, a metric of <code>five_minutes</code> is the median of all the data points gathered within those
     *         five minutes.
     *         </p>
     *         </li>
     * @see StatisticType
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     * Performance statistics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For example, a
     * metric of <code>five_minutes</code> is the median of all the data points gathered within those five minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     *        Performance statistics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For
     *        example, a metric of <code>five_minutes</code> is the median of all the data points gathered within those
     *        five minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticType
     */

    public DataQuery withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     * Performance statistics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For example, a
     * metric of <code>five_minutes</code> is the median of all the data points gathered within those five minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        Metric data aggregations over specified periods of time. The following are the supported Infrastructure
     *        Performance statistics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>p50</code> - The median value of the metric aggregated over a specified start and end time. For
     *        example, a metric of <code>five_minutes</code> is the median of all the data points gathered within those
     *        five minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticType
     */

    public DataQuery withStatistic(StatisticType statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation period used for the data query.
     * </p>
     * 
     * @param period
     *        The aggregation period used for the data query.
     * @see PeriodType
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The aggregation period used for the data query.
     * </p>
     * 
     * @return The aggregation period used for the data query.
     * @see PeriodType
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The aggregation period used for the data query.
     * </p>
     * 
     * @param period
     *        The aggregation period used for the data query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodType
     */

    public DataQuery withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The aggregation period used for the data query.
     * </p>
     * 
     * @param period
     *        The aggregation period used for the data query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodType
     */

    public DataQuery withPeriod(PeriodType period) {
        this.period = period.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQuery == false)
            return false;
        DataQuery other = (DataQuery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        return hashCode;
    }

    @Override
    public DataQuery clone() {
        try {
            return (DataQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
