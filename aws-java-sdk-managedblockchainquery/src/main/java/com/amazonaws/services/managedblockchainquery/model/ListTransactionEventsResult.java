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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactionEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction events.
     * </p>
     */
    private java.util.List<TransactionEvent> events;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction events.
     * </p>
     * 
     * @return An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction
     *         events.
     */

    public java.util.List<TransactionEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction events.
     * </p>
     * 
     * @param events
     *        An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction
     *        events.
     */

    public void setEvents(java.util.Collection<TransactionEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<TransactionEvent>(events);
    }

    /**
     * <p>
     * An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction
     *        events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionEventsResult withEvents(TransactionEvent... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<TransactionEvent>(events.length));
        }
        for (TransactionEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction events.
     * </p>
     * 
     * @param events
     *        An array of <code>TransactionEvent</code> objects. Each object contains details about the transaction
     *        events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionEventsResult withEvents(java.util.Collection<TransactionEvent> events) {
        setEvents(events);
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

    public ListTransactionEventsResult withNextToken(String nextToken) {
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
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

        if (obj instanceof ListTransactionEventsResult == false)
            return false;
        ListTransactionEventsResult other = (ListTransactionEventsResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
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

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTransactionEventsResult clone() {
        try {
            return (ListTransactionEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
