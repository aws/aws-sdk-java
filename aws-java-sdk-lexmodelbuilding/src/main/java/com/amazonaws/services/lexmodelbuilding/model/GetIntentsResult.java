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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     */
    private java.util.List<IntentMetadata> intents;
    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can specify in your next request
     * to fetch the next page of intents.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @return An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     */

    public java.util.List<IntentMetadata> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     */

    public void setIntents(java.util.Collection<IntentMetadata> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<IntentMetadata>(intents);
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntents(java.util.Collection)} or {@link #withIntents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentsResult withIntents(IntentMetadata... intents) {
        if (this.intents == null) {
            setIntents(new java.util.ArrayList<IntentMetadata>(intents.length));
        }
        for (IntentMetadata ele : intents) {
            this.intents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentsResult withIntents(java.util.Collection<IntentMetadata> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can specify in your next request
     * to fetch the next page of intents.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the response includes a pagination token that you can specify in your next
     *        request to fetch the next page of intents.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can specify in your next request
     * to fetch the next page of intents.
     * </p>
     * 
     * @return If the response is truncated, the response includes a pagination token that you can specify in your next
     *         request to fetch the next page of intents.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token that you can specify in your next request
     * to fetch the next page of intents.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the response includes a pagination token that you can specify in your next
     *        request to fetch the next page of intents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentsResult withNextToken(String nextToken) {
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

        if (obj instanceof GetIntentsResult == false)
            return false;
        GetIntentsResult other = (GetIntentsResult) obj;
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
    public GetIntentsResult clone() {
        try {
            return (GetIntentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
