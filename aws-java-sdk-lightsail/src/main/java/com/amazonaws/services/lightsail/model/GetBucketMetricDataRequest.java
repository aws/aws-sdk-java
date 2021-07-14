/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket for which to get metric data.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid bucket metric names are listed below, along with the most useful statistics to include in your request, and
     * the published unit value.
     * </p>
     * <note>
     * <p>
     * These bucket metrics are reported once per day.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is calculated
     * by summing the size of all objects in the bucket (including object versions), including the size of all parts for
     * all incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Maximum</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is calculated
     * by counting all objects in the bucket (including object versions) and the total number of parts for all
     * incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;
    /**
     * <p>
     * The timestamp indicating the earliest data to be returned.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp indicating the latest data to be returned.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <note>
     * <p>
     * Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds, which
     * is the number of seconds in a day.
     * </p>
     * </note>
     */
    private Integer period;
    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> statistics;
    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the bucket for which to get metric data.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to get metric data.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to get metric data.
     * </p>
     * 
     * @return The name of the bucket for which to get metric data.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to get metric data.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to get metric data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketMetricDataRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid bucket metric names are listed below, along with the most useful statistics to include in your request, and
     * the published unit value.
     * </p>
     * <note>
     * <p>
     * These bucket metrics are reported once per day.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is calculated
     * by summing the size of all objects in the bucket (including object versions), including the size of all parts for
     * all incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Maximum</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is calculated
     * by counting all objects in the bucket (including object versions) and the total number of parts for all
     * incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid bucket metric names are listed below, along with the most useful statistics to include in your
     *        request, and the published unit value.
     *        </p>
     *        <note>
     *        <p>
     *        These bucket metrics are reported once per day.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is
     *        calculated by summing the size of all objects in the bucket (including object versions), including the
     *        size of all parts for all incomplete multipart uploads to the bucket.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistic is <code>Maximum</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is
     *        calculated by counting all objects in the bucket (including object versions) and the total number of parts
     *        for all incomplete multipart uploads to the bucket.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @see BucketMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid bucket metric names are listed below, along with the most useful statistics to include in your request, and
     * the published unit value.
     * </p>
     * <note>
     * <p>
     * These bucket metrics are reported once per day.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is calculated
     * by summing the size of all objects in the bucket (including object versions), including the size of all parts for
     * all incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Maximum</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is calculated
     * by counting all objects in the bucket (including object versions) and the total number of parts for all
     * incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric for which you want to return information.</p>
     *         <p>
     *         Valid bucket metric names are listed below, along with the most useful statistics to include in your
     *         request, and the published unit value.
     *         </p>
     *         <note>
     *         <p>
     *         These bucket metrics are reported once per day.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is
     *         calculated by summing the size of all objects in the bucket (including object versions), including the
     *         size of all parts for all incomplete multipart uploads to the bucket.
     *         </p>
     *         <p>
     *         Statistics: The most useful statistic is <code>Maximum</code>.
     *         </p>
     *         <p>
     *         Unit: The published unit is <code>Bytes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is
     *         calculated by counting all objects in the bucket (including object versions) and the total number of
     *         parts for all incomplete multipart uploads to the bucket.
     *         </p>
     *         <p>
     *         Statistics: The most useful statistic is <code>Average</code>.
     *         </p>
     *         <p>
     *         Unit: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     * @see BucketMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid bucket metric names are listed below, along with the most useful statistics to include in your request, and
     * the published unit value.
     * </p>
     * <note>
     * <p>
     * These bucket metrics are reported once per day.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is calculated
     * by summing the size of all objects in the bucket (including object versions), including the size of all parts for
     * all incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Maximum</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is calculated
     * by counting all objects in the bucket (including object versions) and the total number of parts for all
     * incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid bucket metric names are listed below, along with the most useful statistics to include in your
     *        request, and the published unit value.
     *        </p>
     *        <note>
     *        <p>
     *        These bucket metrics are reported once per day.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is
     *        calculated by summing the size of all objects in the bucket (including object versions), including the
     *        size of all parts for all incomplete multipart uploads to the bucket.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistic is <code>Maximum</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is
     *        calculated by counting all objects in the bucket (including object versions) and the total number of parts
     *        for all incomplete multipart uploads to the bucket.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketMetricName
     */

    public GetBucketMetricDataRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid bucket metric names are listed below, along with the most useful statistics to include in your request, and
     * the published unit value.
     * </p>
     * <note>
     * <p>
     * These bucket metrics are reported once per day.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is calculated
     * by summing the size of all objects in the bucket (including object versions), including the size of all parts for
     * all incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Maximum</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is calculated
     * by counting all objects in the bucket (including object versions) and the total number of parts for all
     * incomplete multipart uploads to the bucket.
     * </p>
     * <p>
     * Statistics: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid bucket metric names are listed below, along with the most useful statistics to include in your
     *        request, and the published unit value.
     *        </p>
     *        <note>
     *        <p>
     *        These bucket metrics are reported once per day.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>BucketSizeBytes</code> </b> - The amount of data in bytes stored in a bucket. This value is
     *        calculated by summing the size of all objects in the bucket (including object versions), including the
     *        size of all parts for all incomplete multipart uploads to the bucket.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistic is <code>Maximum</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NumberOfObjects</code> </b> - The total number of objects stored in a bucket. This value is
     *        calculated by counting all objects in the bucket (including object versions) and the total number of parts
     *        for all incomplete multipart uploads to the bucket.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketMetricName
     */

    public GetBucketMetricDataRequest withMetricName(BucketMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp indicating the earliest data to be returned.
     * </p>
     * 
     * @param startTime
     *        The timestamp indicating the earliest data to be returned.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp indicating the earliest data to be returned.
     * </p>
     * 
     * @return The timestamp indicating the earliest data to be returned.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp indicating the earliest data to be returned.
     * </p>
     * 
     * @param startTime
     *        The timestamp indicating the earliest data to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp indicating the latest data to be returned.
     * </p>
     * 
     * @param endTime
     *        The timestamp indicating the latest data to be returned.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp indicating the latest data to be returned.
     * </p>
     * 
     * @return The timestamp indicating the latest data to be returned.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp indicating the latest data to be returned.
     * </p>
     * 
     * @param endTime
     *        The timestamp indicating the latest data to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <note>
     * <p>
     * Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds, which
     * is the number of seconds in a day.
     * </p>
     * </note>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.</p> <note>
     *        <p>
     *        Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds,
     *        which is the number of seconds in a day.
     *        </p>
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <note>
     * <p>
     * Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds, which
     * is the number of seconds in a day.
     * </p>
     * </note>
     * 
     * @return The granularity, in seconds, of the returned data points.</p> <note>
     *         <p>
     *         Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400
     *         seconds, which is the number of seconds in a day.
     *         </p>
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <note>
     * <p>
     * Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds, which
     * is the number of seconds in a day.
     * </p>
     * </note>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.</p> <note>
     *        <p>
     *        Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds,
     *        which is the number of seconds in a day.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketMetricDataRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The statistic for the metric.</p>
     *         <p>
     *         The following statistics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *         low volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> - The highest value observed during the specified period. Use this value to
     *         determine high volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     *         determine the total volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *         period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you
     *         can determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *         <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *         resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *         </p>
     *         </li>
     * @see MetricStatistic
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     *        determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
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
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     *        determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetBucketMetricDataRequest withStatistics(String... statistics) {
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
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     *        determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetBucketMetricDataRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - The sum of all values submitted for the matching metric. You can use this statistic to
     *        determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetBucketMetricDataRequest withStatistics(MetricStatistic... statistics) {
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
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.</p>
     *        <p>
     *        Valid units depend on the metric data being requested. For the valid units with each available metric, see
     *        the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @return The unit for the metric data request.</p>
     *         <p>
     *         Valid units depend on the metric data being requested. For the valid units with each available metric,
     *         see the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.</p>
     *        <p>
     *        Valid units depend on the metric data being requested. For the valid units with each available metric, see
     *        the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetBucketMetricDataRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.</p>
     *        <p>
     *        Valid units depend on the metric data being requested. For the valid units with each available metric, see
     *        the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetBucketMetricDataRequest withUnit(MetricUnit unit) {
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
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

        if (obj instanceof GetBucketMetricDataRequest == false)
            return false;
        GetBucketMetricDataRequest other = (GetBucketMetricDataRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
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

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketMetricDataRequest clone() {
        return (GetBucketMetricDataRequest) super.clone();
    }

}
