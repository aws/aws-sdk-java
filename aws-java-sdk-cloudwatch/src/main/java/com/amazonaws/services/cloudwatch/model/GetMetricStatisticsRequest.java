/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the inputs for GetMetricStatistics.
 * </p>
 */
public class GetMetricStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the metric, with or without spaces.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The value specified is inclusive; results
     * include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note>
     * <p>
     * The specified start time is rounded down to the nearest value. Datapoints are returned for start times up to two
     * weeks in the past. Specified start times that are more than two weeks in the past will not return datapoints for
     * metrics that are older than two weeks.
     * </p>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available from
     * submission time using <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The value specified is exclusive; results
     * will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one minute (60
     * seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default value is 60.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The metric statistics to return. For information about specific statistics returned by GetMetricStatistics, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic">
     * Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> statistics;
    /**
     * <p>
     * The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     * all units being returned. If the metric only ever reports one unit, specifying a unit will have no effect.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The namespace of the metric, with or without spaces.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric, with or without spaces.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric, with or without spaces.
     * </p>
     * 
     * @return The namespace of the metric, with or without spaces.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric, with or without spaces.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric, with or without spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * 
     * @param metricName
     *        The name of the metric, with or without spaces.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * 
     * @return The name of the metric, with or without spaces.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * 
     * @param metricName
     *        The name of the metric, with or without spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     * 
     * @return A list of dimensions describing qualities of the metric.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     * 
     * @param dimensions
     *        A list of dimensions describing qualities of the metric.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions);
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        A list of dimensions describing qualities of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     * 
     * @param dimensions
     *        A list of dimensions describing qualities of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The value specified is inclusive; results
     * include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note>
     * <p>
     * The specified start time is rounded down to the nearest value. Datapoints are returned for start times up to two
     * weeks in the past. Specified start times that are more than two weeks in the past will not return datapoints for
     * metrics that are older than two weeks.
     * </p>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available from
     * submission time using <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     * 
     * @param startTime
     *        The time stamp to use for determining the first datapoint to return. The value specified is inclusive;
     *        results include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format
     *        (e.g., 2014-09-03T23:00:00Z).</p> <note>
     *        <p>
     *        The specified start time is rounded down to the nearest value. Datapoints are returned for start times up
     *        to two weeks in the past. Specified start times that are more than two weeks in the past will not return
     *        datapoints for metrics that are older than two weeks.
     *        </p>
     *        <p>
     *        Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available
     *        from submission time using <code>GetMetricStatistics</code>.
     *        </p>
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The value specified is inclusive; results
     * include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note>
     * <p>
     * The specified start time is rounded down to the nearest value. Datapoints are returned for start times up to two
     * weeks in the past. Specified start times that are more than two weeks in the past will not return datapoints for
     * metrics that are older than two weeks.
     * </p>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available from
     * submission time using <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     * 
     * @return The time stamp to use for determining the first datapoint to return. The value specified is inclusive;
     *         results include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format
     *         (e.g., 2014-09-03T23:00:00Z).</p> <note>
     *         <p>
     *         The specified start time is rounded down to the nearest value. Datapoints are returned for start times up
     *         to two weeks in the past. Specified start times that are more than two weeks in the past will not return
     *         datapoints for metrics that are older than two weeks.
     *         </p>
     *         <p>
     *         Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available
     *         from submission time using <code>GetMetricStatistics</code>.
     *         </p>
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The value specified is inclusive; results
     * include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note>
     * <p>
     * The specified start time is rounded down to the nearest value. Datapoints are returned for start times up to two
     * weeks in the past. Specified start times that are more than two weeks in the past will not return datapoints for
     * metrics that are older than two weeks.
     * </p>
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available from
     * submission time using <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     * 
     * @param startTime
     *        The time stamp to use for determining the first datapoint to return. The value specified is inclusive;
     *        results include datapoints with the time stamp specified. The time stamp must be in ISO 8601 UTC format
     *        (e.g., 2014-09-03T23:00:00Z).</p> <note>
     *        <p>
     *        The specified start time is rounded down to the nearest value. Datapoints are returned for start times up
     *        to two weeks in the past. Specified start times that are more than two weeks in the past will not return
     *        datapoints for metrics that are older than two weeks.
     *        </p>
     *        <p>
     *        Data that is timestamped 24 hours or more in the past may take in excess of 48 hours to become available
     *        from submission time using <code>GetMetricStatistics</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The value specified is exclusive; results
     * will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * 
     * @param endTime
     *        The time stamp to use for determining the last datapoint to return. The value specified is exclusive;
     *        results will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC
     *        format (e.g., 2014-09-03T23:00:00Z).
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The value specified is exclusive; results
     * will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * 
     * @return The time stamp to use for determining the last datapoint to return. The value specified is exclusive;
     *         results will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC
     *         format (e.g., 2014-09-03T23:00:00Z).
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The value specified is exclusive; results
     * will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * 
     * @param endTime
     *        The time stamp to use for determining the last datapoint to return. The value specified is exclusive;
     *        results will include datapoints up to the time stamp specified. The time stamp must be in ISO 8601 UTC
     *        format (e.g., 2014-09-03T23:00:00Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one minute (60
     * seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default value is 60.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one
     *        minute (60 seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default
     *        value is 60.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one minute (60
     * seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default value is 60.
     * </p>
     * 
     * @return The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one
     *         minute (60 seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default
     *         value is 60.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one minute (60
     * seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default value is 60.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned datapoints. A <code>Period</code> can be as short as one
     *        minute (60 seconds) or as long as one day (86,400 seconds), and must be a multiple of 60. The default
     *        value is 60.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific statistics returned by GetMetricStatistics, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic">
     * Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * 
     * @return The metric statistics to return. For information about specific statistics returned by
     *         GetMetricStatistics, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *         >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * @see Statistic
     */

    public java.util.List<String> getStatistics() {
        if (statistics == null) {
            statistics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return statistics;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific statistics returned by GetMetricStatistics, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic">
     * Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * 
     * @param statistics
     *        The metric statistics to return. For information about specific statistics returned by
     *        GetMetricStatistics, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *        >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * @see Statistic
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new com.amazonaws.internal.SdkInternalList<String>(statistics);
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific statistics returned by GetMetricStatistics, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic">
     * Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        The metric statistics to return. For information about specific statistics returned by
     *        GetMetricStatistics, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *        >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public GetMetricStatisticsRequest withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new com.amazonaws.internal.SdkInternalList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific statistics returned by GetMetricStatistics, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic">
     * Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * 
     * @param statistics
     *        The metric statistics to return. For information about specific statistics returned by
     *        GetMetricStatistics, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *        >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public GetMetricStatisticsRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific statistics returned by GetMetricStatistics, see
     * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic">
     * Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * 
     * @param statistics
     *        The metric statistics to return. For information about specific statistics returned by
     *        GetMetricStatistics, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *        >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public GetMetricStatisticsRequest withStatistics(Statistic... statistics) {
        com.amazonaws.internal.SdkInternalList<String> statisticsCopy = new com.amazonaws.internal.SdkInternalList<String>(statistics.length);
        for (Statistic value : statistics) {
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
     * <p>
     * The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     * all units being returned. If the metric only ever reports one unit, specifying a unit will have no effect.
     * </p>
     * 
     * @param unit
     *        The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit
     *        results in all units being returned. If the metric only ever reports one unit, specifying a unit will have
     *        no effect.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     * all units being returned. If the metric only ever reports one unit, specifying a unit will have no effect.
     * </p>
     * 
     * @return The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit
     *         results in all units being returned. If the metric only ever reports one unit, specifying a unit will
     *         have no effect.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     * all units being returned. If the metric only ever reports one unit, specifying a unit will have no effect.
     * </p>
     * 
     * @param unit
     *        The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit
     *        results in all units being returned. If the metric only ever reports one unit, specifying a unit will have
     *        no effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public GetMetricStatisticsRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     * all units being returned. If the metric only ever reports one unit, specifying a unit will have no effect.
     * </p>
     * 
     * @param unit
     *        The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit
     *        results in all units being returned. If the metric only ever reports one unit, specifying a unit will have
     *        no effect.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     * all units being returned. If the metric only ever reports one unit, specifying a unit will have no effect.
     * </p>
     * 
     * @param unit
     *        The specific unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit
     *        results in all units being returned. If the metric only ever reports one unit, specifying a unit will have
     *        no effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public GetMetricStatisticsRequest withUnit(StandardUnit unit) {
        setUnit(unit);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getStatistics() != null)
            sb.append("Statistics: " + getStatistics() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricStatisticsRequest == false)
            return false;
        GetMetricStatisticsRequest other = (GetMetricStatisticsRequest) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricStatisticsRequest clone() {
        return (GetMetricStatisticsRequest) super.clone();
    }
}
