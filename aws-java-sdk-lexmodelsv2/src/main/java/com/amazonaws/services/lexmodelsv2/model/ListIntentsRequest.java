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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that contains the intent.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the intent.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to sort by
     * the intent name or last updated date in either ascending or descending order.
     * </p>
     */
    private IntentSortBy sortBy;
    /**
     * <p>
     * Provides the specification of a filter used to limit the intents in the response to only those that match the
     * filter specification. You can only specify one filter and only one string to filter on.
     * </p>
     */
    private java.util.List<IntentFilter> filters;
    /**
     * <p>
     * The maximum number of intents to return in each page of results. If there are fewer results than the max page
     * size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the <code>ListIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the bot that contains the intent.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the intent.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the intent.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the intent.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the intent.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the intent.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the intent.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the intent.
     * </p>
     * 
     * @return The version of the bot that contains the intent.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the intent.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the intents to list. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale of the intents to list. The string must match one of the
     *         supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the intents to list. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the intents to list. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to sort by
     * the intent name or last updated date in either ascending or descending order.
     * </p>
     * 
     * @param sortBy
     *        Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to
     *        sort by the intent name or last updated date in either ascending or descending order.
     */

    public void setSortBy(IntentSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to sort by
     * the intent name or last updated date in either ascending or descending order.
     * </p>
     * 
     * @return Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to
     *         sort by the intent name or last updated date in either ascending or descending order.
     */

    public IntentSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to sort by
     * the intent name or last updated date in either ascending or descending order.
     * </p>
     * 
     * @param sortBy
     *        Determines the sort order for the response from the <code>ListIntents</code> operation. You can choose to
     *        sort by the intent name or last updated date in either ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withSortBy(IntentSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the intents in the response to only those that match the
     * filter specification. You can only specify one filter and only one string to filter on.
     * </p>
     * 
     * @return Provides the specification of a filter used to limit the intents in the response to only those that match
     *         the filter specification. You can only specify one filter and only one string to filter on.
     */

    public java.util.List<IntentFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the intents in the response to only those that match the
     * filter specification. You can only specify one filter and only one string to filter on.
     * </p>
     * 
     * @param filters
     *        Provides the specification of a filter used to limit the intents in the response to only those that match
     *        the filter specification. You can only specify one filter and only one string to filter on.
     */

    public void setFilters(java.util.Collection<IntentFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<IntentFilter>(filters);
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the intents in the response to only those that match the
     * filter specification. You can only specify one filter and only one string to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Provides the specification of a filter used to limit the intents in the response to only those that match
     *        the filter specification. You can only specify one filter and only one string to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withFilters(IntentFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<IntentFilter>(filters.length));
        }
        for (IntentFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the specification of a filter used to limit the intents in the response to only those that match the
     * filter specification. You can only specify one filter and only one string to filter on.
     * </p>
     * 
     * @param filters
     *        Provides the specification of a filter used to limit the intents in the response to only those that match
     *        the filter specification. You can only specify one filter and only one string to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withFilters(java.util.Collection<IntentFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of intents to return in each page of results. If there are fewer results than the max page
     * size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of intents to return in each page of results. If there are fewer results than the max
     *        page size, only the actual number of results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in each page of results. If there are fewer results than the max page
     * size, only the actual number of results are returned.
     * </p>
     * 
     * @return The maximum number of intents to return in each page of results. If there are fewer results than the max
     *         page size, only the actual number of results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in each page of results. If there are fewer results than the max page
     * size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of intents to return in each page of results. If there are fewer results than the max
     *        page size, only the actual number of results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the <code>ListIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListIntents</code> operation contains more results than specified in the
     *        <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     *        <code>nextToken</code> parameter to return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @return If the response from the <code>ListIntents</code> operation contains more results than specified in the
     *         <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     *         <code>nextToken</code> parameter to return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the <code>ListIntents</code> operation contains more results than specified in the
     * <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     * <code>nextToken</code> parameter to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the <code>ListIntents</code> operation contains more results than specified in the
     *        <code>maxResults</code> parameter, a token is returned in the response. Use that token in the
     *        <code>nextToken</code> parameter to return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentsRequest withNextToken(String nextToken) {
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
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

        if (obj instanceof ListIntentsRequest == false)
            return false;
        ListIntentsRequest other = (ListIntentsRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
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
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIntentsRequest clone() {
        return (ListIntentsRequest) super.clone();
    }

}
