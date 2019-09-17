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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3ExportsForLedger" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJournalS3ExportsForLedgerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The array of journal export job descriptions that are associated with the specified ledger.
     * </p>
     */
    private java.util.List<JournalS3ExportDescription> journalS3Exports;
    /**
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
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListJournalS3ExportsForLedger</code>
     * call.
     * </p>
     * </li>
     * </ul>
     */
    private String nextToken;

    /**
     * <p>
     * The array of journal export job descriptions that are associated with the specified ledger.
     * </p>
     * 
     * @return The array of journal export job descriptions that are associated with the specified ledger.
     */

    public java.util.List<JournalS3ExportDescription> getJournalS3Exports() {
        return journalS3Exports;
    }

    /**
     * <p>
     * The array of journal export job descriptions that are associated with the specified ledger.
     * </p>
     * 
     * @param journalS3Exports
     *        The array of journal export job descriptions that are associated with the specified ledger.
     */

    public void setJournalS3Exports(java.util.Collection<JournalS3ExportDescription> journalS3Exports) {
        if (journalS3Exports == null) {
            this.journalS3Exports = null;
            return;
        }

        this.journalS3Exports = new java.util.ArrayList<JournalS3ExportDescription>(journalS3Exports);
    }

    /**
     * <p>
     * The array of journal export job descriptions that are associated with the specified ledger.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJournalS3Exports(java.util.Collection)} or {@link #withJournalS3Exports(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param journalS3Exports
     *        The array of journal export job descriptions that are associated with the specified ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalS3ExportsForLedgerResult withJournalS3Exports(JournalS3ExportDescription... journalS3Exports) {
        if (this.journalS3Exports == null) {
            setJournalS3Exports(new java.util.ArrayList<JournalS3ExportDescription>(journalS3Exports.length));
        }
        for (JournalS3ExportDescription ele : journalS3Exports) {
            this.journalS3Exports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of journal export job descriptions that are associated with the specified ledger.
     * </p>
     * 
     * @param journalS3Exports
     *        The array of journal export job descriptions that are associated with the specified ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalS3ExportsForLedgerResult withJournalS3Exports(java.util.Collection<JournalS3ExportDescription> journalS3Exports) {
        setJournalS3Exports(journalS3Exports);
        return this;
    }

    /**
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
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListJournalS3ExportsForLedger</code>
     * call.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     *        results to be retrieved.
     *        </p>
     *        </li> <li>
     *        <p>
     *        If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next
     *        page of results, use the value of <code>NextToken</code> in a subsequent
     *        <code>ListJournalS3ExportsForLedger</code> call.
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
     * If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     * results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next page
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListJournalS3ExportsForLedger</code>
     * call.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <li>
     *         <p>
     *         If <code>NextToken</code> is empty, then the last page of results has been processed and there are no
     *         more results to be retrieved.
     *         </p>
     *         </li> <li>
     *         <p>
     *         If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the
     *         next page of results, use the value of <code>NextToken</code> in a subsequent
     *         <code>ListJournalS3ExportsForLedger</code> call.
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
     * If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     * results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next page
     * of results, use the value of <code>NextToken</code> in a subsequent <code>ListJournalS3ExportsForLedger</code>
     * call.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        <li>
     *        <p>
     *        If <code>NextToken</code> is empty, then the last page of results has been processed and there are no more
     *        results to be retrieved.
     *        </p>
     *        </li> <li>
     *        <p>
     *        If <code>NextToken</code> is <i>not</i> empty, then there are more results available. To retrieve the next
     *        page of results, use the value of <code>NextToken</code> in a subsequent
     *        <code>ListJournalS3ExportsForLedger</code> call.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJournalS3ExportsForLedgerResult withNextToken(String nextToken) {
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
        if (getJournalS3Exports() != null)
            sb.append("JournalS3Exports: ").append(getJournalS3Exports()).append(",");
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

        if (obj instanceof ListJournalS3ExportsForLedgerResult == false)
            return false;
        ListJournalS3ExportsForLedgerResult other = (ListJournalS3ExportsForLedgerResult) obj;
        if (other.getJournalS3Exports() == null ^ this.getJournalS3Exports() == null)
            return false;
        if (other.getJournalS3Exports() != null && other.getJournalS3Exports().equals(this.getJournalS3Exports()) == false)
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

        hashCode = prime * hashCode + ((getJournalS3Exports() == null) ? 0 : getJournalS3Exports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJournalS3ExportsForLedgerResult clone() {
        try {
            return (ListJournalS3ExportsForLedgerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
