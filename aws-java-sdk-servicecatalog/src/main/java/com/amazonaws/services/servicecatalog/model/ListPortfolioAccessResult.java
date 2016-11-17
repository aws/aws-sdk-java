/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class ListPortfolioAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of account IDs associated with access to the portfolio.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * List of account IDs associated with access to the portfolio.
     * </p>
     * 
     * @return List of account IDs associated with access to the portfolio.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * List of account IDs associated with access to the portfolio.
     * </p>
     * 
     * @param accountIds
     *        List of account IDs associated with access to the portfolio.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * List of account IDs associated with access to the portfolio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        List of account IDs associated with access to the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPortfolioAccessResult withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of account IDs associated with access to the portfolio.
     * </p>
     * 
     * @param accountIds
     *        List of account IDs associated with access to the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPortfolioAccessResult withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @return The page token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPortfolioAccessResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountIds() != null)
            sb.append("AccountIds: " + getAccountIds() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPortfolioAccessResult == false)
            return false;
        ListPortfolioAccessResult other = (ListPortfolioAccessResult) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPortfolioAccessResult clone() {
        try {
            return (ListPortfolioAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
