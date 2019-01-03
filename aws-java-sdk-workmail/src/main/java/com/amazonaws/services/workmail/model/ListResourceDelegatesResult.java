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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceDelegatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     */
    private java.util.List<Delegate> delegates;
    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource. While results are still available,
     * it has an associated value. When the last page is reached, the token is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     * 
     * @return One page of the resource's delegates.
     */

    public java.util.List<Delegate> getDelegates() {
        return delegates;
    }

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     * 
     * @param delegates
     *        One page of the resource's delegates.
     */

    public void setDelegates(java.util.Collection<Delegate> delegates) {
        if (delegates == null) {
            this.delegates = null;
            return;
        }

        this.delegates = new java.util.ArrayList<Delegate>(delegates);
    }

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegates(java.util.Collection)} or {@link #withDelegates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param delegates
     *        One page of the resource's delegates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesResult withDelegates(Delegate... delegates) {
        if (this.delegates == null) {
            setDelegates(new java.util.ArrayList<Delegate>(delegates.length));
        }
        for (Delegate ele : delegates) {
            this.delegates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     * 
     * @param delegates
     *        One page of the resource's delegates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesResult withDelegates(java.util.Collection<Delegate> delegates) {
        setDelegates(delegates);
        return this;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource. While results are still available,
     * it has an associated value. When the last page is reached, the token is empty.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate through the delegates associated with a resource. While results are still
     *        available, it has an associated value. When the last page is reached, the token is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource. While results are still available,
     * it has an associated value. When the last page is reached, the token is empty.
     * </p>
     * 
     * @return The token used to paginate through the delegates associated with a resource. While results are still
     *         available, it has an associated value. When the last page is reached, the token is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a resource. While results are still available,
     * it has an associated value. When the last page is reached, the token is empty.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate through the delegates associated with a resource. While results are still
     *        available, it has an associated value. When the last page is reached, the token is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDelegatesResult withNextToken(String nextToken) {
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
        if (getDelegates() != null)
            sb.append("Delegates: ").append(getDelegates()).append(",");
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

        if (obj instanceof ListResourceDelegatesResult == false)
            return false;
        ListResourceDelegatesResult other = (ListResourceDelegatesResult) obj;
        if (other.getDelegates() == null ^ this.getDelegates() == null)
            return false;
        if (other.getDelegates() != null && other.getDelegates().equals(this.getDelegates()) == false)
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

        hashCode = prime * hashCode + ((getDelegates() == null) ? 0 : getDelegates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceDelegatesResult clone() {
        try {
            return (ListResourceDelegatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
