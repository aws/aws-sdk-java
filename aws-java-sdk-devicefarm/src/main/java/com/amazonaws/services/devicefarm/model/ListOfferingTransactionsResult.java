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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns the transaction log of the specified offerings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingTransactions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOfferingTransactionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * </p>
     */
    private java.util.List<OfferingTransaction> offeringTransactions;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * </p>
     * 
     * @return The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     */

    public java.util.List<OfferingTransaction> getOfferingTransactions() {
        return offeringTransactions;
    }

    /**
     * <p>
     * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * </p>
     * 
     * @param offeringTransactions
     *        The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     */

    public void setOfferingTransactions(java.util.Collection<OfferingTransaction> offeringTransactions) {
        if (offeringTransactions == null) {
            this.offeringTransactions = null;
            return;
        }

        this.offeringTransactions = new java.util.ArrayList<OfferingTransaction>(offeringTransactions);
    }

    /**
     * <p>
     * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOfferingTransactions(java.util.Collection)} or {@link #withOfferingTransactions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param offeringTransactions
     *        The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingTransactionsResult withOfferingTransactions(OfferingTransaction... offeringTransactions) {
        if (this.offeringTransactions == null) {
            setOfferingTransactions(new java.util.ArrayList<OfferingTransaction>(offeringTransactions.length));
        }
        for (OfferingTransaction ele : offeringTransactions) {
            this.offeringTransactions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * </p>
     * 
     * @param offeringTransactions
     *        The audit log of subscriptions you have purchased and modified through AWS Device Farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingTransactionsResult withOfferingTransactions(java.util.Collection<OfferingTransaction> offeringTransactions) {
        setOfferingTransactions(offeringTransactions);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingTransactionsResult withNextToken(String nextToken) {
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
        if (getOfferingTransactions() != null)
            sb.append("OfferingTransactions: ").append(getOfferingTransactions()).append(",");
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

        if (obj instanceof ListOfferingTransactionsResult == false)
            return false;
        ListOfferingTransactionsResult other = (ListOfferingTransactionsResult) obj;
        if (other.getOfferingTransactions() == null ^ this.getOfferingTransactions() == null)
            return false;
        if (other.getOfferingTransactions() != null && other.getOfferingTransactions().equals(this.getOfferingTransactions()) == false)
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

        hashCode = prime * hashCode + ((getOfferingTransactions() == null) ? 0 : getOfferingTransactions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOfferingTransactionsResult clone() {
        try {
            return (ListOfferingTransactionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
