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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A serialized SPARQL stream record capturing a change-log entry for the RDF graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/SparqlRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SparqlRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     */
    private Long commitTimestampInMillis;
    /**
     * <p>
     * The sequence identifier of the stream change record.
     * </p>
     */
    private java.util.Map<String, String> eventId;
    /**
     * <p>
     * The serialized SPARQL change record. The serialization formats of each record are described in more detail in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization Formats in
     * Neptune Streams</a>.
     * </p>
     */
    private SparqlData data;
    /**
     * <p>
     * The operation that created the change.
     * </p>
     */
    private String op;
    /**
     * <p>
     * Only present if this operation is the last one in its transaction. If present, it is set to true. It is useful
     * for ensuring that an entire transaction is consumed.
     * </p>
     */
    private Boolean isLastOp;

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     * 
     * @param commitTimestampInMillis
     *        The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     */

    public void setCommitTimestampInMillis(Long commitTimestampInMillis) {
        this.commitTimestampInMillis = commitTimestampInMillis;
    }

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     * 
     * @return The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     */

    public Long getCommitTimestampInMillis() {
        return this.commitTimestampInMillis;
    }

    /**
     * <p>
     * The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * </p>
     * 
     * @param commitTimestampInMillis
     *        The time at which the commit for the transaction was requested, in milliseconds from the Unix epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord withCommitTimestampInMillis(Long commitTimestampInMillis) {
        setCommitTimestampInMillis(commitTimestampInMillis);
        return this;
    }

    /**
     * <p>
     * The sequence identifier of the stream change record.
     * </p>
     * 
     * @return The sequence identifier of the stream change record.
     */

    public java.util.Map<String, String> getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The sequence identifier of the stream change record.
     * </p>
     * 
     * @param eventId
     *        The sequence identifier of the stream change record.
     */

    public void setEventId(java.util.Map<String, String> eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The sequence identifier of the stream change record.
     * </p>
     * 
     * @param eventId
     *        The sequence identifier of the stream change record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord withEventId(java.util.Map<String, String> eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * Add a single EventId entry
     *
     * @see SparqlRecord#withEventId
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord addEventIdEntry(String key, String value) {
        if (null == this.eventId) {
            this.eventId = new java.util.HashMap<String, String>();
        }
        if (this.eventId.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventId.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventId.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord clearEventIdEntries() {
        this.eventId = null;
        return this;
    }

    /**
     * <p>
     * The serialized SPARQL change record. The serialization formats of each record are described in more detail in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization Formats in
     * Neptune Streams</a>.
     * </p>
     * 
     * @param data
     *        The serialized SPARQL change record. The serialization formats of each record are described in more detail
     *        in <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization
     *        Formats in Neptune Streams</a>.
     */

    public void setData(SparqlData data) {
        this.data = data;
    }

    /**
     * <p>
     * The serialized SPARQL change record. The serialization formats of each record are described in more detail in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization Formats in
     * Neptune Streams</a>.
     * </p>
     * 
     * @return The serialized SPARQL change record. The serialization formats of each record are described in more
     *         detail in <a
     *         href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization
     *         Formats in Neptune Streams</a>.
     */

    public SparqlData getData() {
        return this.data;
    }

    /**
     * <p>
     * The serialized SPARQL change record. The serialization formats of each record are described in more detail in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization Formats in
     * Neptune Streams</a>.
     * </p>
     * 
     * @param data
     *        The serialized SPARQL change record. The serialization formats of each record are described in more detail
     *        in <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/streams-change-formats.html">Serialization
     *        Formats in Neptune Streams</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord withData(SparqlData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The operation that created the change.
     * </p>
     * 
     * @param op
     *        The operation that created the change.
     */

    public void setOp(String op) {
        this.op = op;
    }

    /**
     * <p>
     * The operation that created the change.
     * </p>
     * 
     * @return The operation that created the change.
     */

    public String getOp() {
        return this.op;
    }

    /**
     * <p>
     * The operation that created the change.
     * </p>
     * 
     * @param op
     *        The operation that created the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord withOp(String op) {
        setOp(op);
        return this;
    }

    /**
     * <p>
     * Only present if this operation is the last one in its transaction. If present, it is set to true. It is useful
     * for ensuring that an entire transaction is consumed.
     * </p>
     * 
     * @param isLastOp
     *        Only present if this operation is the last one in its transaction. If present, it is set to true. It is
     *        useful for ensuring that an entire transaction is consumed.
     */

    public void setIsLastOp(Boolean isLastOp) {
        this.isLastOp = isLastOp;
    }

    /**
     * <p>
     * Only present if this operation is the last one in its transaction. If present, it is set to true. It is useful
     * for ensuring that an entire transaction is consumed.
     * </p>
     * 
     * @return Only present if this operation is the last one in its transaction. If present, it is set to true. It is
     *         useful for ensuring that an entire transaction is consumed.
     */

    public Boolean getIsLastOp() {
        return this.isLastOp;
    }

    /**
     * <p>
     * Only present if this operation is the last one in its transaction. If present, it is set to true. It is useful
     * for ensuring that an entire transaction is consumed.
     * </p>
     * 
     * @param isLastOp
     *        Only present if this operation is the last one in its transaction. If present, it is set to true. It is
     *        useful for ensuring that an entire transaction is consumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparqlRecord withIsLastOp(Boolean isLastOp) {
        setIsLastOp(isLastOp);
        return this;
    }

    /**
     * <p>
     * Only present if this operation is the last one in its transaction. If present, it is set to true. It is useful
     * for ensuring that an entire transaction is consumed.
     * </p>
     * 
     * @return Only present if this operation is the last one in its transaction. If present, it is set to true. It is
     *         useful for ensuring that an entire transaction is consumed.
     */

    public Boolean isLastOp() {
        return this.isLastOp;
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
        if (getCommitTimestampInMillis() != null)
            sb.append("CommitTimestampInMillis: ").append(getCommitTimestampInMillis()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getOp() != null)
            sb.append("Op: ").append(getOp()).append(",");
        if (getIsLastOp() != null)
            sb.append("IsLastOp: ").append(getIsLastOp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SparqlRecord == false)
            return false;
        SparqlRecord other = (SparqlRecord) obj;
        if (other.getCommitTimestampInMillis() == null ^ this.getCommitTimestampInMillis() == null)
            return false;
        if (other.getCommitTimestampInMillis() != null && other.getCommitTimestampInMillis().equals(this.getCommitTimestampInMillis()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getOp() == null ^ this.getOp() == null)
            return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false)
            return false;
        if (other.getIsLastOp() == null ^ this.getIsLastOp() == null)
            return false;
        if (other.getIsLastOp() != null && other.getIsLastOp().equals(this.getIsLastOp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitTimestampInMillis() == null) ? 0 : getCommitTimestampInMillis().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getOp() == null) ? 0 : getOp().hashCode());
        hashCode = prime * hashCode + ((getIsLastOp() == null) ? 0 : getIsLastOp().hashCode());
        return hashCode;
    }

    @Override
    public SparqlRecord clone() {
        try {
            return (SparqlRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.SparqlRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
