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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SearchAssociatedTranscripts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAssociatedTranscriptsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     */
    private String botRecommendationId;
    /**
     * <p>
     * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * </p>
     */
    private String searchOrder;
    /**
     * <p>
     * A list of filter objects.
     * </p>
     */
    private java.util.List<AssociatedTranscriptFilter> filters;
    /**
     * <p>
     * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the
     * max page size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified in the
     * maxResults parameter, an index is returned in the response. Use that index in the nextIndex parameter to return
     * the next page of results.
     * </p>
     */
    private Integer nextIndex;

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with the transcripts that you are searching.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     * 
     * @return The unique identifier of the bot associated with the transcripts that you are searching.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with the transcripts that you are searching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot containing the transcripts that you are searching.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     * 
     * @return The version of the bot containing the transcripts that you are searching.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot containing the transcripts that you are searching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the transcripts to search. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @return The identifier of the language and locale of the transcripts to search. The string must match one of the
     *         supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the transcripts to search. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation associated with the transcripts to search.
     */

    public void setBotRecommendationId(String botRecommendationId) {
        this.botRecommendationId = botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     * 
     * @return The unique identifier of the bot recommendation associated with the transcripts to search.
     */

    public String getBotRecommendationId() {
        return this.botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation associated with the transcripts to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withBotRecommendationId(String botRecommendationId) {
        setBotRecommendationId(botRecommendationId);
        return this;
    }

    /**
     * <p>
     * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * </p>
     * 
     * @param searchOrder
     *        How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * @see SearchOrder
     */

    public void setSearchOrder(String searchOrder) {
        this.searchOrder = searchOrder;
    }

    /**
     * <p>
     * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * </p>
     * 
     * @return How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * @see SearchOrder
     */

    public String getSearchOrder() {
        return this.searchOrder;
    }

    /**
     * <p>
     * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * </p>
     * 
     * @param searchOrder
     *        How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchOrder
     */

    public SearchAssociatedTranscriptsRequest withSearchOrder(String searchOrder) {
        setSearchOrder(searchOrder);
        return this;
    }

    /**
     * <p>
     * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * </p>
     * 
     * @param searchOrder
     *        How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchOrder
     */

    public SearchAssociatedTranscriptsRequest withSearchOrder(SearchOrder searchOrder) {
        this.searchOrder = searchOrder.toString();
        return this;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @return A list of filter objects.
     */

    public java.util.List<AssociatedTranscriptFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     */

    public void setFilters(java.util.Collection<AssociatedTranscriptFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<AssociatedTranscriptFilter>(filters);
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withFilters(AssociatedTranscriptFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<AssociatedTranscriptFilter>(filters.length));
        }
        for (AssociatedTranscriptFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withFilters(java.util.Collection<AssociatedTranscriptFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the
     * max page size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of bot recommendations to return in each page of results. If there are fewer results
     *        than the max page size, only the actual number of results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the
     * max page size, only the actual number of results are returned.
     * </p>
     * 
     * @return The maximum number of bot recommendations to return in each page of results. If there are fewer results
     *         than the max page size, only the actual number of results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the
     * max page size, only the actual number of results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of bot recommendations to return in each page of results. If there are fewer results
     *        than the max page size, only the actual number of results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified in the
     * maxResults parameter, an index is returned in the response. Use that index in the nextIndex parameter to return
     * the next page of results.
     * </p>
     * 
     * @param nextIndex
     *        If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified
     *        in the maxResults parameter, an index is returned in the response. Use that index in the nextIndex
     *        parameter to return the next page of results.
     */

    public void setNextIndex(Integer nextIndex) {
        this.nextIndex = nextIndex;
    }

    /**
     * <p>
     * If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified in the
     * maxResults parameter, an index is returned in the response. Use that index in the nextIndex parameter to return
     * the next page of results.
     * </p>
     * 
     * @return If the response from the SearchAssociatedTranscriptsRequest operation contains more results than
     *         specified in the maxResults parameter, an index is returned in the response. Use that index in the
     *         nextIndex parameter to return the next page of results.
     */

    public Integer getNextIndex() {
        return this.nextIndex;
    }

    /**
     * <p>
     * If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified in the
     * maxResults parameter, an index is returned in the response. Use that index in the nextIndex parameter to return
     * the next page of results.
     * </p>
     * 
     * @param nextIndex
     *        If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified
     *        in the maxResults parameter, an index is returned in the response. Use that index in the nextIndex
     *        parameter to return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsRequest withNextIndex(Integer nextIndex) {
        setNextIndex(nextIndex);
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
        if (getBotRecommendationId() != null)
            sb.append("BotRecommendationId: ").append(getBotRecommendationId()).append(",");
        if (getSearchOrder() != null)
            sb.append("SearchOrder: ").append(getSearchOrder()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextIndex() != null)
            sb.append("NextIndex: ").append(getNextIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAssociatedTranscriptsRequest == false)
            return false;
        SearchAssociatedTranscriptsRequest other = (SearchAssociatedTranscriptsRequest) obj;
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
        if (other.getBotRecommendationId() == null ^ this.getBotRecommendationId() == null)
            return false;
        if (other.getBotRecommendationId() != null && other.getBotRecommendationId().equals(this.getBotRecommendationId()) == false)
            return false;
        if (other.getSearchOrder() == null ^ this.getSearchOrder() == null)
            return false;
        if (other.getSearchOrder() != null && other.getSearchOrder().equals(this.getSearchOrder()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextIndex() == null ^ this.getNextIndex() == null)
            return false;
        if (other.getNextIndex() != null && other.getNextIndex().equals(this.getNextIndex()) == false)
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
        hashCode = prime * hashCode + ((getBotRecommendationId() == null) ? 0 : getBotRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getSearchOrder() == null) ? 0 : getSearchOrder().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextIndex() == null) ? 0 : getNextIndex().hashCode());
        return hashCode;
    }

    @Override
    public SearchAssociatedTranscriptsRequest clone() {
        return (SearchAssociatedTranscriptsRequest) super.clone();
    }

}
