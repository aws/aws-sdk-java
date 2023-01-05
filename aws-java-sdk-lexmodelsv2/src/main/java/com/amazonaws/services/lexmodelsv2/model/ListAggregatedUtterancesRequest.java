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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListAggregatedUtterances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAggregatedUtterancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot associated with this request.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the bot alias associated with this request. If you specify the bot alias, you can't specify the
     * bot version.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The identifier of the bot version associated with this request. If you specify the bot version, you can't specify
     * the bot alias.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The time window for aggregating the utterance information. You can specify a time between one hour and two weeks.
     * </p>
     */
    private UtteranceAggregationDuration aggregationDuration;
    /**
     * <p>
     * Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count, or the
     * number of distinct sessions the utterance appeared in.
     * </p>
     */
    private AggregatedUtterancesSortBy sortBy;
    /**
     * <p>
     * Provides the specification of a filter used to limit the utterances in the response to only those that match the
     * filter specification. You can only specify one filter and one string to filter on.
     * </p>
     */
    private java.util.List<AggregatedUtterancesFilter> filters;
    /**
     * <p>
     * The maximum number of utterances to return in each page of results. If there are fewer results than the maximum
     * page size, only the actual number of results are returned. If you don't specify the <code>maxResults</code>
     * parameter, 1,000 results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the <code>ListAggregatedUtterances</code> operation contains more results that specified in
     * the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the bot associated with this request.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with this request.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with this request.
     * </p>
     * 
     * @return The unique identifier of the bot associated with this request.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with this request.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot alias associated with this request. If you specify the bot alias, you can't specify the
     * bot version.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias associated with this request. If you specify the bot alias, you can't
     *        specify the bot version.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias associated with this request. If you specify the bot alias, you can't specify the
     * bot version.
     * </p>
     * 
     * @return The identifier of the bot alias associated with this request. If you specify the bot alias, you can't
     *         specify the bot version.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias associated with this request. If you specify the bot alias, you can't specify the
     * bot version.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias associated with this request. If you specify the bot alias, you can't
     *        specify the bot version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot version associated with this request. If you specify the bot version, you can't specify
     * the bot alias.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the bot version associated with this request. If you specify the bot version, you can't
     *        specify the bot alias.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the bot version associated with this request. If you specify the bot version, you can't specify
     * the bot alias.
     * </p>
     * 
     * @return The identifier of the bot version associated with this request. If you specify the bot version, you can't
     *         specify the bot alias.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the bot version associated with this request. If you specify the bot version, you can't specify
     * the bot alias.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the bot version associated with this request. If you specify the bot version, you can't
     *        specify the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where the utterances were collected. For more information, see
     *        <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale where the utterances were collected. For more information, see
     *         <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where the utterances were collected. For more information, see
     *        <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The time window for aggregating the utterance information. You can specify a time between one hour and two weeks.
     * </p>
     * 
     * @param aggregationDuration
     *        The time window for aggregating the utterance information. You can specify a time between one hour and two
     *        weeks.
     */

    public void setAggregationDuration(UtteranceAggregationDuration aggregationDuration) {
        this.aggregationDuration = aggregationDuration;
    }

    /**
     * <p>
     * The time window for aggregating the utterance information. You can specify a time between one hour and two weeks.
     * </p>
     * 
     * @return The time window for aggregating the utterance information. You can specify a time between one hour and
     *         two weeks.
     */

    public UtteranceAggregationDuration getAggregationDuration() {
        return this.aggregationDuration;
    }

    /**
     * <p>
     * The time window for aggregating the utterance information. You can specify a time between one hour and two weeks.
     * </p>
     * 
     * @param aggregationDuration
     *        The time window for aggregating the utterance information. You can specify a time between one hour and two
     *        weeks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withAggregationDuration(UtteranceAggregationDuration aggregationDuration) {
        setAggregationDuration(aggregationDuration);
        return this;
    }

    /**
     * <p>
     * Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count, or the
     * number of distinct sessions the utterance appeared in.
     * </p>
     * 
     * @param sortBy
     *        Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count,
     *        or the number of distinct sessions the utterance appeared in.
     */

    public void setSortBy(AggregatedUtterancesSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count, or the
     * number of distinct sessions the utterance appeared in.
     * </p>
     * 
     * @return Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count,
     *         or the number of distinct sessions the utterance appeared in.
     */

    public AggregatedUtterancesSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count, or the
     * number of distinct sessions the utterance appeared in.
     * </p>
     * 
     * @param sortBy
     *        Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count,
     *        or the number of distinct sessions the utterance appeared in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withSortBy(AggregatedUtterancesSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the utterances in the response to only those that match the
     * filter specification. You can only specify one filter and one string to filter on.
     * </p>
     * 
     * @return Provides the specification of a filter used to limit the utterances in the response to only those that
     *         match the filter specification. You can only specify one filter and one string to filter on.
     */

    public java.util.List<AggregatedUtterancesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the utterances in the response to only those that match the
     * filter specification. You can only specify one filter and one string to filter on.
     * </p>
     * 
     * @param filters
     *        Provides the specification of a filter used to limit the utterances in the response to only those that
     *        match the filter specification. You can only specify one filter and one string to filter on.
     */

    public void setFilters(java.util.Collection<AggregatedUtterancesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<AggregatedUtterancesFilter>(filters);
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the utterances in the response to only those that match the
     * filter specification. You can only specify one filter and one string to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Provides the specification of a filter used to limit the utterances in the response to only those that
     *        match the filter specification. You can only specify one filter and one string to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withFilters(AggregatedUtterancesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<AggregatedUtterancesFilter>(filters.length));
        }
        for (AggregatedUtterancesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the utterances in the response to only those that match the
     * filter specification. You can only specify one filter and one string to filter on.
     * </p>
     * 
     * @param filters
     *        Provides the specification of a filter used to limit the utterances in the response to only those that
     *        match the filter specification. You can only specify one filter and one string to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withFilters(java.util.Collection<AggregatedUtterancesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of utterances to return in each page of results. If there are fewer results than the maximum
     * page size, only the actual number of results are returned. If you don't specify the <code>maxResults</code>
     * parameter, 1,000 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of utterances to return in each page of results. If there are fewer results than the
     *        maximum page size, only the actual number of results are returned. If you don't specify the
     *        <code>maxResults</code> parameter, 1,000 results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of utterances to return in each page of results. If there are fewer results than the maximum
     * page size, only the actual number of results are returned. If you don't specify the <code>maxResults</code>
     * parameter, 1,000 results are returned.
     * </p>
     * 
     * @return The maximum number of utterances to return in each page of results. If there are fewer results than the
     *         maximum page size, only the actual number of results are returned. If you don't specify the
     *         <code>maxResults</code> parameter, 1,000 results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of utterances to return in each page of results. If there are fewer results than the maximum
     * page size, only the actual number of results are returned. If you don't specify the <code>maxResults</code>
     * parameter, 1,000 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of utterances to return in each page of results. If there are fewer results than the
     *        maximum page size, only the actual number of results are returned. If you don't specify the
     *        <code>maxResults</code> parameter, 1,000 results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the <code>ListAggregatedUtterances</code> operation contains more results that specified in
     * the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListAggregatedUtterances</code> operation contains more results that
     *        specified in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in
     *        the <code>nextToken</code> parameter to return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListAggregatedUtterances</code> operation contains more results that specified in
     * the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @return If the response from the <code>ListAggregatedUtterances</code> operation contains more results that
     *         specified in the <code>maxResults</code> parameter, a token is returned in the response. Use that token
     *         in the <code>nextToken</code> parameter to return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListAggregatedUtterances</code> operation contains more results that specified in
     * the <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListAggregatedUtterances</code> operation contains more results that
     *        specified in the <code>maxResults</code> parameter, a token is returned in the response. Use that token in
     *        the <code>nextToken</code> parameter to return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesRequest withNextToken(String nextToken) {
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
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getAggregationDuration() != null)
            sb.append("AggregationDuration: ").append(getAggregationDuration()).append(",");
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

        if (obj instanceof ListAggregatedUtterancesRequest == false)
            return false;
        ListAggregatedUtterancesRequest other = (ListAggregatedUtterancesRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getAggregationDuration() == null ^ this.getAggregationDuration() == null)
            return false;
        if (other.getAggregationDuration() != null && other.getAggregationDuration().equals(this.getAggregationDuration()) == false)
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
        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getAggregationDuration() == null) ? 0 : getAggregationDuration().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAggregatedUtterancesRequest clone() {
        return (ListAggregatedUtterancesRequest) super.clone();
    }

}
