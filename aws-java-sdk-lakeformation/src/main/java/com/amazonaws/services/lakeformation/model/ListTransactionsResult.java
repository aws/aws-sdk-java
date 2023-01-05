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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTransactions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * </p>
     */
    private java.util.List<TransactionDescription> transactions;
    /**
     * <p>
     * A continuation token indicating whether additional data is available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * </p>
     * 
     * @return A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     */

    public java.util.List<TransactionDescription> getTransactions() {
        return transactions;
    }

    /**
     * <p>
     * A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * </p>
     * 
     * @param transactions
     *        A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     */

    public void setTransactions(java.util.Collection<TransactionDescription> transactions) {
        if (transactions == null) {
            this.transactions = null;
            return;
        }

        this.transactions = new java.util.ArrayList<TransactionDescription>(transactions);
    }

    /**
     * <p>
     * A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransactions(java.util.Collection)} or {@link #withTransactions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param transactions
     *        A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsResult withTransactions(TransactionDescription... transactions) {
        if (this.transactions == null) {
            setTransactions(new java.util.ArrayList<TransactionDescription>(transactions.length));
        }
        for (TransactionDescription ele : transactions) {
            this.transactions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * </p>
     * 
     * @param transactions
     *        A list of transactions. The record for each transaction is a <code>TransactionDescription</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsResult withTransactions(java.util.Collection<TransactionDescription> transactions) {
        setTransactions(transactions);
        return this;
    }

    /**
     * <p>
     * A continuation token indicating whether additional data is available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token indicating whether additional data is available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token indicating whether additional data is available.
     * </p>
     * 
     * @return A continuation token indicating whether additional data is available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token indicating whether additional data is available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token indicating whether additional data is available.
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
