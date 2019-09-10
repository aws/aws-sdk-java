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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListLedgers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLedgersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     */
    private java.util.List<LedgerSummary> ledgers;
    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     * results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next page
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     */
    private String nextToken;

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * 
     * @return The array of ledger summaries that are associated with the current AWS account and Region.
     */

    public java.util.List<LedgerSummary> getLedgers() {
        return ledgers;
    }

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * 
     * @param ledgers
     *        The array of ledger summaries that are associated with the current AWS account and Region.
     */

    public void setLedgers(java.util.Collection<LedgerSummary> ledgers) {
        if (ledgers == null) {
            this.ledgers = null;
            return;
        }

        this.ledgers = new java.util.ArrayList<LedgerSummary>(ledgers);
    }

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLedgers(java.util.Collection)} or {@link #withLedgers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ledgers
     *        The array of ledger summaries that are associated with the current AWS account and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLedgersResult withLedgers(LedgerSummary... ledgers) {
        if (this.ledgers == null) {
            setLedgers(new java.util.ArrayList<LedgerSummary>(ledgers.length));
        }
        for (LedgerSummary ele : ledgers) {
            this.ledgers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * 
     * @param ledgers
     *        The array of ledger summaries that are associated with the current AWS account and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLedgersResult withLedgers(java.util.Collection<LedgerSummary> ledgers) {
        setLedgers(ledgers);
        return this;
    }

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     * results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next page
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        A pagination token, indicating whether there are more results available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     *        results to be retrieved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next
     *        page of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     *        </p>
     *        </li>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     * results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next page
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A pagination token, indicating whether there are more results available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>NextToken</code> is empty, then the last page of results has been processed and there are no
     *         more results to be retrieved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the
     *         next page of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code>
     *         call.
     *         </p>
     *         </li>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     * results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next page
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        A pagination token, indicating whether there are more results available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     *        results to be retrieved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next
     *        page of results, use the value of <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLedgersResult withNextToken(String nextToken) {
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
        if (getLedgers() != null)
            sb.append("Ledgers: ").append(getLedgers()).append(",");
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

        if (obj instanceof ListLedgersResult == false)
            return false;
        ListLedgersResult other = (ListLedgersResult) obj;
        if (other.getLedgers() == null ^ this.getLedgers() == null)
            return false;
        if (other.getLedgers() != null && other.getLedgers().equals(this.getLedgers()) == false)
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

        hashCode = prime * hashCode + ((getLedgers() == null) ? 0 : getLedgers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLedgersResult clone() {
        try {
            return (ListLedgersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
