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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListCompositions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCompositionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of the matching Compositions (summary information only).
     * </p>
     */
    private java.util.List<CompositionSummary> compositions;
    /**
     * <p>
     * If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of the matching Compositions (summary information only).
     * </p>
     * 
     * @return List of the matching Compositions (summary information only).
     */

    public java.util.List<CompositionSummary> getCompositions() {
        return compositions;
    }

    /**
     * <p>
     * List of the matching Compositions (summary information only).
     * </p>
     * 
     * @param compositions
     *        List of the matching Compositions (summary information only).
     */

    public void setCompositions(java.util.Collection<CompositionSummary> compositions) {
        if (compositions == null) {
            this.compositions = null;
            return;
        }

        this.compositions = new java.util.ArrayList<CompositionSummary>(compositions);
    }

    /**
     * <p>
     * List of the matching Compositions (summary information only).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompositions(java.util.Collection)} or {@link #withCompositions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param compositions
     *        List of the matching Compositions (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsResult withCompositions(CompositionSummary... compositions) {
        if (this.compositions == null) {
            setCompositions(new java.util.ArrayList<CompositionSummary>(compositions.length));
        }
        for (CompositionSummary ele : compositions) {
            this.compositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching Compositions (summary information only).
     * </p>
     * 
     * @param compositions
     *        List of the matching Compositions (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsResult withCompositions(java.util.Collection<CompositionSummary> compositions) {
        setCompositions(compositions);
        return this;
    }

    /**
     * <p>
     * If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *        get the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @return If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *         get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more compositions than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *        get the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompositionsResult withNextToken(String nextToken) {
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
        if (getCompositions() != null)
            sb.append("Compositions: ").append(getCompositions()).append(",");
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

        if (obj instanceof ListCompositionsResult == false)
            return false;
        ListCompositionsResult other = (ListCompositionsResult) obj;
        if (other.getCompositions() == null ^ this.getCompositions() == null)
            return false;
        if (other.getCompositions() != null && other.getCompositions().equals(this.getCompositions()) == false)
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

        hashCode = prime * hashCode + ((getCompositions() == null) ? 0 : getCompositions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCompositionsResult clone() {
        try {
            return (ListCompositionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
