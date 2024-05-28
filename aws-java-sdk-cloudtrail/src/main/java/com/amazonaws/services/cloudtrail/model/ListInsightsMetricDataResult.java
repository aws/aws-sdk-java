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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListInsightsMetricData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * List of timestamps at intervals corresponding to the specified time period.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Date> timestamps;
    /**
     * <p>
     * List of values representing the API call rate or error rate at each timestamp. The number of values is equal to
     * the number of timestamps.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Double> values;
    /**
     * <p>
     * Only returned if the full results could not be returned in a single query. You can set the <code>NextToken</code>
     * parameter in the next request to this value to continue retrieval.
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

    public ListInsightsMetricDataResult withEventSource(String eventSource) {
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

    public ListInsightsMetricDataResult withEventName(String eventName) {
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

    public ListInsightsMetricDataResult withInsightType(String insightType) {
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

    public ListInsightsMetricDataResult withInsightType(InsightType insightType) {
        this.insightType = insightType.toString();
        return this;
    }

    /**
     * <p>
     * Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     * 
     * @param errorCode
     *        Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.</p>
     *        <p>
     *        If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve
     *        data for. For example, <code>AccessDenied</code>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     * 
     * @return Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.</p>
     *         <p>
     *         If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to
     *         retrieve data for. For example, <code>AccessDenied</code>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.
     * </p>
     * <p>
     * If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve data
     * for. For example, <code>AccessDenied</code>.
     * </p>
     * 
     * @param errorCode
     *        Only returned if <code>InsightType</code> parameter was set to <code>ApiErrorRateInsight</code>.</p>
     *        <p>
     *        If returning metrics for the <code>ApiErrorRateInsight</code> Insights type, this is the error to retrieve
     *        data for. For example, <code>AccessDenied</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * List of timestamps at intervals corresponding to the specified time period.
     * </p>
     * 
     * @return List of timestamps at intervals corresponding to the specified time period.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        if (timestamps == null) {
            timestamps = new com.amazonaws.internal.SdkInternalList<java.util.Date>();
        }
        return timestamps;
    }

    /**
     * <p>
     * List of timestamps at intervals corresponding to the specified time period.
     * </p>
     * 
     * @param timestamps
     *        List of timestamps at intervals corresponding to the specified time period.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new com.amazonaws.internal.SdkInternalList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * List of timestamps at intervals corresponding to the specified time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        List of timestamps at intervals corresponding to the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataResult withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new com.amazonaws.internal.SdkInternalList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of timestamps at intervals corresponding to the specified time period.
     * </p>
     * 
     * @param timestamps
     *        List of timestamps at intervals corresponding to the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataResult withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * List of values representing the API call rate or error rate at each timestamp. The number of values is equal to
     * the number of timestamps.
     * </p>
     * 
     * @return List of values representing the API call rate or error rate at each timestamp. The number of values is
     *         equal to the number of timestamps.
     */

    public java.util.List<Double> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<Double>();
        }
        return values;
    }

    /**
     * <p>
     * List of values representing the API call rate or error rate at each timestamp. The number of values is equal to
     * the number of timestamps.
     * </p>
     * 
     * @param values
     *        List of values representing the API call rate or error rate at each timestamp. The number of values is
     *        equal to the number of timestamps.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<Double>(values);
    }

    /**
     * <p>
     * List of values representing the API call rate or error rate at each timestamp. The number of values is equal to
     * the number of timestamps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        List of values representing the API call rate or error rate at each timestamp. The number of values is
     *        equal to the number of timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataResult withValues(Double... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of values representing the API call rate or error rate at each timestamp. The number of values is equal to
     * the number of timestamps.
     * </p>
     * 
     * @param values
     *        List of values representing the API call rate or error rate at each timestamp. The number of values is
     *        equal to the number of timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataResult withValues(java.util.Collection<Double> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * Only returned if the full results could not be returned in a single query. You can set the <code>NextToken</code>
     * parameter in the next request to this value to continue retrieval.
     * </p>
     * 
     * @param nextToken
     *        Only returned if the full results could not be returned in a single query. You can set the
     *        <code>NextToken</code> parameter in the next request to this value to continue retrieval.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Only returned if the full results could not be returned in a single query. You can set the <code>NextToken</code>
     * parameter in the next request to this value to continue retrieval.
     * </p>
     * 
     * @return Only returned if the full results could not be returned in a single query. You can set the
     *         <code>NextToken</code> parameter in the next request to this value to continue retrieval.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Only returned if the full results could not be returned in a single query. You can set the <code>NextToken</code>
     * parameter in the next request to this value to continue retrieval.
     * </p>
     * 
     * @param nextToken
     *        Only returned if the full results could not be returned in a single query. You can set the
     *        <code>NextToken</code> parameter in the next request to this value to continue retrieval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsMetricDataResult withNextToken(String nextToken) {
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
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
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

        if (obj instanceof ListInsightsMetricDataResult == false)
            return false;
        ListInsightsMetricDataResult other = (ListInsightsMetricDataResult) obj;
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
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
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
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInsightsMetricDataResult clone() {
        try {
            return (ListInsightsMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
