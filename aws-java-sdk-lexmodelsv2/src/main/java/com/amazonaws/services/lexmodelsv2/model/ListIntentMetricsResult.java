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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntentMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent metrics.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The results for the intent metrics.
     * </p>
     */
    private java.util.List<AnalyticsIntentResult> results;
    /**
     * <p>
     * If the response from the ListIntentMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentMetrics operation until the nextToken returned in the
     * response is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you retrieved intent metrics.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent metrics.
     * </p>
     * 
     * @return The identifier for the bot for which you retrieved intent metrics.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you retrieved intent metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you retrieved intent metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentMetricsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The results for the intent metrics.
     * </p>
     * 
     * @return The results for the intent metrics.
     */

    public java.util.List<AnalyticsIntentResult> getResults() {
        return results;
    }

    /**
     * <p>
     * The results for the intent metrics.
     * </p>
     * 
     * @param results
     *        The results for the intent metrics.
     */

    public void setResults(java.util.Collection<AnalyticsIntentResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<AnalyticsIntentResult>(results);
    }

    /**
     * <p>
     * The results for the intent metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        The results for the intent metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentMetricsResult withResults(AnalyticsIntentResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<AnalyticsIntentResult>(results.length));
        }
        for (AnalyticsIntentResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results for the intent metrics.
     * </p>
     * 
     * @param results
     *        The results for the intent metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentMetricsResult withResults(java.util.Collection<AnalyticsIntentResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * If the response from the ListIntentMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentMetrics operation until the nextToken returned in the
     * response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListIntentMetrics operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page
     *        of results. For a complete set of results, call the ListIntentMetrics operation until the nextToken
     *        returned in the response is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response from the ListIntentMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentMetrics operation until the nextToken returned in the
     * response is null.
     * </p>
     * 
     * @return If the response from the ListIntentMetrics operation contains more results than specified in the
     *         maxResults parameter, a token is returned in the response.</p>
     *         <p>
     *         Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page
     *         of results. For a complete set of results, call the ListIntentMetrics operation until the nextToken
     *         returned in the response is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response from the ListIntentMetrics operation contains more results than specified in the maxResults
     * parameter, a token is returned in the response.
     * </p>
     * <p>
     * Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page of
     * results. For a complete set of results, call the ListIntentMetrics operation until the nextToken returned in the
     * response is null.
     * </p>
     * 
     * @param nextToken
     *        If the response from the ListIntentMetrics operation contains more results than specified in the
     *        maxResults parameter, a token is returned in the response.</p>
     *        <p>
     *        Use the returned token in the nextToken parameter of a ListIntentMetrics request to return the next page
     *        of results. For a complete set of results, call the ListIntentMetrics operation until the nextToken
     *        returned in the response is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentMetricsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListIntentMetricsResult == false)
            return false;
        ListIntentMetricsResult other = (ListIntentMetricsResult) obj;
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
    public ListIntentMetricsResult clone() {
        try {
            return (ListIntentMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
