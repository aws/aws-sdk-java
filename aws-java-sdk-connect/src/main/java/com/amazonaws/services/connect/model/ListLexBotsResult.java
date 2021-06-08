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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLexBots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLexBotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names and Regions of the Amazon Lex bots associated with the specified instance.
     * </p>
     */
    private java.util.List<LexBot> lexBots;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names and Regions of the Amazon Lex bots associated with the specified instance.
     * </p>
     * 
     * @return The names and Regions of the Amazon Lex bots associated with the specified instance.
     */

    public java.util.List<LexBot> getLexBots() {
        return lexBots;
    }

    /**
     * <p>
     * The names and Regions of the Amazon Lex bots associated with the specified instance.
     * </p>
     * 
     * @param lexBots
     *        The names and Regions of the Amazon Lex bots associated with the specified instance.
     */

    public void setLexBots(java.util.Collection<LexBot> lexBots) {
        if (lexBots == null) {
            this.lexBots = null;
            return;
        }

        this.lexBots = new java.util.ArrayList<LexBot>(lexBots);
    }

    /**
     * <p>
     * The names and Regions of the Amazon Lex bots associated with the specified instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLexBots(java.util.Collection)} or {@link #withLexBots(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param lexBots
     *        The names and Regions of the Amazon Lex bots associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLexBotsResult withLexBots(LexBot... lexBots) {
        if (this.lexBots == null) {
            setLexBots(new java.util.ArrayList<LexBot>(lexBots.length));
        }
        for (LexBot ele : lexBots) {
            this.lexBots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names and Regions of the Amazon Lex bots associated with the specified instance.
     * </p>
     * 
     * @param lexBots
     *        The names and Regions of the Amazon Lex bots associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLexBotsResult withLexBots(java.util.Collection<LexBot> lexBots) {
        setLexBots(lexBots);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLexBotsResult withNextToken(String nextToken) {
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
        if (getLexBots() != null)
            sb.append("LexBots: ").append(getLexBots()).append(",");
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

        if (obj instanceof ListLexBotsResult == false)
            return false;
        ListLexBotsResult other = (ListLexBotsResult) obj;
        if (other.getLexBots() == null ^ this.getLexBots() == null)
            return false;
        if (other.getLexBots() != null && other.getLexBots().equals(this.getLexBots()) == false)
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

        hashCode = prime * hashCode + ((getLexBots() == null) ? 0 : getLexBots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLexBotsResult clone() {
        try {
            return (ListLexBotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
