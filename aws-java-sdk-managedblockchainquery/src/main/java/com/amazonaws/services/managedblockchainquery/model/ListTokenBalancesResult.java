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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTokenBalances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTokenBalancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * </p>
     */
    private java.util.List<TokenBalance> tokenBalances;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * </p>
     * 
     * @return An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     */

    public java.util.List<TokenBalance> getTokenBalances() {
        return tokenBalances;
    }

    /**
     * <p>
     * An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * </p>
     * 
     * @param tokenBalances
     *        An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     */

    public void setTokenBalances(java.util.Collection<TokenBalance> tokenBalances) {
        if (tokenBalances == null) {
            this.tokenBalances = null;
            return;
        }

        this.tokenBalances = new java.util.ArrayList<TokenBalance>(tokenBalances);
    }

    /**
     * <p>
     * An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenBalances(java.util.Collection)} or {@link #withTokenBalances(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tokenBalances
     *        An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokenBalancesResult withTokenBalances(TokenBalance... tokenBalances) {
        if (this.tokenBalances == null) {
            setTokenBalances(new java.util.ArrayList<TokenBalance>(tokenBalances.length));
        }
        for (TokenBalance ele : tokenBalances) {
            this.tokenBalances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * </p>
     * 
     * @param tokenBalances
     *        An array of <code>TokenBalance</code> objects. Each object contains details about the token balance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokenBalancesResult withTokenBalances(java.util.Collection<TokenBalance> tokenBalances) {
        setTokenBalances(tokenBalances);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokenBalancesResult withNextToken(String nextToken) {
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
        if (getTokenBalances() != null)
            sb.append("TokenBalances: ").append(getTokenBalances()).append(",");
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

        if (obj instanceof ListTokenBalancesResult == false)
            return false;
        ListTokenBalancesResult other = (ListTokenBalancesResult) obj;
        if (other.getTokenBalances() == null ^ this.getTokenBalances() == null)
            return false;
        if (other.getTokenBalances() != null && other.getTokenBalances().equals(this.getTokenBalances()) == false)
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

        hashCode = prime * hashCode + ((getTokenBalances() == null) ? 0 : getTokenBalances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTokenBalancesResult clone() {
        try {
            return (ListTokenBalancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
