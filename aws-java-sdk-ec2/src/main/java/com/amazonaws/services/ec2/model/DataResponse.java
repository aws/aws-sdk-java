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
 * The response to a <code>DataQuery</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DataResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The ID passed in the <code>DataQuery</code>.
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
     * The Region or Availability Zone that's the destination for the data query. For example, <code>eu-west-1</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The metric used for the network performance request. Currently only <code>aggregate-latency</code> is supported,
     * showing network latency during a specified period.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The statistic used for the network performance request.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The period used for the network performance request.
     * </p>
     */
    private String period;
    /**
     * <p>
     * A list of <code>MetricPoint</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricPoint> metricPoints;

    /**
     * <p>
     * The ID passed in the <code>DataQuery</code>.
     * </p>
     * 
     * @param id
     *        The ID passed in the <code>DataQuery</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID passed in the <code>DataQuery</code>.
     * </p>
     * 
     * @return The ID passed in the <code>DataQuery</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID passed in the <code>DataQuery</code>.
     * </p>
     * 
     * @param id
     *        The ID passed in the <code>DataQuery</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResponse withId(String id) {
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

    public DataResponse withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the destination for the data query. For example, <code>eu-west-1</code>.
     * </p>
     * 
     * @param destination
     *        The Region or Availability Zone that's the destination for the data query. For example,
     *        <code>eu-west-1</code>.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the destination for the data query. For example, <code>eu-west-1</code>.
     * </p>
     * 
     * @return The Region or Availability Zone that's the destination for the data query. For example,
     *         <code>eu-west-1</code>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Region or Availability Zone that's the destination for the data query. For example, <code>eu-west-1</code>.
     * </p>
     * 
     * @param destination
     *        The Region or Availability Zone that's the destination for the data query. For example,
     *        <code>eu-west-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResponse withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The metric used for the network performance request. Currently only <code>aggregate-latency</code> is supported,
     * showing network latency during a specified period.
     * </p>
     * 
     * @param metric
     *        The metric used for the network performance request. Currently only <code>aggregate-latency</code> is
     *        supported, showing network latency during a specified period.
     * @see MetricType
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric used for the network performance request. Currently only <code>aggregate-latency</code> is supported,
     * showing network latency during a specified period.
     * </p>
     * 
     * @return The metric used for the network performance request. Currently only <code>aggregate-latency</code> is
     *         supported, showing network latency during a specified period.
     * @see MetricType
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric used for the network performance request. Currently only <code>aggregate-latency</code> is supported,
     * showing network latency during a specified period.
     * </p>
     * 
     * @param metric
     *        The metric used for the network performance request. Currently only <code>aggregate-latency</code> is
     *        supported, showing network latency during a specified period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public DataResponse withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The metric used for the network performance request. Currently only <code>aggregate-latency</code> is supported,
     * showing network latency during a specified period.
     * </p>
     * 
     * @param metric
     *        The metric used for the network performance request. Currently only <code>aggregate-latency</code> is
     *        supported, showing network latency during a specified period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public DataResponse withMetric(MetricType metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * The statistic used for the network performance request.
     * </p>
     * 
     * @param statistic
     *        The statistic used for the network performance request.
     * @see StatisticType
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic used for the network performance request.
     * </p>
     * 
     * @return The statistic used for the network performance request.
     * @see StatisticType
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic used for the network performance request.
     * </p>
     * 
     * @param statistic
     *        The statistic used for the network performance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticType
     */

    public DataResponse withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic used for the network performance request.
     * </p>
     * 
     * @param statistic
     *        The statistic used for the network performance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticType
     */

    public DataResponse withStatistic(StatisticType statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The period used for the network performance request.
     * </p>
     * 
     * @param period
     *        The period used for the network performance request.
     * @see PeriodType
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The period used for the network performance request.
     * </p>
     * 
     * @return The period used for the network performance request.
     * @see PeriodType
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period used for the network performance request.
     * </p>
     * 
     * @param period
     *        The period used for the network performance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodType
     */

    public DataResponse withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The period used for the network performance request.
     * </p>
     * 
     * @param period
     *        The period used for the network performance request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeriodType
     */

    public DataResponse withPeriod(PeriodType period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricPoint</code> objects.
     * </p>
     * 
     * @return A list of <code>MetricPoint</code> objects.
     */

    public java.util.List<MetricPoint> getMetricPoints() {
        if (metricPoints == null) {
            metricPoints = new com.amazonaws.internal.SdkInternalList<MetricPoint>();
        }
        return metricPoints;
    }

    /**
     * <p>
     * A list of <code>MetricPoint</code> objects.
     * </p>
     * 
     * @param metricPoints
     *        A list of <code>MetricPoint</code> objects.
     */

    public void setMetricPoints(java.util.Collection<MetricPoint> metricPoints) {
        if (metricPoints == null) {
            this.metricPoints = null;
            return;
        }

        this.metricPoints = new com.amazonaws.internal.SdkInternalList<MetricPoint>(metricPoints);
    }

    /**
     * <p>
     * A list of <code>MetricPoint</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricPoints(java.util.Collection)} or {@link #withMetricPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricPoints
     *        A list of <code>MetricPoint</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResponse withMetricPoints(MetricPoint... metricPoints) {
        if (this.metricPoints == null) {
            setMetricPoints(new com.amazonaws.internal.SdkInternalList<MetricPoint>(metricPoints.length));
        }
        for (MetricPoint ele : metricPoints) {
            this.metricPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricPoint</code> objects.
     * </p>
     * 
     * @param metricPoints
     *        A list of <code>MetricPoint</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResponse withMetricPoints(java.util.Collection<MetricPoint> metricPoints) {
        setMetricPoints(metricPoints);
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
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getMetricPoints() != null)
            sb.append("MetricPoints: ").append(getMetricPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataResponse == false)
            return false;
        DataResponse other = (DataResponse) obj;
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
        if (other.getMetricPoints() == null ^ this.getMetricPoints() == null)
            return false;
        if (other.getMetricPoints() != null && other.getMetricPoints().equals(this.getMetricPoints()) == false)
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
        hashCode = prime * hashCode + ((getMetricPoints() == null) ? 0 : getMetricPoints().hashCode());
        return hashCode;
    }

    @Override
    public DataResponse clone() {
        try {
            return (DataResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
