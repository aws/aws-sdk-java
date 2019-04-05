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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     * <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve, or a
     * math expression to perform on retrieved data.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDataQuery> metricDataQueries;
    /**
     * <p>
     * The time stamp indicating the earliest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>StartTime</code> can get a
     * faster response from CloudWatch than setting 12:07 or 12:29 as the <code>StartTime</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time stamp indicating the latest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>EndTime</code> can get a faster
     * response from CloudWatch than setting 12:07 or 12:29 as the <code>EndTime</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Include this value, if it was returned by the previous call, to get the next set of data points.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The order in which data points should be returned. <code>TimestampDescending</code> returns the newest data first
     * and paginates when the <code>MaxDatapoints</code> limit is reached. <code>TimestampAscending</code> returns the
     * oldest data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     * </p>
     */
    private String scanBy;
    /**
     * <p>
     * The maximum number of data points the request should return before paginating. If you omit this, the default of
     * 100,800 is used.
     * </p>
     */
    private Integer maxDatapoints;

    /**
     * <p>
     * The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     * <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve, or a
     * math expression to perform on retrieved data.
     * </p>
     * 
     * @return The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     *         <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to
     *         retrieve, or a math expression to perform on retrieved data.
     */

    public java.util.List<MetricDataQuery> getMetricDataQueries() {
        if (metricDataQueries == null) {
            metricDataQueries = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>();
        }
        return metricDataQueries;
    }

    /**
     * <p>
     * The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     * <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve, or a
     * math expression to perform on retrieved data.
     * </p>
     * 
     * @param metricDataQueries
     *        The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     *        <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve,
     *        or a math expression to perform on retrieved data.
     */

    public void setMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
        if (metricDataQueries == null) {
            this.metricDataQueries = null;
            return;
        }

        this.metricDataQueries = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metricDataQueries);
    }

    /**
     * <p>
     * The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     * <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve, or a
     * math expression to perform on retrieved data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataQueries(java.util.Collection)} or {@link #withMetricDataQueries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDataQueries
     *        The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     *        <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve,
     *        or a math expression to perform on retrieved data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataRequest withMetricDataQueries(MetricDataQuery... metricDataQueries) {
        if (this.metricDataQueries == null) {
            setMetricDataQueries(new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metricDataQueries.length));
        }
        for (MetricDataQuery ele : metricDataQueries) {
            this.metricDataQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     * <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve, or a
     * math expression to perform on retrieved data.
     * </p>
     * 
     * @param metricDataQueries
     *        The metric queries to be returned. A single <code>GetMetricData</code> call can include as many as 100
     *        <code>MetricDataQuery</code> structures. Each of these structures can specify either a metric to retrieve,
     *        or a math expression to perform on retrieved data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataRequest withMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
        setMetricDataQueries(metricDataQueries);
        return this;
    }

    /**
     * <p>
     * The time stamp indicating the earliest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>StartTime</code> can get a
     * faster response from CloudWatch than setting 12:07 or 12:29 as the <code>StartTime</code>.
     * </p>
     * 
     * @param startTime
     *        The time stamp indicating the earliest data to be returned.</p>
     *        <p>
     *        For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the
     *        value of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example,
     *        if the <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>StartTime</code>
     *        can get a faster response from CloudWatch than setting 12:07 or 12:29 as the <code>StartTime</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp indicating the earliest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>StartTime</code> can get a
     * faster response from CloudWatch than setting 12:07 or 12:29 as the <code>StartTime</code>.
     * </p>
     * 
     * @return The time stamp indicating the earliest data to be returned.</p>
     *         <p>
     *         For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with
     *         the value of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For
     *         example, if the <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as
     *         <code>StartTime</code> can get a faster response from CloudWatch than setting 12:07 or 12:29 as the
     *         <code>StartTime</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time stamp indicating the earliest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>StartTime</code> can get a
     * faster response from CloudWatch than setting 12:07 or 12:29 as the <code>StartTime</code>.
     * </p>
     * 
     * @param startTime
     *        The time stamp indicating the earliest data to be returned.</p>
     *        <p>
     *        For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the
     *        value of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example,
     *        if the <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>StartTime</code>
     *        can get a faster response from CloudWatch than setting 12:07 or 12:29 as the <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time stamp indicating the latest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>EndTime</code> can get a faster
     * response from CloudWatch than setting 12:07 or 12:29 as the <code>EndTime</code>.
     * </p>
     * 
     * @param endTime
     *        The time stamp indicating the latest data to be returned.</p>
     *        <p>
     *        For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the
     *        value of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example,
     *        if the <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>EndTime</code> can
     *        get a faster response from CloudWatch than setting 12:07 or 12:29 as the <code>EndTime</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time stamp indicating the latest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>EndTime</code> can get a faster
     * response from CloudWatch than setting 12:07 or 12:29 as the <code>EndTime</code>.
     * </p>
     * 
     * @return The time stamp indicating the latest data to be returned.</p>
     *         <p>
     *         For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with
     *         the value of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For
     *         example, if the <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as
     *         <code>EndTime</code> can get a faster response from CloudWatch than setting 12:07 or 12:29 as the
     *         <code>EndTime</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time stamp indicating the latest data to be returned.
     * </p>
     * <p>
     * For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the value
     * of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example, if the
     * <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>EndTime</code> can get a faster
     * response from CloudWatch than setting 12:07 or 12:29 as the <code>EndTime</code>.
     * </p>
     * 
     * @param endTime
     *        The time stamp indicating the latest data to be returned.</p>
     *        <p>
     *        For better performance, specify <code>StartTime</code> and <code>EndTime</code> values that align with the
     *        value of the metric's <code>Period</code> and sync up with the beginning and end of an hour. For example,
     *        if the <code>Period</code> of a metric is 5 minutes, specifying 12:05 or 12:30 as <code>EndTime</code> can
     *        get a faster response from CloudWatch than setting 12:07 or 12:29 as the <code>EndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous call, to get the next set of data points.
     * </p>
     * 
     * @param nextToken
     *        Include this value, if it was returned by the previous call, to get the next set of data points.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous call, to get the next set of data points.
     * </p>
     * 
     * @return Include this value, if it was returned by the previous call, to get the next set of data points.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous call, to get the next set of data points.
     * </p>
     * 
     * @param nextToken
     *        Include this value, if it was returned by the previous call, to get the next set of data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The order in which data points should be returned. <code>TimestampDescending</code> returns the newest data first
     * and paginates when the <code>MaxDatapoints</code> limit is reached. <code>TimestampAscending</code> returns the
     * oldest data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     * </p>
     * 
     * @param scanBy
     *        The order in which data points should be returned. <code>TimestampDescending</code> returns the newest
     *        data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     *        <code>TimestampAscending</code> returns the oldest data first and paginates when the
     *        <code>MaxDatapoints</code> limit is reached.
     * @see ScanBy
     */

    public void setScanBy(String scanBy) {
        this.scanBy = scanBy;
    }

    /**
     * <p>
     * The order in which data points should be returned. <code>TimestampDescending</code> returns the newest data first
     * and paginates when the <code>MaxDatapoints</code> limit is reached. <code>TimestampAscending</code> returns the
     * oldest data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     * </p>
     * 
     * @return The order in which data points should be returned. <code>TimestampDescending</code> returns the newest
     *         data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     *         <code>TimestampAscending</code> returns the oldest data first and paginates when the
     *         <code>MaxDatapoints</code> limit is reached.
     * @see ScanBy
     */

    public String getScanBy() {
        return this.scanBy;
    }

    /**
     * <p>
     * The order in which data points should be returned. <code>TimestampDescending</code> returns the newest data first
     * and paginates when the <code>MaxDatapoints</code> limit is reached. <code>TimestampAscending</code> returns the
     * oldest data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     * </p>
     * 
     * @param scanBy
     *        The order in which data points should be returned. <code>TimestampDescending</code> returns the newest
     *        data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     *        <code>TimestampAscending</code> returns the oldest data first and paginates when the
     *        <code>MaxDatapoints</code> limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanBy
     */

    public GetMetricDataRequest withScanBy(String scanBy) {
        setScanBy(scanBy);
        return this;
    }

    /**
     * <p>
     * The order in which data points should be returned. <code>TimestampDescending</code> returns the newest data first
     * and paginates when the <code>MaxDatapoints</code> limit is reached. <code>TimestampAscending</code> returns the
     * oldest data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     * </p>
     * 
     * @param scanBy
     *        The order in which data points should be returned. <code>TimestampDescending</code> returns the newest
     *        data first and paginates when the <code>MaxDatapoints</code> limit is reached.
     *        <code>TimestampAscending</code> returns the oldest data first and paginates when the
     *        <code>MaxDatapoints</code> limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanBy
     */

    public GetMetricDataRequest withScanBy(ScanBy scanBy) {
        this.scanBy = scanBy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of data points the request should return before paginating. If you omit this, the default of
     * 100,800 is used.
     * </p>
     * 
     * @param maxDatapoints
     *        The maximum number of data points the request should return before paginating. If you omit this, the
     *        default of 100,800 is used.
     */

    public void setMaxDatapoints(Integer maxDatapoints) {
        this.maxDatapoints = maxDatapoints;
    }

    /**
     * <p>
     * The maximum number of data points the request should return before paginating. If you omit this, the default of
     * 100,800 is used.
     * </p>
     * 
     * @return The maximum number of data points the request should return before paginating. If you omit this, the
     *         default of 100,800 is used.
     */

    public Integer getMaxDatapoints() {
        return this.maxDatapoints;
    }

    /**
     * <p>
     * The maximum number of data points the request should return before paginating. If you omit this, the default of
     * 100,800 is used.
     * </p>
     * 
     * @param maxDatapoints
     *        The maximum number of data points the request should return before paginating. If you omit this, the
     *        default of 100,800 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricDataRequest withMaxDatapoints(Integer maxDatapoints) {
        setMaxDatapoints(maxDatapoints);
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
        if (getMetricDataQueries() != null)
            sb.append("MetricDataQueries: ").append(getMetricDataQueries()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScanBy() != null)
            sb.append("ScanBy: ").append(getScanBy()).append(",");
        if (getMaxDatapoints() != null)
            sb.append("MaxDatapoints: ").append(getMaxDatapoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricDataRequest == false)
            return false;
        GetMetricDataRequest other = (GetMetricDataRequest) obj;
        if (other.getMetricDataQueries() == null ^ this.getMetricDataQueries() == null)
            return false;
        if (other.getMetricDataQueries() != null && other.getMetricDataQueries().equals(this.getMetricDataQueries()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScanBy() == null ^ this.getScanBy() == null)
            return false;
        if (other.getScanBy() != null && other.getScanBy().equals(this.getScanBy()) == false)
            return false;
        if (other.getMaxDatapoints() == null ^ this.getMaxDatapoints() == null)
            return false;
        if (other.getMaxDatapoints() != null && other.getMaxDatapoints().equals(this.getMaxDatapoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricDataQueries() == null) ? 0 : getMetricDataQueries().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScanBy() == null) ? 0 : getScanBy().hashCode());
        hashCode = prime * hashCode + ((getMaxDatapoints() == null) ? 0 : getMaxDatapoints().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricDataRequest clone() {
        return (GetMetricDataRequest) super.clone();
    }

}
