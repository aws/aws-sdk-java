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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListUtteranceAnalyticsData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUtteranceAnalyticsDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that the utterances belong to.
     * </p>
     */
    private String botId;
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
     * A list of objects, each of which contains information about an utterance in a user session with your bot.
     * </p>
     */
    private java.util.List<UtteranceSpecification> utterances;

    /**
     * <p>
     * The unique identifier of the bot that the utterances belong to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that the utterances belong to.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that the utterances belong to.
     * </p>
     * 
     * @return The unique identifier of the bot that the utterances belong to.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that the utterances belong to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that the utterances belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataResult withBotId(String botId) {
        setBotId(botId);
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

    public ListUtteranceAnalyticsDataResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an utterance in a user session with your bot.
     * </p>
     * 
     * @return A list of objects, each of which contains information about an utterance in a user session with your bot.
     */

    public java.util.List<UtteranceSpecification> getUtterances() {
        return utterances;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an utterance in a user session with your bot.
     * </p>
     * 
     * @param utterances
     *        A list of objects, each of which contains information about an utterance in a user session with your bot.
     */

    public void setUtterances(java.util.Collection<UtteranceSpecification> utterances) {
        if (utterances == null) {
            this.utterances = null;
            return;
        }

        this.utterances = new java.util.ArrayList<UtteranceSpecification>(utterances);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an utterance in a user session with your bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtterances(java.util.Collection)} or {@link #withUtterances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param utterances
     *        A list of objects, each of which contains information about an utterance in a user session with your bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataResult withUtterances(UtteranceSpecification... utterances) {
        if (this.utterances == null) {
            setUtterances(new java.util.ArrayList<UtteranceSpecification>(utterances.length));
        }
        for (UtteranceSpecification ele : utterances) {
            this.utterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an utterance in a user session with your bot.
     * </p>
     * 
     * @param utterances
     *        A list of objects, each of which contains information about an utterance in a user session with your bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUtteranceAnalyticsDataResult withUtterances(java.util.Collection<UtteranceSpecification> utterances) {
        setUtterances(utterances);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getUtterances() != null)
            sb.append("Utterances: ").append(getUtterances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUtteranceAnalyticsDataResult == false)
            return false;
        ListUtteranceAnalyticsDataResult other = (ListUtteranceAnalyticsDataResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUtterances() == null ^ this.getUtterances() == null)
            return false;
        if (other.getUtterances() != null && other.getUtterances().equals(this.getUtterances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getUtterances() == null) ? 0 : getUtterances().hashCode());
        return hashCode;
    }

    @Override
    public ListUtteranceAnalyticsDataResult clone() {
        try {
            return (ListUtteranceAnalyticsDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
