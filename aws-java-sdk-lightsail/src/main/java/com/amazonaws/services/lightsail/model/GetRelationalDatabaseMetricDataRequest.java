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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your database from which to get metric data.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The name of the metric data to return.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The start of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The array of statistics for your metric data request.
     * </p>
     */
    private java.util.List<String> statistics;

    /**
     * <p>
     * The name of your database from which to get metric data.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database from which to get metric data.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database from which to get metric data.
     * </p>
     * 
     * @return The name of your database from which to get metric data.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database from which to get metric data.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database from which to get metric data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseMetricDataRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the metric data to return.
     * </p>
     * 
     * @param metricName
     *        The name of the metric data to return.
     * @see RelationalDatabaseMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric data to return.
     * </p>
     * 
     * @return The name of the metric data to return.
     * @see RelationalDatabaseMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric data to return.
     * </p>
     * 
     * @param metricName
     *        The name of the metric data to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabaseMetricName
     */

    public GetRelationalDatabaseMetricDataRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the metric data to return.
     * </p>
     * 
     * @param metricName
     *        The name of the metric data to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabaseMetricName
     */

    public GetRelationalDatabaseMetricDataRequest withMetricName(RelationalDatabaseMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * 
     * @return The granularity, in seconds, of the returned data points.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseMetricDataRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The start of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTime
     *        The start of the time interval from which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The start of the time interval from which to get metric data.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     *         <code>1538424000</code> as the start time.
     *         </p>
     *         </li>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTime
     *        The start of the time interval from which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTime
     *        The end of the time interval from which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the end time.
     *        </p>
     *        </li>
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The end of the time interval from which to get metric data.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     *         <code>1538424000</code> as the end time.
     *         </p>
     *         </li>
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval from which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endTime
     *        The end of the time interval from which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the end time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.
     * @see MetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * 
     * @return The unit for the metric data request.
     * @see MetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetRelationalDatabaseMetricDataRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetRelationalDatabaseMetricDataRequest withUnit(MetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The array of statistics for your metric data request.
     * </p>
     * 
     * @return The array of statistics for your metric data request.
     * @see MetricStatistic
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The array of statistics for your metric data request.
     * </p>
     * 
     * @param statistics
     *        The array of statistics for your metric data request.
     * @see MetricStatistic
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * The array of statistics for your metric data request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        The array of statistics for your metric data request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetRelationalDatabaseMetricDataRequest withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new java.util.ArrayList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of statistics for your metric data request.
     * </p>
     * 
     * @param statistics
     *        The array of statistics for your metric data request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetRelationalDatabaseMetricDataRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The array of statistics for your metric data request.
     * </p>
     * 
     * @param statistics
     *        The array of statistics for your metric data request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetRelationalDatabaseMetricDataRequest withStatistics(MetricStatistic... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (MetricStatistic value : statistics) {
            statisticsCopy.add(value.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseMetricDataRequest == false)
            return false;
        GetRelationalDatabaseMetricDataRequest other = (GetRelationalDatabaseMetricDataRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseMetricDataRequest clone() {
        return (GetRelationalDatabaseMetricDataRequest) super.clone();
    }

}
