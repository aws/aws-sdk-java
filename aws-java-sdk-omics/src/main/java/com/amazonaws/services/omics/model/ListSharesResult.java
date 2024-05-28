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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The shares available and their metadata details.
     * </p>
     */
    private java.util.List<ShareDetails> shares;
    /**
     * <p>
     * Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The shares available and their metadata details.
     * </p>
     * 
     * @return The shares available and their metadata details.
     */

    public java.util.List<ShareDetails> getShares() {
        return shares;
    }

    /**
     * <p>
     * The shares available and their metadata details.
     * </p>
     * 
     * @param shares
     *        The shares available and their metadata details.
     */

    public void setShares(java.util.Collection<ShareDetails> shares) {
        if (shares == null) {
            this.shares = null;
            return;
        }

        this.shares = new java.util.ArrayList<ShareDetails>(shares);
    }

    /**
     * <p>
     * The shares available and their metadata details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShares(java.util.Collection)} or {@link #withShares(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param shares
     *        The shares available and their metadata details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharesResult withShares(ShareDetails... shares) {
        if (this.shares == null) {
            setShares(new java.util.ArrayList<ShareDetails>(shares.length));
        }
        for (ShareDetails ele : shares) {
            this.shares.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The shares available and their metadata details.
     * </p>
     * 
     * @param shares
     *        The shares available and their metadata details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharesResult withShares(java.util.Collection<ShareDetails> shares) {
        setShares(shares);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of results.
     * </p>
     * 
     * @return Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListSharesResponse call. Used to get the next page of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharesResult withNextToken(String nextToken) {
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
        if (getShares() != null)
            sb.append("Shares: ").append(getShares()).append(",");
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

        if (obj instanceof ListSharesResult == false)
            return false;
        ListSharesResult other = (ListSharesResult) obj;
        if (other.getShares() == null ^ this.getShares() == null)
            return false;
        if (other.getShares() != null && other.getShares().equals(this.getShares()) == false)
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

        hashCode = prime * hashCode + ((getShares() == null) ? 0 : getShares().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSharesResult clone() {
        try {
            return (ListSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
