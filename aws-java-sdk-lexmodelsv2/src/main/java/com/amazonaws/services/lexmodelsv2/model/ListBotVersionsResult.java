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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot to list versions for.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * Summary information for the bot versions that meet the filter criteria specified in the request. The length of
     * the list is specified in the <code>maxResults</code> parameter of the request. If there are more versions
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<BotVersionSummary> botVersionSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotVersions</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotAliases</code> operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the bot to list versions for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to list versions for.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to list versions for.
     * </p>
     * 
     * @return The identifier of the bot to list versions for.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to list versions for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to list versions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * Summary information for the bot versions that meet the filter criteria specified in the request. The length of
     * the list is specified in the <code>maxResults</code> parameter of the request. If there are more versions
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the bot versions that meet the filter criteria specified in the request. The
     *         length of the list is specified in the <code>maxResults</code> parameter of the request. If there are
     *         more versions available, the <code>nextToken</code> field contains a token to get the next page of
     *         results.
     */

    public java.util.List<BotVersionSummary> getBotVersionSummaries() {
        return botVersionSummaries;
    }

    /**
     * <p>
     * Summary information for the bot versions that meet the filter criteria specified in the request. The length of
     * the list is specified in the <code>maxResults</code> parameter of the request. If there are more versions
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param botVersionSummaries
     *        Summary information for the bot versions that meet the filter criteria specified in the request. The
     *        length of the list is specified in the <code>maxResults</code> parameter of the request. If there are more
     *        versions available, the <code>nextToken</code> field contains a token to get the next page of results.
     */

    public void setBotVersionSummaries(java.util.Collection<BotVersionSummary> botVersionSummaries) {
        if (botVersionSummaries == null) {
            this.botVersionSummaries = null;
            return;
        }

        this.botVersionSummaries = new java.util.ArrayList<BotVersionSummary>(botVersionSummaries);
    }

    /**
     * <p>
     * Summary information for the bot versions that meet the filter criteria specified in the request. The length of
     * the list is specified in the <code>maxResults</code> parameter of the request. If there are more versions
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotVersionSummaries(java.util.Collection)} or {@link #withBotVersionSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param botVersionSummaries
     *        Summary information for the bot versions that meet the filter criteria specified in the request. The
     *        length of the list is specified in the <code>maxResults</code> parameter of the request. If there are more
     *        versions available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionsResult withBotVersionSummaries(BotVersionSummary... botVersionSummaries) {
        if (this.botVersionSummaries == null) {
            setBotVersionSummaries(new java.util.ArrayList<BotVersionSummary>(botVersionSummaries.length));
        }
        for (BotVersionSummary ele : botVersionSummaries) {
            this.botVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the bot versions that meet the filter criteria specified in the request. The length of
     * the list is specified in the <code>maxResults</code> parameter of the request. If there are more versions
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param botVersionSummaries
     *        Summary information for the bot versions that meet the filter criteria specified in the request. The
     *        length of the list is specified in the <code>maxResults</code> parameter of the request. If there are more
     *        versions available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionsResult withBotVersionSummaries(java.util.Collection<BotVersionSummary> botVersionSummaries) {
        setBotVersionSummaries(botVersionSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotVersions</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotAliases</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListBotVersions</code> operation. If the <code>nextToken</code> field is present, you send the
     *        contents as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get
     *        the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotVersions</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotAliases</code> operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListBotVersions</code> operation. If the <code>nextToken</code> field is present, you send the
     *         contents as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to
     *         get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBotVersions</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBotAliases</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListBotVersions</code> operation. If the <code>nextToken</code> field is present, you send the
     *        contents as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get
     *        the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotVersionsResult withNextToken(String nextToken) {
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
        if (getBotVersionSummaries() != null)
            sb.append("BotVersionSummaries: ").append(getBotVersionSummaries()).append(",");
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

        if (obj instanceof ListBotVersionsResult == false)
            return false;
        ListBotVersionsResult other = (ListBotVersionsResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersionSummaries() == null ^ this.getBotVersionSummaries() == null)
            return false;
        if (other.getBotVersionSummaries() != null && other.getBotVersionSummaries().equals(this.getBotVersionSummaries()) == false)
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
        hashCode = prime * hashCode + ((getBotVersionSummaries() == null) ? 0 : getBotVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotVersionsResult clone() {
        try {
            return (ListBotVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
