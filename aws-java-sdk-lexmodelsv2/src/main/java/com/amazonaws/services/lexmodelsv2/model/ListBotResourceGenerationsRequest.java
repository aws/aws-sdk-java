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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotResourceGenerations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotResourceGenerationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot whose generation requests you want to view.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot whose generation requests you want to view.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot whose generation requests you want to view.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * An object containing information about the attribute and the method by which to sort the results
     * </p>
     */
    private GenerationSortBy sortBy;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the total number of results is greater than the number specified in the <code>maxResults</code>, the response
     * returns a token in the <code>nextToken</code> field. Use this token when making a request to return the next
     * batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the bot whose generation requests you want to view.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot whose generation requests you want to view.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot whose generation requests you want to view.
     * </p>
     * 
     * @return The unique identifier of the bot whose generation requests you want to view.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot whose generation requests you want to view.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot whose generation requests you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot whose generation requests you want to view.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot whose generation requests you want to view.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot whose generation requests you want to view.
     * </p>
     * 
     * @return The version of the bot whose generation requests you want to view.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot whose generation requests you want to view.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot whose generation requests you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot whose generation requests you want to view.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot whose generation requests you want to view.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot whose generation requests you want to view.
     * </p>
     * 
     * @return The locale of the bot whose generation requests you want to view.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot whose generation requests you want to view.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot whose generation requests you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * An object containing information about the attribute and the method by which to sort the results
     * </p>
     * 
     * @param sortBy
     *        An object containing information about the attribute and the method by which to sort the results
     */

    public void setSortBy(GenerationSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * An object containing information about the attribute and the method by which to sort the results
     * </p>
     * 
     * @return An object containing information about the attribute and the method by which to sort the results
     */

    public GenerationSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * An object containing information about the attribute and the method by which to sort the results
     * </p>
     * 
     * @param sortBy
     *        An object containing information about the attribute and the method by which to sort the results
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsRequest withSortBy(GenerationSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the number specified in the <code>maxResults</code>, the response
     * returns a token in the <code>nextToken</code> field. Use this token when making a request to return the next
     * batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the number specified in the <code>maxResults</code>, the
     *        response returns a token in the <code>nextToken</code> field. Use this token when making a request to
     *        return the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the number specified in the <code>maxResults</code>, the response
     * returns a token in the <code>nextToken</code> field. Use this token when making a request to return the next
     * batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the number specified in the <code>maxResults</code>, the
     *         response returns a token in the <code>nextToken</code> field. Use this token when making a request to
     *         return the next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the number specified in the <code>maxResults</code>, the response
     * returns a token in the <code>nextToken</code> field. Use this token when making a request to return the next
     * batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the number specified in the <code>maxResults</code>, the
     *        response returns a token in the <code>nextToken</code> field. Use this token when making a request to
     *        return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListBotResourceGenerationsRequest == false)
            return false;
        ListBotResourceGenerationsRequest other = (ListBotResourceGenerationsRequest) obj;
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotResourceGenerationsRequest clone() {
        return (ListBotResourceGenerationsRequest) super.clone();
    }

}
