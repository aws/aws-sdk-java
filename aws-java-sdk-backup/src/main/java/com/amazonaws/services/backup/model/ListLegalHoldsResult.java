/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListLegalHolds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLegalHoldsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * This is an array of returned legal holds, both active and previous.
     * </p>
     */
    private java.util.List<LegalHold> legalHolds;

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned resources. For example, if a request is made to return
     *         <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *         your list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLegalHoldsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * This is an array of returned legal holds, both active and previous.
     * </p>
     * 
     * @return This is an array of returned legal holds, both active and previous.
     */

    public java.util.List<LegalHold> getLegalHolds() {
        return legalHolds;
    }

    /**
     * <p>
     * This is an array of returned legal holds, both active and previous.
     * </p>
     * 
     * @param legalHolds
     *        This is an array of returned legal holds, both active and previous.
     */

    public void setLegalHolds(java.util.Collection<LegalHold> legalHolds) {
        if (legalHolds == null) {
            this.legalHolds = null;
            return;
        }

        this.legalHolds = new java.util.ArrayList<LegalHold>(legalHolds);
    }

    /**
     * <p>
     * This is an array of returned legal holds, both active and previous.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLegalHolds(java.util.Collection)} or {@link #withLegalHolds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param legalHolds
     *        This is an array of returned legal holds, both active and previous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLegalHoldsResult withLegalHolds(LegalHold... legalHolds) {
        if (this.legalHolds == null) {
            setLegalHolds(new java.util.ArrayList<LegalHold>(legalHolds.length));
        }
        for (LegalHold ele : legalHolds) {
            this.legalHolds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is an array of returned legal holds, both active and previous.
     * </p>
     * 
     * @param legalHolds
     *        This is an array of returned legal holds, both active and previous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLegalHoldsResult withLegalHolds(java.util.Collection<LegalHold> legalHolds) {
        setLegalHolds(legalHolds);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLegalHolds() != null)
            sb.append("LegalHolds: ").append(getLegalHolds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLegalHoldsResult == false)
            return false;
        ListLegalHoldsResult other = (ListLegalHoldsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLegalHolds() == null ^ this.getLegalHolds() == null)
            return false;
        if (other.getLegalHolds() != null && other.getLegalHolds().equals(this.getLegalHolds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLegalHolds() == null) ? 0 : getLegalHolds().hashCode());
        return hashCode;
    }

    @Override
    public ListLegalHoldsResult clone() {
        try {
            return (ListLegalHoldsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
