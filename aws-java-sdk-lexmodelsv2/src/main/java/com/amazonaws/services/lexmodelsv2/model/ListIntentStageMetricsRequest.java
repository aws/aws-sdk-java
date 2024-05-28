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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentStageMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntentStageMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent stage metrics.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent stage metrics.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     * </p>
     */
    private java.util.Date endDateTime;
    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     */
    private java.util.List<AnalyticsIntentStageMetric> metrics;
    /**
     * <p>
     * A list of objects, each of which contains specifications for organizing the results by time.
     * </p>
     */
    private java.util.List<AnalyticsBinBySpecification> binBy;
    /**
     * <p>
     * A list of objects, each of which specifies how to group the results. You can group by the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntentStageName</code> – The name of the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AnalyticsIntentStageGroupBySpecification> groupBy;
    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     */
    private java.util.List<AnalyticsIntentStageFilter> filters;
    /**
     * <p>
     * The maximum number of results to return in each page of results. If there are fewer results than the maximum page
     * size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the ListIntentStageMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentStageMetrics operation until the nextToken returned in
     * the response is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent stage metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you want to retrieve intent stage metrics.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent stage metrics.
     * </p>
     * 
     * @return The identifier for the bot for which you want to retrieve intent stage metrics.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent stage metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you want to retrieve intent stage metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent stage metrics.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that marks the beginning of the range of time for which you want to see intent stage
     *        metrics.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent stage metrics.
     * </p>
     * 
     * @return The date and time that marks the beginning of the range of time for which you want to see intent stage
     *         metrics.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent stage metrics.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that marks the beginning of the range of time for which you want to see intent stage
     *        metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     * </p>
     * 
     * @return The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that marks the end of the range of time for which you want to see intent stage metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * 
     * @return A list of objects, each of which contains a metric you want to list, the statistic for the metric you
     *         want to return, and the method by which to organize the results.
     */

    public java.util.List<AnalyticsIntentStageMetric> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * 
     * @param metrics
     *        A list of objects, each of which contains a metric you want to list, the statistic for the metric you want
     *        to return, and the method by which to organize the results.
     */

    public void setMetrics(java.util.Collection<AnalyticsIntentStageMetric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<AnalyticsIntentStageMetric>(metrics);
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        A list of objects, each of which contains a metric you want to list, the statistic for the metric you want
     *        to return, and the method by which to organize the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withMetrics(AnalyticsIntentStageMetric... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<AnalyticsIntentStageMetric>(metrics.length));
        }
        for (AnalyticsIntentStageMetric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * 
     * @param metrics
     *        A list of objects, each of which contains a metric you want to list, the statistic for the metric you want
     *        to return, and the method by which to organize the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withMetrics(java.util.Collection<AnalyticsIntentStageMetric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains specifications for organizing the results by time.
     * </p>
     * 
     * @return A list of objects, each of which contains specifications for organizing the results by time.
     */

    public java.util.List<AnalyticsBinBySpecification> getBinBy() {
        return binBy;
    }

    /**
     * <p>
     * A list of objects, each of which contains specifications for organizing the results by time.
     * </p>
     * 
     * @param binBy
     *        A list of objects, each of which contains specifications for organizing the results by time.
     */

    public void setBinBy(java.util.Collection<AnalyticsBinBySpecification> binBy) {
        if (binBy == null) {
            this.binBy = null;
            return;
        }

        this.binBy = new java.util.ArrayList<AnalyticsBinBySpecification>(binBy);
    }

    /**
     * <p>
     * A list of objects, each of which contains specifications for organizing the results by time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBinBy(java.util.Collection)} or {@link #withBinBy(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param binBy
     *        A list of objects, each of which contains specifications for organizing the results by time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withBinBy(AnalyticsBinBySpecification... binBy) {
        if (this.binBy == null) {
            setBinBy(new java.util.ArrayList<AnalyticsBinBySpecification>(binBy.length));
        }
        for (AnalyticsBinBySpecification ele : binBy) {
            this.binBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains specifications for organizing the results by time.
     * </p>
     * 
     * @param binBy
     *        A list of objects, each of which contains specifications for organizing the results by time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withBinBy(java.util.Collection<AnalyticsBinBySpecification> binBy) {
        setBinBy(binBy);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which specifies how to group the results. You can group by the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntentStageName</code> – The name of the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of objects, each of which specifies how to group the results. You can group by the following
     *         criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IntentStageName</code> – The name of the intent stage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     *         </p>
     *         </li>
     */

    public java.util.List<AnalyticsIntentStageGroupBySpecification> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * A list of objects, each of which specifies how to group the results. You can group by the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntentStageName</code> – The name of the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        A list of objects, each of which specifies how to group the results. You can group by the following
     *        criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IntentStageName</code> – The name of the intent stage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     *        </p>
     *        </li>
     */

    public void setGroupBy(java.util.Collection<AnalyticsIntentStageGroupBySpecification> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<AnalyticsIntentStageGroupBySpecification>(groupBy);
    }

    /**
     * <p>
     * A list of objects, each of which specifies how to group the results. You can group by the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntentStageName</code> – The name of the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        A list of objects, each of which specifies how to group the results. You can group by the following
     *        criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IntentStageName</code> – The name of the intent stage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withGroupBy(AnalyticsIntentStageGroupBySpecification... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<AnalyticsIntentStageGroupBySpecification>(groupBy.length));
        }
        for (AnalyticsIntentStageGroupBySpecification ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which specifies how to group the results. You can group by the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntentStageName</code> – The name of the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        A list of objects, each of which specifies how to group the results. You can group by the following
     *        criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IntentStageName</code> – The name of the intent stage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SwitchedToIntent</code> – The intent to which the conversation was switched (if any).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withGroupBy(java.util.Collection<AnalyticsIntentStageGroupBySpecification> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     * 
     * @return A list of objects, each of which describes a condition by which you want to filter the results.
     */

    public java.util.List<AnalyticsIntentStageFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     * 
     * @param filters
     *        A list of objects, each of which describes a condition by which you want to filter the results.
     */

    public void setFilters(java.util.Collection<AnalyticsIntentStageFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<AnalyticsIntentStageFilter>(filters);
    }

    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of objects, each of which describes a condition by which you want to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withFilters(AnalyticsIntentStageFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<AnalyticsIntentStageFilter>(filters.length));
        }
        for (AnalyticsIntentStageFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     * 
     * @param filters
     *        A list of objects, each of which describes a condition by which you want to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withFilters(java.util.Collection<AnalyticsIntentStageFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in each page of results. If there are fewer results than the maximum page
     * size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each page of results. If there are fewer results than the
     *        maximum page size, only the actual number of results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each page of results. If there are fewer results than the maximum page
     * size, only the actual number of results are returned.
     * </p>
     * 
     * @return The maximum number of results to return in each page of results. If there are fewer results than the
     *         maximum page size, only the actual number of results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each page of results. If there are fewer results than the maximum page
     * size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each page of results. If there are fewer results than the
     *        maximum page size, only the actual number of results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the ListIntentStageMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentStageMetrics operation until the nextToken returned in
     * the response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListIntentStageMetrics operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next
     *        page of results. For a complete set of results, call the ListIntentStageMetrics operation until the
     *        nextToken returned in the response is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the ListIntentStageMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentStageMetrics operation until the nextToken returned in
     * the response is null.
     * </p>
     * 
     * @return If the response from the ListIntentStageMetrics operation contains more results than specified in the
     *         maxResults parameter, a token is returned in the response.</p>
     *         <p>
     *         Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next
     *         page of results. For a complete set of results, call the ListIntentStageMetrics operation until the
     *         nextToken returned in the response is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the ListIntentStageMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentStageMetrics operation until the nextToken returned in
     * the response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListIntentStageMetrics operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListIntentStageMetrics request to return the next
     *        page of results. For a complete set of results, call the ListIntentStageMetrics operation until the
     *        nextToken returned in the response is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsRequest withNextToken(String nextToken) {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getBinBy() != null)
            sb.append("BinBy: ").append(getBinBy()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof ListIntentStageMetricsRequest == false)
            return false;
        ListIntentStageMetricsRequest other = (ListIntentStageMetricsRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getBinBy() == null ^ this.getBinBy() == null)
            return false;
        if (other.getBinBy() != null && other.getBinBy().equals(this.getBinBy()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getBinBy() == null) ? 0 : getBinBy().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIntentStageMetricsRequest clone() {
        return (ListIntentStageMetricsRequest) super.clone();
    }

}
