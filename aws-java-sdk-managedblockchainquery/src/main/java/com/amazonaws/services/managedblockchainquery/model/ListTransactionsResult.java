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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The array of transactions returned by the request.
     * </p>
     */
    private java.util.List<TransactionOutputItem> transactions;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The array of transactions returned by the request.
     * </p>
     * 
     * @return The array of transactions returned by the request.
     */

    public java.util.List<TransactionOutputItem> getTransactions() {
        return transactions;
    }

    /**
     * <p>
     * The array of transactions returned by the request.
     * </p>
     * 
     * @param transactions
     *        The array of transactions returned by the request.
     */

    public void setTransactions(java.util.Collection<TransactionOutputItem> transactions) {
        if (transactions == null) {
            this.transactions = null;
            return;
        }

        this.transactions = new java.util.ArrayList<TransactionOutputItem>(transactions);
    }

    /**
     * <p>
     * The array of transactions returned by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransactions(java.util.Collection)} or {@link #withTransactions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param transactions
     *        The array of transactions returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsResult withTransactions(TransactionOutputItem... transactions) {
        if (this.transactions == null) {
            setTransactions(new java.util.ArrayList<TransactionOutputItem>(transactions.length));
        }
        for (TransactionOutputItem ele : transactions) {
            this.transactions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of transactions returned by the request.
     * </p>
     * 
     * @param transactions
     *        The array of transactions returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsResult withTransactions(java.util.Collection<TransactionOutputItem> transactions) {
        setTransactions(transactions);
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

    public ListTransactionsResult withNextToken(String nextToken) {
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
        if (getTransactions() != null)
            sb.append("Transactions: ").append(getTransactions()).append(",");
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

        if (obj instanceof ListTransactionsResult == false)
            return false;
        ListTransactionsResult other = (ListTransactionsResult) obj;
        if (other.getTransactions() == null ^ this.getTransactions() == null)
            return false;
        if (other.getTransactions() != null && other.getTransactions().equals(this.getTransactions()) == false)
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

        hashCode = prime * hashCode + ((getTransactions() == null) ? 0 : getTransactions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTransactionsResult clone() {
        try {
            return (ListTransactionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
