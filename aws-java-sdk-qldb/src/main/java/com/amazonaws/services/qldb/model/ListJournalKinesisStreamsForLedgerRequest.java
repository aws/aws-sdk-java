/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalKinesisStreamsForLedger"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJournalKinesisStreamsForLedgerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String ledgerName;
    /**
     * <p>
     * The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code> request. (The
     * actual number of results returned might be fewer.)
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for
     * <code>NextToken</code> in the response from a previous <code>ListJournalKinesisStreamsForLedger</code> call, you
     * should use that value as input here.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     */

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getLedgerName() {
        return this.ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalKinesisStreamsForLedgerRequest withLedgerName(String ledgerName) {
        setLedgerName(ledgerName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code> request. (The
     * actual number of results returned might be fewer.)
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code>
     *        request. (The actual number of results returned might be fewer.)
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code> request. (The
     * actual number of results returned might be fewer.)
     * </p>
     * 
     * @return The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code>
     *         request. (The actual number of results returned might be fewer.)
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code> request. (The
     * actual number of results returned might be fewer.)
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single <code>ListJournalKinesisStreamsForLedger</code>
     *        request. (The actual number of results returned might be fewer.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalKinesisStreamsForLedgerRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for
     * <code>NextToken</code> in the response from a previous <code>ListJournalKinesisStreamsForLedger</code> call, you
     * should use that value as input here.
     * </p>
     * 
     * @param nextToken
     *        A pagination token, indicating that you want to retrieve the next page of results. If you received a value
     *        for <code>NextToken</code> in the response from a previous <code>ListJournalKinesisStreamsForLedger</code>
     *        call, you should use that value as input here.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for
     * <code>NextToken</code> in the response from a previous <code>ListJournalKinesisStreamsForLedger</code> call, you
     * should use that value as input here.
     * </p>
     * 
     * @return A pagination token, indicating that you want to retrieve the next page of results. If you received a
     *         value for <code>NextToken</code> in the response from a previous
     *         <code>ListJournalKinesisStreamsForLedger</code> call, you should use that value as input here.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for
     * <code>NextToken</code> in the response from a previous <code>ListJournalKinesisStreamsForLedger</code> call, you
     * should use that value as input here.
     * </p>
     * 
     * @param nextToken
     *        A pagination token, indicating that you want to retrieve the next page of results. If you received a value
     *        for <code>NextToken</code> in the response from a previous <code>ListJournalKinesisStreamsForLedger</code>
     *        call, you should use that value as input here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalKinesisStreamsForLedgerRequest withNextToken(String nextToken) {
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
        if (getLedgerName() != null)
            sb.append("LedgerName: ").append(getLedgerName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListJournalKinesisStreamsForLedgerRequest == false)
            return false;
        ListJournalKinesisStreamsForLedgerRequest other = (ListJournalKinesisStreamsForLedgerRequest) obj;
        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJournalKinesisStreamsForLedgerRequest clone() {
        return (ListJournalKinesisStreamsForLedgerRequest) super.clone();
    }

}
