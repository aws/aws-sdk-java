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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalKinesisStreamsForLedger"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJournalKinesisStreamsForLedgerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the given ledger.
     * </p>
     */
    private java.util.List<JournalKinesisStreamDescription> streams;
    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been processed and there are no more results to
     * be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of results,
     * use the value of <code>NextToken</code> in a subsequent <code>ListJournalKinesisStreamsForLedger</code> call.
     * </p>
     * </li>
     * </ul>
     */
    private String nextToken;

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the given ledger.
     * </p>
     * 
     * @return The array of QLDB journal stream descriptors that are associated with the given ledger.
     */

    public java.util.List<JournalKinesisStreamDescription> getStreams() {
        return streams;
    }

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the given ledger.
     * </p>
     * 
     * @param streams
     *        The array of QLDB journal stream descriptors that are associated with the given ledger.
     */

    public void setStreams(java.util.Collection<JournalKinesisStreamDescription> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<JournalKinesisStreamDescription>(streams);
    }

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the given ledger.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreams(java.util.Collection)} or {@link #withStreams(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param streams
     *        The array of QLDB journal stream descriptors that are associated with the given ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalKinesisStreamsForLedgerResult withStreams(JournalKinesisStreamDescription... streams) {
        if (this.streams == null) {
            setStreams(new java.util.ArrayList<JournalKinesisStreamDescription>(streams.length));
        }
        for (JournalKinesisStreamDescription ele : streams) {
            this.streams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the given ledger.
     * </p>
     * 
     * @param streams
     *        The array of QLDB journal stream descriptors that are associated with the given ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalKinesisStreamsForLedgerResult withStreams(java.util.Collection<JournalKinesisStreamDescription> streams) {
        setStreams(streams);
        return this;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been processed and there are no more results to
     * be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of results,
     * use the value of <code>NextToken</code> in a subsequent <code>ListJournalKinesisStreamsForLedger</code> call.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is empty, the last page of results has been processed and there are no more
     *        results to be retrieved.
     *        </p>
     *        </li> <li>
     *        <p>
     *        If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of
     *        results, use the value of <code>NextToken</code> in a subsequent
     *        <code>ListJournalKinesisStreamsForLedger</code> call.
     *        </p>
     *        </li>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been processed and there are no more results to
     * be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of results,
     * use the value of <code>NextToken</code> in a subsequent <code>ListJournalKinesisStreamsForLedger</code> call.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <li>
     *         <p>
     *         If <code>NextToken</code> is empty, the last page of results has been processed and there are no more
     *         results to be retrieved.
     *         </p>
     *         </li> <li>
     *         <p>
     *         If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of
     *         results, use the value of <code>NextToken</code> in a subsequent
     *         <code>ListJournalKinesisStreamsForLedger</code> call.
     *         </p>
     *         </li>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been processed and there are no more results to
     * be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of results,
     * use the value of <code>NextToken</code> in a subsequent <code>ListJournalKinesisStreamsForLedger</code> call.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is empty, the last page of results has been processed and there are no more
     *        results to be retrieved.
     *        </p>
     *        </li> <li>
     *        <p>
     *        If <code>NextToken</code> is <i>not</i> empty, more results are available. To retrieve the next page of
     *        results, use the value of <code>NextToken</code> in a subsequent
     *        <code>ListJournalKinesisStreamsForLedger</code> call.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalKinesisStreamsForLedgerResult withNextToken(String nextToken) {
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
        if (getStreams() != null)
            sb.append("Streams: ").append(getStreams()).append(",");
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

        if (obj instanceof ListJournalKinesisStreamsForLedgerResult == false)
            return false;
        ListJournalKinesisStreamsForLedgerResult other = (ListJournalKinesisStreamsForLedgerResult) obj;
        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
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

        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJournalKinesisStreamsForLedgerResult clone() {
        try {
            return (ListJournalKinesisStreamsForLedgerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
