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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBuiltinIntentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * </p>
     */
    private java.util.List<BuiltinIntentMetadata> intents;
    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token
     * in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * </p>
     * 
     * @return An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     */

    public java.util.List<BuiltinIntentMetadata> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * </p>
     * 
     * @param intents
     *        An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     */

    public void setIntents(java.util.Collection<BuiltinIntentMetadata> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<BuiltinIntentMetadata>(intents);
    }

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntents(java.util.Collection)} or {@link #withIntents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param intents
     *        An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentsResult withIntents(BuiltinIntentMetadata... intents) {
        if (this.intents == null) {
            setIntents(new java.util.ArrayList<BuiltinIntentMetadata>(intents.length));
        }
        for (BuiltinIntentMetadata ele : intents) {
            this.intents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * </p>
     * 
     * @param intents
     *        An array of <code>builtinIntentMetadata</code> objects, one for each intent in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentsResult withIntents(java.util.Collection<BuiltinIntentMetadata> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of intents. If the response to this API call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the
     *        pagination token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token
     * in the next request.
     * </p>
     * 
     * @return A pagination token that fetches the next page of intents. If the response to this API call is truncated,
     *         Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the
     *         pagination token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of intents. If the response to this API call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the
     *        pagination token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentsResult withNextToken(String nextToken) {
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
        if (getIntents() != null)
            sb.append("Intents: ").append(getIntents()).append(",");
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

        if (obj instanceof GetBuiltinIntentsResult == false)
            return false;
        GetBuiltinIntentsResult other = (GetBuiltinIntentsResult) obj;
        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
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

        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBuiltinIntentsResult clone() {
        try {
            return (GetBuiltinIntentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
