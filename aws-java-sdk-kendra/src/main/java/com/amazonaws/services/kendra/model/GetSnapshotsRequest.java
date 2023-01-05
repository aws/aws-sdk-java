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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index to get search metrics data.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The time interval or time window to get search metrics data. The time interval uses the time zone of your index.
     * You can view data in the following time windows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the following
     * Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day before
     * the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the last day
     * of the month.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month and
     * ending on last day of the month.
     * </p>
     * </li>
     * </ul>
     */
    private String interval;
    /**
     * <p>
     * The metric you want to retrieve. You can specify only one metric per call.
     * </p>
     * <p>
     * For more information about the metrics you can view, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     * analytics</a>.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of search metrics
     * data.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of returned data for the metric.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the index to get search metrics data.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to get search metrics data.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index to get search metrics data.
     * </p>
     * 
     * @return The identifier of the index to get search metrics data.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index to get search metrics data.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to get search metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The time interval or time window to get search metrics data. The time interval uses the time zone of your index.
     * You can view data in the following time windows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the following
     * Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day before
     * the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the last day
     * of the month.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month and
     * ending on last day of the month.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interval
     *        The time interval or time window to get search metrics data. The time interval uses the time zone of your
     *        index. You can view data in the following time windows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current
     *        date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the
     *        following Saturday.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day
     *        before the current date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the
     *        last day of the month.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month
     *        and ending on last day of the month.
     *        </p>
     *        </li>
     * @see Interval
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time interval or time window to get search metrics data. The time interval uses the time zone of your index.
     * You can view data in the following time windows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the following
     * Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day before
     * the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the last day
     * of the month.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month and
     * ending on last day of the month.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The time interval or time window to get search metrics data. The time interval uses the time zone of your
     *         index. You can view data in the following time windows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current
     *         date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following
     *         Saturday.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the
     *         following Saturday.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day
     *         before the current date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the
     *         last day of the month.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month
     *         and ending on last day of the month.
     *         </p>
     *         </li>
     * @see Interval
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time interval or time window to get search metrics data. The time interval uses the time zone of your index.
     * You can view data in the following time windows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the following
     * Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day before
     * the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the last day
     * of the month.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month and
     * ending on last day of the month.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interval
     *        The time interval or time window to get search metrics data. The time interval uses the time zone of your
     *        index. You can view data in the following time windows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current
     *        date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the
     *        following Saturday.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day
     *        before the current date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the
     *        last day of the month.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month
     *        and ending on last day of the month.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Interval
     */

    public GetSnapshotsRequest withInterval(String interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The time interval or time window to get search metrics data. The time interval uses the time zone of your index.
     * You can view data in the following time windows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the following
     * Saturday.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day before
     * the current date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the last day
     * of the month.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month and
     * ending on last day of the month.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interval
     *        The time interval or time window to get search metrics data. The time interval uses the time zone of your
     *        index. You can view data in the following time windows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>THIS_WEEK</code>: The current week, starting on the Sunday and ending on the day before the current
     *        date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONE_WEEK_AGO</code>: The previous week, starting on the Sunday and ending on the following Saturday.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TWO_WEEKS_AGO</code>: The week before the previous week, starting on the Sunday and ending on the
     *        following Saturday.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIS_MONTH</code>: The current month, starting on the first day of the month and ending on the day
     *        before the current date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONE_MONTH_AGO</code>: The previous month, starting on the first day of the month and ending on the
     *        last day of the month.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TWO_MONTHS_AGO</code>: The month before the previous month, starting on the first day of the month
     *        and ending on last day of the month.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Interval
     */

    public GetSnapshotsRequest withInterval(Interval interval) {
        this.interval = interval.toString();
        return this;
    }

    /**
     * <p>
     * The metric you want to retrieve. You can specify only one metric per call.
     * </p>
     * <p>
     * For more information about the metrics you can view, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     * analytics</a>.
     * </p>
     * 
     * @param metricType
     *        The metric you want to retrieve. You can specify only one metric per call.</p>
     *        <p>
     *        For more information about the metrics you can view, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     *        analytics</a>.
     * @see MetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The metric you want to retrieve. You can specify only one metric per call.
     * </p>
     * <p>
     * For more information about the metrics you can view, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     * analytics</a>.
     * </p>
     * 
     * @return The metric you want to retrieve. You can specify only one metric per call.</p>
     *         <p>
     *         For more information about the metrics you can view, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     *         analytics</a>.
     * @see MetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * The metric you want to retrieve. You can specify only one metric per call.
     * </p>
     * <p>
     * For more information about the metrics you can view, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     * analytics</a>.
     * </p>
     * 
     * @param metricType
     *        The metric you want to retrieve. You can specify only one metric per call.</p>
     *        <p>
     *        For more information about the metrics you can view, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     *        analytics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public GetSnapshotsRequest withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * The metric you want to retrieve. You can specify only one metric per call.
     * </p>
     * <p>
     * For more information about the metrics you can view, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     * analytics</a>.
     * </p>
     * 
     * @param metricType
     *        The metric you want to retrieve. You can specify only one metric per call.</p>
     *        <p>
     *        For more information about the metrics you can view, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/search-analytics.html">Gaining insights with search
     *        analytics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public GetSnapshotsRequest withMetricType(MetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of search metrics
     * data.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *        pagination token in the response. You can use this pagination token to retrieve the next set of search
     *        metrics data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of search metrics
     * data.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *         pagination token in the response. You can use this pagination token to retrieve the next set of search
     *         metrics data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of search metrics
     * data.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *        pagination token in the response. You can use this pagination token to retrieve the next set of search
     *        metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned data for the metric.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned data for the metric.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of returned data for the metric.
     * </p>
     * 
     * @return The maximum number of returned data for the metric.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of returned data for the metric.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned data for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSnapshotsRequest == false)
            return false;
        GetSnapshotsRequest other = (GetSnapshotsRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetSnapshotsRequest clone() {
        return (GetSnapshotsRequest) super.clone();
    }

}
