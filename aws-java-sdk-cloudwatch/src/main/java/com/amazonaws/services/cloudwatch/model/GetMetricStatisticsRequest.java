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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     * CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     * dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that
     * were used when the metrics were created. For an example, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     * >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about specifying
     * dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The time stamp that determines the first data point to return. Start times are evaluated relative to the time
     * that CloudWatch receives the request.
     * </p>
     * <p>
     * The value specified is inclusive; results include data points with the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     * </p>
     * <p>
     * CloudWatch rounds the specified time stamp as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down
     * to 12:32:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34
     * is rounded down to 12:30:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is
     * rounded down to 12:00:00.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the nearest
     * time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at
     * (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you
     * receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using
     * a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time stamp that determines the last data point to return.
     * </p>
     * <p>
     * The value specified is exclusive; results include data points up to the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     */
    private Integer period;
    /**
     * <p>
     * The metric statistics, other than percentile. For percentile statistics, use <code>ExtendedStatistics</code>.
     * When calling <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     * <code>ExtendedStatistics</code>, but not both.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> statistics;
    /**
     * <p>
     * The percentile statistics. Specify values between p0.0 and p100. When calling <code>GetMetricStatistics</code>,
     * you must specify either <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both. Percentile
     * statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> extendedStatistics;
    /**
     * <p>
     * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units
     * being returned. If you specify only a unit that the metric does not report, the results of the call are null.
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
     * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     * CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     * dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that
     * were used when the metrics were created. For an example, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     * >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about specifying
     * dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     *         CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination
     *         of dimensions was not published, you can't retrieve statistics for it. You must specify the same
     *         dimensions that were used when the metrics were created. For an example, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     *         >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about
     *         specifying dimensions, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     *         Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     * CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     * dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that
     * were used when the metrics were created. For an example, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     * >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about specifying
     * dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param dimensions
     *        The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     *        CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     *        dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions
     *        that were used when the metrics were created. For an example, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     *        >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about
     *        specifying dimensions, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     *        Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
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
     * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     * CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     * dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that
     * were used when the metrics were created. For an example, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     * >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about specifying
     * dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     *        CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     *        dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions
     *        that were used when the metrics were created. For an example, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     *        >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about
     *        specifying dimensions, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     *        Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
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
     * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     * CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     * dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that
     * were used when the metrics were created. For an example, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     * >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about specifying
     * dimensions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param dimensions
     *        The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension.
     *        CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of
     *        dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions
     *        that were used when the metrics were created. For an example, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#dimension-combinations"
     *        >Dimension Combinations</a> in the <i>Amazon CloudWatch User Guide</i>. For more information about
     *        specifying dimensions, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publishing
     *        Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The time stamp that determines the first data point to return. Start times are evaluated relative to the time
     * that CloudWatch receives the request.
     * </p>
     * <p>
     * The value specified is inclusive; results include data points with the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     * </p>
     * <p>
     * CloudWatch rounds the specified time stamp as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down
     * to 12:32:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34
     * is rounded down to 12:30:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is
     * rounded down to 12:00:00.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the nearest
     * time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at
     * (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you
     * receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using
     * a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15.
     * </p>
     * 
     * @param startTime
     *        The time stamp that determines the first data point to return. Start times are evaluated relative to the
     *        time that CloudWatch receives the request.</p>
     *        <p>
     *        The value specified is inclusive; results include data points with the specified time stamp. The time
     *        stamp must be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     *        </p>
     *        <p>
     *        CloudWatch rounds the specified time stamp as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is
     *        rounded down to 12:32:00.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example,
     *        12:32:34 is rounded down to 12:30:00.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example,
     *        12:32:34 is rounded down to 12:00:00.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the
     *        nearest time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you
     *        make a query at (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is
     *        rounded down and you receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the
     *        previous 5 minutes of data, using a period of 5 seconds, you receive data timestamped between 15:02:15 and
     *        15:07:15.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp that determines the first data point to return. Start times are evaluated relative to the time
     * that CloudWatch receives the request.
     * </p>
     * <p>
     * The value specified is inclusive; results include data points with the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     * </p>
     * <p>
     * CloudWatch rounds the specified time stamp as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down
     * to 12:32:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34
     * is rounded down to 12:30:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is
     * rounded down to 12:00:00.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the nearest
     * time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at
     * (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you
     * receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using
     * a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15.
     * </p>
     * 
     * @return The time stamp that determines the first data point to return. Start times are evaluated relative to the
     *         time that CloudWatch receives the request.</p>
     *         <p>
     *         The value specified is inclusive; results include data points with the specified time stamp. The time
     *         stamp must be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     *         </p>
     *         <p>
     *         CloudWatch rounds the specified time stamp as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is
     *         rounded down to 12:32:00.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example,
     *         12:32:34 is rounded down to 12:30:00.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example,
     *         12:32:34 is rounded down to 12:00:00.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the
     *         nearest time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you
     *         make a query at (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is
     *         rounded down and you receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the
     *         previous 5 minutes of data, using a period of 5 seconds, you receive data timestamped between 15:02:15
     *         and 15:07:15.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time stamp that determines the first data point to return. Start times are evaluated relative to the time
     * that CloudWatch receives the request.
     * </p>
     * <p>
     * The value specified is inclusive; results include data points with the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     * </p>
     * <p>
     * CloudWatch rounds the specified time stamp as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down
     * to 12:32:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34
     * is rounded down to 12:30:00.
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is
     * rounded down to 12:00:00.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the nearest
     * time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at
     * (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you
     * receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using
     * a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15.
     * </p>
     * 
     * @param startTime
     *        The time stamp that determines the first data point to return. Start times are evaluated relative to the
     *        time that CloudWatch receives the request.</p>
     *        <p>
     *        The value specified is inclusive; results include data points with the specified time stamp. The time
     *        stamp must be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z).
     *        </p>
     *        <p>
     *        CloudWatch rounds the specified time stamp as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is
     *        rounded down to 12:32:00.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example,
     *        12:32:34 is rounded down to 12:30:00.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example,
     *        12:32:34 is rounded down to 12:00:00.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set <code>Period</code> to 5, 10, or 30, the start time of your request is rounded down to the
     *        nearest time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you
     *        make a query at (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is
     *        rounded down and you receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the
     *        previous 5 minutes of data, using a period of 5 seconds, you receive data timestamped between 15:02:15 and
     *        15:07:15.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time stamp that determines the last data point to return.
     * </p>
     * <p>
     * The value specified is exclusive; results include data points up to the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     * </p>
     * 
     * @param endTime
     *        The time stamp that determines the last data point to return.</p>
     *        <p>
     *        The value specified is exclusive; results include data points up to the specified time stamp. The time
     *        stamp must be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time stamp that determines the last data point to return.
     * </p>
     * <p>
     * The value specified is exclusive; results include data points up to the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     * </p>
     * 
     * @return The time stamp that determines the last data point to return.</p>
     *         <p>
     *         The value specified is exclusive; results include data points up to the specified time stamp. The time
     *         stamp must be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time stamp that determines the last data point to return.
     * </p>
     * <p>
     * The value specified is exclusive; results include data points up to the specified time stamp. The time stamp must
     * be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     * </p>
     * 
     * @param endTime
     *        The time stamp that determines the last data point to return.</p>
     *        <p>
     *        The value specified is exclusive; results include data points up to the specified time stamp. The time
     *        stamp must be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period
     *        can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     *        are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of
     *        60. High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     *        <code>StorageResolution</code> of 1 second.</p>
     *        <p>
     *        If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *        specify the period as follows or no data points in that time range is returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *        </p>
     *        </li>
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period
     *         can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     *         are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple
     *         of 60. High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that
     *         includes a <code>StorageResolution</code> of 1 second.</p>
     *         <p>
     *         If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *         specify the period as follows or no data points in that time range is returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *         </p>
     *         </li>
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period
     *        can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     *        are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of
     *        60. High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     *        <code>StorageResolution</code> of 1 second.</p>
     *        <p>
     *        If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *        specify the period as follows or no data points in that time range is returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The metric statistics, other than percentile. For percentile statistics, use <code>ExtendedStatistics</code>.
     * When calling <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     * <code>ExtendedStatistics</code>, but not both.
     * </p>
     * 
     * @return The metric statistics, other than percentile. For percentile statistics, use
     *         <code>ExtendedStatistics</code>. When calling <code>GetMetricStatistics</code>, you must specify either
     *         <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both.
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
     * The metric statistics, other than percentile. For percentile statistics, use <code>ExtendedStatistics</code>.
     * When calling <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     * <code>ExtendedStatistics</code>, but not both.
     * </p>
     * 
     * @param statistics
     *        The metric statistics, other than percentile. For percentile statistics, use
     *        <code>ExtendedStatistics</code>. When calling <code>GetMetricStatistics</code>, you must specify either
     *        <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both.
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
     * The metric statistics, other than percentile. For percentile statistics, use <code>ExtendedStatistics</code>.
     * When calling <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     * <code>ExtendedStatistics</code>, but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        The metric statistics, other than percentile. For percentile statistics, use
     *        <code>ExtendedStatistics</code>. When calling <code>GetMetricStatistics</code>, you must specify either
     *        <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both.
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
     * The metric statistics, other than percentile. For percentile statistics, use <code>ExtendedStatistics</code>.
     * When calling <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     * <code>ExtendedStatistics</code>, but not both.
     * </p>
     * 
     * @param statistics
     *        The metric statistics, other than percentile. For percentile statistics, use
     *        <code>ExtendedStatistics</code>. When calling <code>GetMetricStatistics</code>, you must specify either
     *        <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public GetMetricStatisticsRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The metric statistics, other than percentile. For percentile statistics, use <code>ExtendedStatistics</code>.
     * When calling <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     * <code>ExtendedStatistics</code>, but not both.
     * </p>
     * 
     * @param statistics
     *        The metric statistics, other than percentile. For percentile statistics, use
     *        <code>ExtendedStatistics</code>. When calling <code>GetMetricStatistics</code>, you must specify either
     *        <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both.
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
     * The percentile statistics. Specify values between p0.0 and p100. When calling <code>GetMetricStatistics</code>,
     * you must specify either <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both. Percentile
     * statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * 
     * @return The percentile statistics. Specify values between p0.0 and p100. When calling
     *         <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     *         <code>ExtendedStatistics</code>, but not both. Percentile statistics are not available for metrics when
     *         any of the metric values are negative numbers.
     */

    public java.util.List<String> getExtendedStatistics() {
        if (extendedStatistics == null) {
            extendedStatistics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return extendedStatistics;
    }

    /**
     * <p>
     * The percentile statistics. Specify values between p0.0 and p100. When calling <code>GetMetricStatistics</code>,
     * you must specify either <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both. Percentile
     * statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * 
     * @param extendedStatistics
     *        The percentile statistics. Specify values between p0.0 and p100. When calling
     *        <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     *        <code>ExtendedStatistics</code>, but not both. Percentile statistics are not available for metrics when
     *        any of the metric values are negative numbers.
     */

    public void setExtendedStatistics(java.util.Collection<String> extendedStatistics) {
        if (extendedStatistics == null) {
            this.extendedStatistics = null;
            return;
        }

        this.extendedStatistics = new com.amazonaws.internal.SdkInternalList<String>(extendedStatistics);
    }

    /**
     * <p>
     * The percentile statistics. Specify values between p0.0 and p100. When calling <code>GetMetricStatistics</code>,
     * you must specify either <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both. Percentile
     * statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtendedStatistics(java.util.Collection)} or {@link #withExtendedStatistics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param extendedStatistics
     *        The percentile statistics. Specify values between p0.0 and p100. When calling
     *        <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     *        <code>ExtendedStatistics</code>, but not both. Percentile statistics are not available for metrics when
     *        any of the metric values are negative numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withExtendedStatistics(String... extendedStatistics) {
        if (this.extendedStatistics == null) {
            setExtendedStatistics(new com.amazonaws.internal.SdkInternalList<String>(extendedStatistics.length));
        }
        for (String ele : extendedStatistics) {
            this.extendedStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The percentile statistics. Specify values between p0.0 and p100. When calling <code>GetMetricStatistics</code>,
     * you must specify either <code>Statistics</code> or <code>ExtendedStatistics</code>, but not both. Percentile
     * statistics are not available for metrics when any of the metric values are negative numbers.
     * </p>
     * 
     * @param extendedStatistics
     *        The percentile statistics. Specify values between p0.0 and p100. When calling
     *        <code>GetMetricStatistics</code>, you must specify either <code>Statistics</code> or
     *        <code>ExtendedStatistics</code>, but not both. Percentile statistics are not available for metrics when
     *        any of the metric values are negative numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsRequest withExtendedStatistics(java.util.Collection<String> extendedStatistics) {
        setExtendedStatistics(extendedStatistics);
        return this;
    }

    /**
     * <p>
     * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units
     * being returned. If you specify only a unit that the metric does not report, the results of the call are null.
     * </p>
     * 
     * @param unit
     *        The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     *        all units being returned. If you specify only a unit that the metric does not report, the results of the
     *        call are null.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units
     * being returned. If you specify only a unit that the metric does not report, the results of the call are null.
     * </p>
     * 
     * @return The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     *         all units being returned. If you specify only a unit that the metric does not report, the results of the
     *         call are null.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units
     * being returned. If you specify only a unit that the metric does not report, the results of the call are null.
     * </p>
     * 
     * @param unit
     *        The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     *        all units being returned. If you specify only a unit that the metric does not report, the results of the
     *        call are null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public GetMetricStatisticsRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units
     * being returned. If you specify only a unit that the metric does not report, the results of the call are null.
     * </p>
     * 
     * @param unit
     *        The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     *        all units being returned. If you specify only a unit that the metric does not report, the results of the
     *        call are null.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units
     * being returned. If you specify only a unit that the metric does not report, the results of the call are null.
     * </p>
     * 
     * @param unit
     *        The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in
     *        all units being returned. If you specify only a unit that the metric does not report, the results of the
     *        call are null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public GetMetricStatisticsRequest withUnit(StandardUnit unit) {
        this.unit = unit.toString();
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getExtendedStatistics() != null)
            sb.append("ExtendedStatistics: ").append(getExtendedStatistics()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
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
        if (other.getExtendedStatistics() == null ^ this.getExtendedStatistics() == null)
            return false;
        if (other.getExtendedStatistics() != null && other.getExtendedStatistics().equals(this.getExtendedStatistics()) == false)
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
        hashCode = prime * hashCode + ((getExtendedStatistics() == null) ? 0 : getExtendedStatistics().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricStatisticsRequest clone() {
        return (GetMetricStatisticsRequest) super.clone();
    }

}
