/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * </p>
     */
    private java.util.List<BotAliasMetadata> botAliases;
    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * </p>
     * 
     * @return An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     */

    public java.util.List<BotAliasMetadata> getBotAliases() {
        return botAliases;
    }

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * </p>
     * 
     * @param botAliases
     *        An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     */

    public void setBotAliases(java.util.Collection<BotAliasMetadata> botAliases) {
        if (botAliases == null) {
            this.botAliases = null;
            return;
        }

        this.botAliases = new java.util.ArrayList<BotAliasMetadata>(botAliases);
    }

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotAliases(java.util.Collection)} or {@link #withBotAliases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param botAliases
     *        An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesResult withBotAliases(BotAliasMetadata... botAliases) {
        if (this.botAliases == null) {
            setBotAliases(new java.util.ArrayList<BotAliasMetadata>(botAliases.length));
        }
        for (BotAliasMetadata ele : botAliases) {
            this.botAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * </p>
     * 
     * @param botAliases
     *        An array of <code>BotAliasMetadata</code> objects, each describing a bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesResult withBotAliases(java.util.Collection<BotAliasMetadata> botAliases) {
        setBotAliases(botAliases);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon
     *        Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination
     *        token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     * 
     * @return A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon
     *         Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination
     *         token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon
     *        Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination
     *        token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesResult withNextToken(String nextToken) {
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
        if (getBotAliases() != null)
            sb.append("BotAliases: ").append(getBotAliases()).append(",");
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

        if (obj instanceof GetBotAliasesResult == false)
            return false;
        GetBotAliasesResult other = (GetBotAliasesResult) obj;
        if (other.getBotAliases() == null ^ this.getBotAliases() == null)
            return false;
        if (other.getBotAliases() != null && other.getBotAliases().equals(this.getBotAliases()) == false)
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

        hashCode = prime * hashCode + ((getBotAliases() == null) ? 0 : getBotAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBotAliasesResult clone() {
        try {
            return (GetBotAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
