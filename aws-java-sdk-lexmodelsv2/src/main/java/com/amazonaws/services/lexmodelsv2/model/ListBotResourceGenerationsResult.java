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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotResourceGenerations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotResourceGenerationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot for which the generation requests were made.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot for which the generation requests were made.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot for which the generation requests were made.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * A list of objects, each containing information about a generation request for the bot locale.
     * </p>
     */
    private java.util.List<GenerationSummary> generationSummaries;
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
     * The unique identifier of the bot for which the generation requests were made.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which the generation requests were made.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which the generation requests were made.
     * </p>
     * 
     * @return The unique identifier of the bot for which the generation requests were made.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which the generation requests were made.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which the generation requests were made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot for which the generation requests were made.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which the generation requests were made.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot for which the generation requests were made.
     * </p>
     * 
     * @return The version of the bot for which the generation requests were made.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot for which the generation requests were made.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which the generation requests were made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot for which the generation requests were made.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which the generation requests were made.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot for which the generation requests were made.
     * </p>
     * 
     * @return The locale of the bot for which the generation requests were made.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot for which the generation requests were made.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which the generation requests were made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * A list of objects, each containing information about a generation request for the bot locale.
     * </p>
     * 
     * @return A list of objects, each containing information about a generation request for the bot locale.
     */

    public java.util.List<GenerationSummary> getGenerationSummaries() {
        return generationSummaries;
    }

    /**
     * <p>
     * A list of objects, each containing information about a generation request for the bot locale.
     * </p>
     * 
     * @param generationSummaries
     *        A list of objects, each containing information about a generation request for the bot locale.
     */

    public void setGenerationSummaries(java.util.Collection<GenerationSummary> generationSummaries) {
        if (generationSummaries == null) {
            this.generationSummaries = null;
            return;
        }

        this.generationSummaries = new java.util.ArrayList<GenerationSummary>(generationSummaries);
    }

    /**
     * <p>
     * A list of objects, each containing information about a generation request for the bot locale.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGenerationSummaries(java.util.Collection)} or {@link #withGenerationSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param generationSummaries
     *        A list of objects, each containing information about a generation request for the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsResult withGenerationSummaries(GenerationSummary... generationSummaries) {
        if (this.generationSummaries == null) {
            setGenerationSummaries(new java.util.ArrayList<GenerationSummary>(generationSummaries.length));
        }
        for (GenerationSummary ele : generationSummaries) {
            this.generationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each containing information about a generation request for the bot locale.
     * </p>
     * 
     * @param generationSummaries
     *        A list of objects, each containing information about a generation request for the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotResourceGenerationsResult withGenerationSummaries(java.util.Collection<GenerationSummary> generationSummaries) {
        setGenerationSummaries(generationSummaries);
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

    public ListBotResourceGenerationsResult withNextToken(String nextToken) {
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
        if (getGenerationSummaries() != null)
            sb.append("GenerationSummaries: ").append(getGenerationSummaries()).append(",");
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

        if (obj instanceof ListBotResourceGenerationsResult == false)
            return false;
        ListBotResourceGenerationsResult other = (ListBotResourceGenerationsResult) obj;
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
        if (other.getGenerationSummaries() == null ^ this.getGenerationSummaries() == null)
            return false;
        if (other.getGenerationSummaries() != null && other.getGenerationSummaries().equals(this.getGenerationSummaries()) == false)
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
        hashCode = prime * hashCode + ((getGenerationSummaries() == null) ? 0 : getGenerationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotResourceGenerationsResult clone() {
        try {
            return (ListBotResourceGenerationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
