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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentStageMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntentStageMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent stage metrics.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The results for the intent stage metrics.
     * </p>
     */
    private java.util.List<AnalyticsIntentStageResult> results;
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
     * The identifier for the bot for which you retrieved intent stage metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you retrieved intent stage metrics.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent stage metrics.
     * </p>
     * 
     * @return The identifier for the bot for which you retrieved intent stage metrics.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent stage metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you retrieved intent stage metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The results for the intent stage metrics.
     * </p>
     * 
     * @return The results for the intent stage metrics.
     */

    public java.util.List<AnalyticsIntentStageResult> getResults() {
        return results;
    }

    /**
     * <p>
     * The results for the intent stage metrics.
     * </p>
     * 
     * @param results
     *        The results for the intent stage metrics.
     */

    public void setResults(java.util.Collection<AnalyticsIntentStageResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<AnalyticsIntentStageResult>(results);
    }

    /**
     * <p>
     * The results for the intent stage metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        The results for the intent stage metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsResult withResults(AnalyticsIntentStageResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<AnalyticsIntentStageResult>(results.length));
        }
        for (AnalyticsIntentStageResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results for the intent stage metrics.
     * </p>
     * 
     * @param results
     *        The results for the intent stage metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentStageMetricsResult withResults(java.util.Collection<AnalyticsIntentStageResult> results) {
        setResults(results);
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

    public ListIntentStageMetricsResult withNextToken(String nextToken) {
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
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

        if (obj instanceof ListIntentStageMetricsResult == false)
            return false;
        ListIntentStageMetricsResult other = (ListIntentStageMetricsResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
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
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIntentStageMetricsResult clone() {
        try {
            return (ListIntentStageMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
