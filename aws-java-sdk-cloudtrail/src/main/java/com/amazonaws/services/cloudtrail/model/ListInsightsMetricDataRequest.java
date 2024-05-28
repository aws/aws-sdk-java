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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListInsightsMetricData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     * <code>s3.amazonaws.com</code>.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The name of the event, typically the Amazon Web Services API on which unusual levels of activity were recorded.
     * </p>
     */
    private String eventName;
    /**
     * <p>
     * The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     * <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     * management API calls that are aggregated per minute against a baseline API call volume. The
     * <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * </p>
     */
    private String insightType;
    /**
     * <p>
     * Conditionally required if the <code>InsightType</code> parameter is set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include data
     * points with the specified time stamp.
     * </p>
     * <p>
     * The default is 90 days before the time of request.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include data
     * points up to the specified time stamp.
     * </p>
     * <p>
     * The default is the time of request.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     * <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>. The
     * default is <code>NonZeroData</code>.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value is
     * 21600.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Returned if all datapoints can't be returned in a single call. For example, due to reaching
     * <code>MaxResults</code>.
     * </p>
     * <p>
     * Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     * <code>s3.amazonaws.com</code>.
     * </p>
     * 
     * @param eventSource
     *        The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     *        <code>s3.amazonaws.com</code>.
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     * <code>s3.amazonaws.com</code>.
     * </p>
     * 
     * @return The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     *         <code>s3.amazonaws.com</code>.
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     * <code>s3.amazonaws.com</code>.
     * </p>
     * 
     * @param eventSource
     *        The Amazon Web Services service to which the request was made, such as <code>iam.amazonaws.com</code> or
     *        <code>s3.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The name of the event, typically the Amazon Web Services API on which unusual levels of activity were recorded.
     * </p>
     * 
     * @param eventName
     *        The name of the event, typically the Amazon Web Services API on which unusual levels of activity were
     *        recorded.
     */

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The name of the event, typically the Amazon Web Services API on which unusual levels of activity were recorded.
     * </p>
     * 
     * @return The name of the event, typically the Amazon Web Services API on which unusual levels of activity were
     *         recorded.
     */

    public String getEventName() {
        return this.eventName;
    }

    /**
     * <p>
     * The name of the event, typically the Amazon Web Services API on which unusual levels of activity were recorded.
     * </p>
     * 
     * @param eventName
     *        The name of the event, typically the Amazon Web Services API on which unusual levels of activity were
     *        recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withEventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     * <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     * management API calls that are aggregated per minute against a baseline API call volume. The
     * <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * </p>
     * 
     * @param insightType
     *        The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     *        <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     *        management API calls that are aggregated per minute against a baseline API call volume. The
     *        <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * @see InsightType
     */

    public void setInsightType(String insightType) {
        this.insightType = insightType;
    }

    /**
     * <p>
     * The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     * <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     * management API calls that are aggregated per minute against a baseline API call volume. The
     * <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * </p>
     * 
     * @return The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     *         <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     *         management API calls that are aggregated per minute against a baseline API call volume. The
     *         <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * @see InsightType
     */

    public String getInsightType() {
        return this.insightType;
    }

    /**
     * <p>
     * The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     * <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     * management API calls that are aggregated per minute against a baseline API call volume. The
     * <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * </p>
     * 
     * @param insightType
     *        The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     *        <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     *        management API calls that are aggregated per minute against a baseline API call volume. The
     *        <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public ListInsightsMetricDataRequest withInsightType(String insightType) {
        setInsightType(insightType);
        return this;
    }

    /**
     * <p>
     * The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     * <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     * management API calls that are aggregated per minute against a baseline API call volume. The
     * <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * </p>
     * 
     * @param insightType
     *        The type of CloudTrail Insights event, which is either <code>ApiCallRateInsight</code> or
     *        <code>ApiErrorRateInsight</code>. The <code>ApiCallRateInsight</code> Insights type analyzes write-only
     *        management API calls that are aggregated per minute against a baseline API call volume. The
     *        <code>ApiErrorRateInsight</code> Insights type analyzes management API calls that result in error codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public ListInsightsMetricDataRequest withInsightType(InsightType insightType) {
        this.insightType = insightType.toString();
        return this;
    }

    /**
     * <p>
     * Conditionally required if the <code>InsightType</code> parameter is set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     * 
     * @param errorCode
     *        Conditionally required if the <code>InsightType</code> parameter is set to
     *        <code>ApiErrorRateInsight</code>.</p>
     *        <p>
     *        If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve
     *        data for. For example, <code>AccessDenied</code>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Conditionally required if the <code>InsightType</code> parameter is set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     * 
     * @return Conditionally required if the <code>InsightType</code> parameter is set to
     *         <code>ApiErrorRateInsight</code>.</p>
     *         <p>
     *         If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to
     *         retrieve data for. For example, <code>AccessDenied</code>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Conditionally required if the <code>InsightType</code> parameter is set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     * 
     * @param errorCode
     *        Conditionally required if the <code>InsightType</code> parameter is set to
     *        <code>ApiErrorRateInsight</code>.</p>
     *        <p>
     *        If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve
     *        data for. For example, <code>AccessDenied</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include data
     * points with the specified time stamp.
     * </p>
     * <p>
     * The default is 90 days before the time of request.
     * </p>
     * 
     * @param startTime
     *        Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include
     *        data points with the specified time stamp.</p>
     *        <p>
     *        The default is 90 days before the time of request.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include data
     * points with the specified time stamp.
     * </p>
     * <p>
     * The default is 90 days before the time of request.
     * </p>
     * 
     * @return Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include
     *         data points with the specified time stamp.</p>
     *         <p>
     *         The default is 90 days before the time of request.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include data
     * points with the specified time stamp.
     * </p>
     * <p>
     * The default is 90 days before the time of request.
     * </p>
     * 
     * @param startTime
     *        Specifies, in UTC, the start time for time-series data. The value specified is inclusive; results include
     *        data points with the specified time stamp.</p>
     *        <p>
     *        The default is 90 days before the time of request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include data
     * points up to the specified time stamp.
     * </p>
     * <p>
     * The default is the time of request.
     * </p>
     * 
     * @param endTime
     *        Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include
     *        data points up to the specified time stamp.</p>
     *        <p>
     *        The default is the time of request.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include data
     * points up to the specified time stamp.
     * </p>
     * <p>
     * The default is the time of request.
     * </p>
     * 
     * @return Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include
     *         data points up to the specified time stamp.</p>
     *         <p>
     *         The default is the time of request.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include data
     * points up to the specified time stamp.
     * </p>
     * <p>
     * The default is the time of request.
     * </p>
     * 
     * @param endTime
     *        Specifies, in UTC, the end time for time-series data. The value specified is exclusive; results include
     *        data points up to the specified time stamp.</p>
     *        <p>
     *        The default is the time of request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     * <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     * </p>
     * 
     * @param period
     *        Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     *        <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     * <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     * </p>
     * 
     * @return Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     *         <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     * <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     * </p>
     * 
     * @param period
     *        Granularity of data to retrieve, in seconds. Valid values are <code>60</code>, <code>300</code>, and
     *        <code>3600</code>. If you specify any other value, you will get an error. The default is 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>. The
     * default is <code>NonZeroData</code>.
     * </p>
     * 
     * @param dataType
     *        Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>.
     *        The default is <code>NonZeroData</code>.
     * @see InsightsMetricDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>. The
     * default is <code>NonZeroData</code>.
     * </p>
     * 
     * @return Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>.
     *         The default is <code>NonZeroData</code>.
     * @see InsightsMetricDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>. The
     * default is <code>NonZeroData</code>.
     * </p>
     * 
     * @param dataType
     *        Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>.
     *        The default is <code>NonZeroData</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightsMetricDataType
     */

    public ListInsightsMetricDataRequest withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>. The
     * default is <code>NonZeroData</code>.
     * </p>
     * 
     * @param dataType
     *        Type of datapoints to return. Valid values are <code>NonZeroData</code> and <code>FillWithZeros</code>.
     *        The default is <code>NonZeroData</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightsMetricDataType
     */

    public ListInsightsMetricDataRequest withDataType(InsightsMetricDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value is
     * 21600.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value
     *        is 21600.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value is
     * 21600.
     * </p>
     * 
     * @return The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value
     *         is 21600.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value is
     * 21600.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of datapoints to return. Valid values are integers from 1 to 21600. The default value
     *        is 21600.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Returned if all datapoints can't be returned in a single call. For example, due to reaching
     * <code>MaxResults</code>.
     * </p>
     * <p>
     * Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     * </p>
     * 
     * @param nextToken
     *        Returned if all datapoints can't be returned in a single call. For example, due to reaching
     *        <code>MaxResults</code>.</p>
     *        <p>
     *        Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Returned if all datapoints can't be returned in a single call. For example, due to reaching
     * <code>MaxResults</code>.
     * </p>
     * <p>
     * Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     * </p>
     * 
     * @return Returned if all datapoints can't be returned in a single call. For example, due to reaching
     *         <code>MaxResults</code>.</p>
     *         <p>
     *         Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Returned if all datapoints can't be returned in a single call. For example, due to reaching
     * <code>MaxResults</code>.
     * </p>
     * <p>
     * Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     * </p>
     * 
     * @param nextToken
     *        Returned if all datapoints can't be returned in a single call. For example, due to reaching
     *        <code>MaxResults</code>.</p>
     *        <p>
     *        Add this parameter to the request to continue retrieving results starting from the last evaluated point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getEventName() != null)
            sb.append("EventName: ").append(getEventName()).append(",");
        if (getInsightType() != null)
            sb.append("InsightType: ").append(getInsightType()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInsightsMetricDataRequest == false)
            return false;
        ListInsightsMetricDataRequest other = (ListInsightsMetricDataRequest) obj;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getInsightType() == null ^ this.getInsightType() == null)
            return false;
        if (other.getInsightType() != null && other.getInsightType().equals(this.getInsightType()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
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
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode + ((getInsightType() == null) ? 0 : getInsightType().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInsightsMetricDataRequest clone() {
        return (ListInsightsMetricDataRequest) super.clone();
    }

}
