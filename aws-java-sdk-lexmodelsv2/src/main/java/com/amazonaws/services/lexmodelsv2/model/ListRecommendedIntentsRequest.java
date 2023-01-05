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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListRecommendedIntents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendedIntentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot associated with the recommended intents.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the recommended intents.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale of the recommended intents.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the bot recommendation that contains the recommended intents.
     * </p>
     */
    private String botRecommendationId;
    /**
     * <p>
     * If the response from the ListRecommendedIntents operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the
     * max page size, only the actual number of results are returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier of the bot associated with the recommended intents.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with the recommended intents.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with the recommended intents.
     * </p>
     * 
     * @return The unique identifier of the bot associated with the recommended intents.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with the recommended intents.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with the recommended intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendedIntentsRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the recommended intents.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the recommended intents.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the recommended intents.
     * </p>
     * 
     * @return The version of the bot that contains the recommended intents.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the recommended intents.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the recommended intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendedIntentsRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale of the recommended intents.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the recommended intents.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the recommended intents.
     * </p>
     * 
     * @return The identifier of the language and locale of the recommended intents.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the recommended intents.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the recommended intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendedIntentsRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot recommendation that contains the recommended intents.
     * </p>
     * 
     * @param botRecommendationId
     *        The identifier of the bot recommendation that contains the recommended intents.
     */

    public void setBotRecommendationId(String botRecommendationId) {
        this.botRecommendationId = botRecommendationId;
    }

    /**
     * <p>
     * The identifier of the bot recommendation that contains the recommended intents.
     * </p>
     * 
     * @return The identifier of the bot recommendation that contains the recommended intents.
     */

    public String getBotRecommendationId() {
        return this.botRecommendationId;
    }

    /**
     * <p>
     * The identifier of the bot recommendation that contains the recommended intents.
     * </p>
     * 
     * @param botRecommendationId
     *        The identifier of the bot recommendation that contains the recommended intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendedIntentsRequest withBotRecommendationId(String botRecommendationId) {
        setBotRecommendationId(botRecommendationId);
        return this;
    }

    /**
     * <p>
     * If the response from the ListRecommendedIntents operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListRecommendedIntents operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to
     *        return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the ListRecommendedIntents operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     * 
     * @return If the response from the ListRecommendedIntents operation contains more results than specified in the
     *         maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to
     *         return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the ListRecommendedIntents operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListRecommendedIntents operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to
     *        return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendedIntentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListRecommendedIntentsRequest withMaxResults(Integer maxResults) {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getBotRecommendationId() != null)
            sb.append("BotRecommendationId: ").append(getBotRecommendationId()).append(",");
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

        if (obj instanceof ListRecommendedIntentsRequest == false)
            return false;
        ListRecommendedIntentsRequest other = (ListRecommendedIntentsRequest) obj;
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getBotRecommendationId() == null) ? 0 : getBotRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendedIntentsRequest clone() {
        return (ListRecommendedIntentsRequest) super.clone();
    }

}
