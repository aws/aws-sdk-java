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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that contains the bot recommendation list.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the bot recommendation list.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation list.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * Summary information for the bot recommendations that meet the filter specified in this request. The length of the
     * list is specified in the maxResults parameter of the request. If there are more bot recommendations available,
     * the nextToken field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<BotRecommendationSummary> botRecommendationSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListBotRecommendations
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListBotRecommendations operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the bot that contains the bot recommendation list.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the bot recommendation list.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the bot recommendation list.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the bot recommendation list.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the bot recommendation list.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the bot recommendation list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotRecommendationsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the bot recommendation list.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the bot recommendation list.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the bot recommendation list.
     * </p>
     * 
     * @return The version of the bot that contains the bot recommendation list.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the bot recommendation list.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the bot recommendation list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotRecommendationsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation list.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the bot recommendation list.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation list.
     * </p>
     * 
     * @return The identifier of the language and locale of the bot recommendation list.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the bot recommendation list.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the bot recommendation list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotRecommendationsResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * Summary information for the bot recommendations that meet the filter specified in this request. The length of the
     * list is specified in the maxResults parameter of the request. If there are more bot recommendations available,
     * the nextToken field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the bot recommendations that meet the filter specified in this request. The
     *         length of the list is specified in the maxResults parameter of the request. If there are more bot
     *         recommendations available, the nextToken field contains a token to get the next page of results.
     */

    public java.util.List<BotRecommendationSummary> getBotRecommendationSummaries() {
        return botRecommendationSummaries;
    }

    /**
     * <p>
     * Summary information for the bot recommendations that meet the filter specified in this request. The length of the
     * list is specified in the maxResults parameter of the request. If there are more bot recommendations available,
     * the nextToken field contains a token to get the next page of results.
     * </p>
     * 
     * @param botRecommendationSummaries
     *        Summary information for the bot recommendations that meet the filter specified in this request. The length
     *        of the list is specified in the maxResults parameter of the request. If there are more bot recommendations
     *        available, the nextToken field contains a token to get the next page of results.
     */

    public void setBotRecommendationSummaries(java.util.Collection<BotRecommendationSummary> botRecommendationSummaries) {
        if (botRecommendationSummaries == null) {
            this.botRecommendationSummaries = null;
            return;
        }

        this.botRecommendationSummaries = new java.util.ArrayList<BotRecommendationSummary>(botRecommendationSummaries);
    }

    /**
     * <p>
     * Summary information for the bot recommendations that meet the filter specified in this request. The length of the
     * list is specified in the maxResults parameter of the request. If there are more bot recommendations available,
     * the nextToken field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotRecommendationSummaries(java.util.Collection)} or
     * {@link #withBotRecommendationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param botRecommendationSummaries
     *        Summary information for the bot recommendations that meet the filter specified in this request. The length
     *        of the list is specified in the maxResults parameter of the request. If there are more bot recommendations
     *        available, the nextToken field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotRecommendationsResult withBotRecommendationSummaries(BotRecommendationSummary... botRecommendationSummaries) {
        if (this.botRecommendationSummaries == null) {
            setBotRecommendationSummaries(new java.util.ArrayList<BotRecommendationSummary>(botRecommendationSummaries.length));
        }
        for (BotRecommendationSummary ele : botRecommendationSummaries) {
            this.botRecommendationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the bot recommendations that meet the filter specified in this request. The length of the
     * list is specified in the maxResults parameter of the request. If there are more bot recommendations available,
     * the nextToken field contains a token to get the next page of results.
     * </p>
     * 
     * @param botRecommendationSummaries
     *        Summary information for the bot recommendations that meet the filter specified in this request. The length
     *        of the list is specified in the maxResults parameter of the request. If there are more bot recommendations
     *        available, the nextToken field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotRecommendationsResult withBotRecommendationSummaries(java.util.Collection<BotRecommendationSummary> botRecommendationSummaries) {
        setBotRecommendationSummaries(botRecommendationSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListBotRecommendations
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListBotRecommendations operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        ListBotRecommendations operation. If the nextToken field is present, you send the contents as the
     *        nextToken parameter of a ListBotRecommendations operation request to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListBotRecommendations
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListBotRecommendations operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         ListBotRecommendations operation. If the nextToken field is present, you send the contents as the
     *         nextToken parameter of a ListBotRecommendations operation request to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the ListBotRecommendations
     * operation. If the nextToken field is present, you send the contents as the nextToken parameter of a
     * ListBotRecommendations operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        ListBotRecommendations operation. If the nextToken field is present, you send the contents as the
     *        nextToken parameter of a ListBotRecommendations operation request to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotRecommendationsResult withNextToken(String nextToken) {
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
        if (getBotRecommendationSummaries() != null)
            sb.append("BotRecommendationSummaries: ").append(getBotRecommendationSummaries()).append(",");
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

        if (obj instanceof ListBotRecommendationsResult == false)
            return false;
        ListBotRecommendationsResult other = (ListBotRecommendationsResult) obj;
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
        if (other.getBotRecommendationSummaries() == null ^ this.getBotRecommendationSummaries() == null)
            return false;
        if (other.getBotRecommendationSummaries() != null && other.getBotRecommendationSummaries().equals(this.getBotRecommendationSummaries()) == false)
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
        hashCode = prime * hashCode + ((getBotRecommendationSummaries() == null) ? 0 : getBotRecommendationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotRecommendationsResult clone() {
        try {
            return (ListBotRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
