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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListUtteranceAnalyticsData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUtteranceAnalyticsDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve utterance analytics.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see utterance analytics.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see utterance analytics.
     * </p>
     */
    private java.util.Date endDateTime;
    /**
     * <p>
     * An object specifying the measure and method by which to sort the utterance analytics data.
     * </p>
     */
    private UtteranceDataSortBy sortBy;
    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     */
    private java.util.List<AnalyticsUtteranceFilter> filters;
    /**
     * <p>
     * The maximum number of results to return in each page of results. If there are fewer results than the maximum page
     * size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve utterance analytics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you want to retrieve utterance analytics.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve utterance analytics.
     * </p>
     * 
     * @return The identifier for the bot for which you want to retrieve utterance analytics.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve utterance analytics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you want to retrieve utterance analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see utterance analytics.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that marks the beginning of the range of time for which you want to see utterance
     *        analytics.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see utterance analytics.
     * </p>
     * 
     * @return The date and time that marks the beginning of the range of time for which you want to see utterance
     *         analytics.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see utterance analytics.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that marks the beginning of the range of time for which you want to see utterance
     *        analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataRequest withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see utterance analytics.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that marks the end of the range of time for which you want to see utterance analytics.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see utterance analytics.
     * </p>
     * 
     * @return The date and time that marks the end of the range of time for which you want to see utterance analytics.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see utterance analytics.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that marks the end of the range of time for which you want to see utterance analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataRequest withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * An object specifying the measure and method by which to sort the utterance analytics data.
     * </p>
     * 
     * @param sortBy
     *        An object specifying the measure and method by which to sort the utterance analytics data.
     */

    public void setSortBy(UtteranceDataSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * An object specifying the measure and method by which to sort the utterance analytics data.
     * </p>
     * 
     * @return An object specifying the measure and method by which to sort the utterance analytics data.
     */

    public UtteranceDataSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * An object specifying the measure and method by which to sort the utterance analytics data.
     * </p>
     * 
     * @param sortBy
     *        An object specifying the measure and method by which to sort the utterance analytics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataRequest withSortBy(UtteranceDataSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which describes a condition by which you want to filter the results.
     * </p>
     * 
     * @return A list of objects, each of which describes a condition by which you want to filter the results.
     */

    public java.util.List<AnalyticsUtteranceFilter> getFilters() {
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

    public void setFilters(java.util.Collection<AnalyticsUtteranceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<AnalyticsUtteranceFilter>(filters);
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

    public ListUtteranceAnalyticsDataRequest withFilters(AnalyticsUtteranceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<AnalyticsUtteranceFilter>(filters.length));
        }
        for (AnalyticsUtteranceFilter ele : filters) {
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

    public ListUtteranceAnalyticsDataRequest withFilters(java.util.Collection<AnalyticsUtteranceFilter> filters) {
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

    public ListUtteranceAnalyticsDataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the
     *        next page of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until
     *        the nextToken returned in the response is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     * 
     * @return If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     *         maxResults parameter, a token is returned in the response.</p>
     *         <p>
     *         Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the
     *         next page of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until
     *         the nextToken returned in the response is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListUtteranceAnalyticsData operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListUtteranceAnalyticsData request to return the
     *        next page of results. For a complete set of results, call the ListUtteranceAnalyticsData operation until
     *        the nextToken returned in the response is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataRequest withNextToken(String nextToken) {
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
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

        if (obj instanceof ListUtteranceAnalyticsDataRequest == false)
            return false;
        ListUtteranceAnalyticsDataRequest other = (ListUtteranceAnalyticsDataRequest) obj;
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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
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
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUtteranceAnalyticsDataRequest clone() {
        return (ListUtteranceAnalyticsDataRequest) super.clone();
    }

}
