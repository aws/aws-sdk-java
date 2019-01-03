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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListLexicons" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLexiconsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     */
    private java.util.List<LexiconDescription> lexicons;
    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of lexicons. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     * 
     * @return A list of lexicon names and attributes.
     */

    public java.util.List<LexiconDescription> getLexicons() {
        return lexicons;
    }

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     * 
     * @param lexicons
     *        A list of lexicon names and attributes.
     */

    public void setLexicons(java.util.Collection<LexiconDescription> lexicons) {
        if (lexicons == null) {
            this.lexicons = null;
            return;
        }

        this.lexicons = new java.util.ArrayList<LexiconDescription>(lexicons);
    }

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLexicons(java.util.Collection)} or {@link #withLexicons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param lexicons
     *        A list of lexicon names and attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLexiconsResult withLexicons(LexiconDescription... lexicons) {
        if (this.lexicons == null) {
            setLexicons(new java.util.ArrayList<LexiconDescription>(lexicons.length));
        }
        for (LexiconDescription ele : lexicons) {
            this.lexicons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     * 
     * @param lexicons
     *        A list of lexicon names and attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLexiconsResult withLexicons(java.util.Collection<LexiconDescription> lexicons) {
        setLexicons(lexicons);
        return this;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of lexicons. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use in the next request to continue the listing of lexicons.
     *        <code>NextToken</code> is returned only if the response is truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of lexicons. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     * 
     * @return The pagination token to use in the next request to continue the listing of lexicons.
     *         <code>NextToken</code> is returned only if the response is truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of lexicons. <code>NextToken</code> is
     * returned only if the response is truncated.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use in the next request to continue the listing of lexicons.
     *        <code>NextToken</code> is returned only if the response is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLexiconsResult withNextToken(String nextToken) {
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
        if (getLexicons() != null)
            sb.append("Lexicons: ").append(getLexicons()).append(",");
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

        if (obj instanceof ListLexiconsResult == false)
            return false;
        ListLexiconsResult other = (ListLexiconsResult) obj;
        if (other.getLexicons() == null ^ this.getLexicons() == null)
            return false;
        if (other.getLexicons() != null && other.getLexicons().equals(this.getLexicons()) == false)
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

        hashCode = prime * hashCode + ((getLexicons() == null) ? 0 : getLexicons().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLexiconsResult clone() {
        try {
            return (ListLexiconsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
