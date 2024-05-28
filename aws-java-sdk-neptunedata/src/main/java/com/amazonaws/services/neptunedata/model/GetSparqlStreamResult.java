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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSparqlStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Sequence identifier of the last change in the stream response.
     * </p>
     * <p>
     * An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that changed the
     * graph, and an <code>opNum</code>, which identifies a specific operation within that transaction:
     * </p>
     */
    private java.util.Map<String, String> lastEventId;
    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     */
    private Long lastTrxTimestampInMillis;
    /**
     * <p>
     * Serialization format for the change records being returned. Currently, the only supported value is
     * <code>NQUADS</code>.
     * </p>
     */
    private String format;
    /**
     * <p>
     * An array of serialized change-log stream records included in the response.
     * </p>
     */
    private java.util.List<SparqlRecord> records;
    /**
     * <p>
     * The total number of records in the response.
     * </p>
     */
    private Integer totalRecords;

    /**
     * <p>
     * Sequence identifier of the last change in the stream response.
     * </p>
     * <p>
     * An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that changed the
     * graph, and an <code>opNum</code>, which identifies a specific operation within that transaction:
     * </p>
     * 
     * @return Sequence identifier of the last change in the stream response.</p>
     *         <p>
     *         An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that
     *         changed the graph, and an <code>opNum</code>, which identifies a specific operation within that
     *         transaction:
     */

    public java.util.Map<String, String> getLastEventId() {
        return lastEventId;
    }

    /**
     * <p>
     * Sequence identifier of the last change in the stream response.
     * </p>
     * <p>
     * An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that changed the
     * graph, and an <code>opNum</code>, which identifies a specific operation within that transaction:
     * </p>
     * 
     * @param lastEventId
     *        Sequence identifier of the last change in the stream response.</p>
     *        <p>
     *        An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that
     *        changed the graph, and an <code>opNum</code>, which identifies a specific operation within that
     *        transaction:
     */

    public void setLastEventId(java.util.Map<String, String> lastEventId) {
        this.lastEventId = lastEventId;
    }

    /**
     * <p>
     * Sequence identifier of the last change in the stream response.
     * </p>
     * <p>
     * An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that changed the
     * graph, and an <code>opNum</code>, which identifies a specific operation within that transaction:
     * </p>
     * 
     * @param lastEventId
     *        Sequence identifier of the last change in the stream response.</p>
     *        <p>
     *        An event ID is composed of two fields: a <code>commitNum</code>, which identifies a transaction that
     *        changed the graph, and an <code>opNum</code>, which identifies a specific operation within that
     *        transaction:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult withLastEventId(java.util.Map<String, String> lastEventId) {
        setLastEventId(lastEventId);
        return this;
    }

    /**
     * Add a single LastEventId entry
     *
     * @see GetSparqlStreamResult#withLastEventId
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult addLastEventIdEntry(String key, String value) {
        if (null == this.lastEventId) {
            this.lastEventId = new java.util.HashMap<String, String>();
        }
        if (this.lastEventId.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.lastEventId.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LastEventId.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult clearLastEventIdEntries() {
        this.lastEventId = null;
        return this;
    }

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     * 
     * @param lastTrxTimestampInMillis
     *        The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     */

    public void setLastTrxTimestampInMillis(Long lastTrxTimestampInMillis) {
        this.lastTrxTimestampInMillis = lastTrxTimestampInMillis;
    }

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     * 
     * @return The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     */

    public Long getLastTrxTimestampInMillis() {
        return this.lastTrxTimestampInMillis;
    }

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     * 
     * @param lastTrxTimestampInMillis
     *        The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult withLastTrxTimestampInMillis(Long lastTrxTimestampInMillis) {
        setLastTrxTimestampInMillis(lastTrxTimestampInMillis);
        return this;
    }

    /**
     * <p>
     * Serialization format for the change records being returned. Currently, the only supported value is
     * <code>NQUADS</code>.
     * </p>
     * 
     * @param format
     *        Serialization format for the change records being returned. Currently, the only supported value is
     *        <code>NQUADS</code>.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Serialization format for the change records being returned. Currently, the only supported value is
     * <code>NQUADS</code>.
     * </p>
     * 
     * @return Serialization format for the change records being returned. Currently, the only supported value is
     *         <code>NQUADS</code>.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Serialization format for the change records being returned. Currently, the only supported value is
     * <code>NQUADS</code>.
     * </p>
     * 
     * @param format
     *        Serialization format for the change records being returned. Currently, the only supported value is
     *        <code>NQUADS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * An array of serialized change-log stream records included in the response.
     * </p>
     * 
     * @return An array of serialized change-log stream records included in the response.
     */

    public java.util.List<SparqlRecord> getRecords() {
        return records;
    }

    /**
     * <p>
     * An array of serialized change-log stream records included in the response.
     * </p>
     * 
     * @param records
     *        An array of serialized change-log stream records included in the response.
     */

    public void setRecords(java.util.Collection<SparqlRecord> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<SparqlRecord>(records);
    }

    /**
     * <p>
     * An array of serialized change-log stream records included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        An array of serialized change-log stream records included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult withRecords(SparqlRecord... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<SparqlRecord>(records.length));
        }
        for (SparqlRecord ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of serialized change-log stream records included in the response.
     * </p>
     * 
     * @param records
     *        An array of serialized change-log stream records included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult withRecords(java.util.Collection<SparqlRecord> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The total number of records in the response.
     * </p>
     * 
     * @param totalRecords
     *        The total number of records in the response.
     */

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * <p>
     * The total number of records in the response.
     * </p>
     * 
     * @return The total number of records in the response.
     */

    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    /**
     * <p>
     * The total number of records in the response.
     * </p>
     * 
     * @param totalRecords
     *        The total number of records in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamResult withTotalRecords(Integer totalRecords) {
        setTotalRecords(totalRecords);
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
        if (getLastEventId() != null)
            sb.append("LastEventId: ").append(getLastEventId()).append(",");
        if (getLastTrxTimestampInMillis() != null)
            sb.append("LastTrxTimestampInMillis: ").append(getLastTrxTimestampInMillis()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getTotalRecords() != null)
            sb.append("TotalRecords: ").append(getTotalRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSparqlStreamResult == false)
            return false;
        GetSparqlStreamResult other = (GetSparqlStreamResult) obj;
        if (other.getLastEventId() == null ^ this.getLastEventId() == null)
            return false;
        if (other.getLastEventId() != null && other.getLastEventId().equals(this.getLastEventId()) == false)
            return false;
        if (other.getLastTrxTimestampInMillis() == null ^ this.getLastTrxTimestampInMillis() == null)
            return false;
        if (other.getLastTrxTimestampInMillis() != null && other.getLastTrxTimestampInMillis().equals(this.getLastTrxTimestampInMillis()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getTotalRecords() == null ^ this.getTotalRecords() == null)
            return false;
        if (other.getTotalRecords() != null && other.getTotalRecords().equals(this.getTotalRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastEventId() == null) ? 0 : getLastEventId().hashCode());
        hashCode = prime * hashCode + ((getLastTrxTimestampInMillis() == null) ? 0 : getLastTrxTimestampInMillis().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getTotalRecords() == null) ? 0 : getTotalRecords().hashCode());
        return hashCode;
    }

    @Override
    public GetSparqlStreamResult clone() {
        try {
            return (GetSparqlStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
