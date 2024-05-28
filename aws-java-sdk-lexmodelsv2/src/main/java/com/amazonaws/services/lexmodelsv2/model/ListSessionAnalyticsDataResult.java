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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSessionAnalyticsData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSessionAnalyticsDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that the sessions belong to.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListSessionAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of objects, each of which contains information about a session with the bot.
     * </p>
     */
    private java.util.List<SessionSpecification> sessions;

    /**
     * <p>
     * The unique identifier of the bot that the sessions belong to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that the sessions belong to.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that the sessions belong to.
     * </p>
     * 
     * @return The unique identifier of the bot that the sessions belong to.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that the sessions belong to.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that the sessions belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionAnalyticsDataResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListSessionAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the next
     *        page of results. For a complete set of results, call the ListSessionAnalyticsData operation until the
     *        nextToken returned in the response is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListSessionAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     * 
     * @return If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     *         maxResults parameter, a token is returned in the response.</p>
     *         <p>
     *         Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the
     *         next page of results. For a complete set of results, call the ListSessionAnalyticsData operation until
     *         the nextToken returned in the response is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     * maxResults parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the next page
     * of results. For a complete set of results, call the ListSessionAnalyticsData operation until the nextToken
     * returned in the response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListSessionAnalyticsData operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListSessionAnalyticsData request to return the next
     *        page of results. For a complete set of results, call the ListSessionAnalyticsData operation until the
     *        nextToken returned in the response is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionAnalyticsDataResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a session with the bot.
     * </p>
     * 
     * @return A list of objects, each of which contains information about a session with the bot.
     */

    public java.util.List<SessionSpecification> getSessions() {
        return sessions;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a session with the bot.
     * </p>
     * 
     * @param sessions
     *        A list of objects, each of which contains information about a session with the bot.
     */

    public void setSessions(java.util.Collection<SessionSpecification> sessions) {
        if (sessions == null) {
            this.sessions = null;
            return;
        }

        this.sessions = new java.util.ArrayList<SessionSpecification>(sessions);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a session with the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessions(java.util.Collection)} or {@link #withSessions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sessions
     *        A list of objects, each of which contains information about a session with the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionAnalyticsDataResult withSessions(SessionSpecification... sessions) {
        if (this.sessions == null) {
            setSessions(new java.util.ArrayList<SessionSpecification>(sessions.length));
        }
        for (SessionSpecification ele : sessions) {
            this.sessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a session with the bot.
     * </p>
     * 
     * @param sessions
     *        A list of objects, each of which contains information about a session with the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionAnalyticsDataResult withSessions(java.util.Collection<SessionSpecification> sessions) {
        setSessions(sessions);
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
        if (getSessions() != null)
            sb.append("Sessions: ").append(getSessions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSessionAnalyticsDataResult == false)
            return false;
        ListSessionAnalyticsDataResult other = (ListSessionAnalyticsDataResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSessions() == null ^ this.getSessions() == null)
            return false;
        if (other.getSessions() != null && other.getSessions().equals(this.getSessions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSessions() == null) ? 0 : getSessions().hashCode());
        return hashCode;
    }

    @Override
    public ListSessionAnalyticsDataResult clone() {
        try {
            return (ListSessionAnalyticsDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
