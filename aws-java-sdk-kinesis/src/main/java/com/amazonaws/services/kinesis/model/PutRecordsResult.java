/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * <code>PutRecords</code> results.
 * </p>
 */
public class PutRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     */
    private Integer failedRecordCount;
    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry> records;

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     * 
     * @param failedRecordCount
     *        The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     */

    public void setFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     * 
     * @return The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     */

    public Integer getFailedRecordCount() {
        return this.failedRecordCount;
    }

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     * 
     * @param failedRecordCount
     *        The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResult withFailedRecordCount(Integer failedRecordCount) {
        setFailedRecordCount(failedRecordCount);
        return this;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * 
     * @return An array of successfully and unsuccessfully processed record results, correlated with the request by
     *         natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code>
     *         and <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     */

    public java.util.List<PutRecordsResultEntry> getRecords() {
        if (records == null) {
            records = new com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry>();
        }
        return records;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * 
     * @param records
     *        An array of successfully and unsuccessfully processed record results, correlated with the request by
     *        natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     *        <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *        <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     */

    public void setRecords(java.util.Collection<PutRecordsResultEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry>(records);
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        An array of successfully and unsuccessfully processed record results, correlated with the request by
     *        natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     *        <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *        <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResult withRecords(PutRecordsResultEntry... records) {
        if (this.records == null) {
            setRecords(new com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry>(records.length));
        }
        for (PutRecordsResultEntry ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * 
     * @param records
     *        An array of successfully and unsuccessfully processed record results, correlated with the request by
     *        natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     *        <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *        <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResult withRecords(java.util.Collection<PutRecordsResultEntry> records) {
        setRecords(records);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailedRecordCount() != null)
            sb.append("FailedRecordCount: " + getFailedRecordCount() + ",");
        if (getRecords() != null)
            sb.append("Records: " + getRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsResult == false)
            return false;
        PutRecordsResult other = (PutRecordsResult) obj;
        if (other.getFailedRecordCount() == null ^ this.getFailedRecordCount() == null)
            return false;
        if (other.getFailedRecordCount() != null && other.getFailedRecordCount().equals(this.getFailedRecordCount()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedRecordCount() == null) ? 0 : getFailedRecordCount().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordsResult clone() {
        try {
            return (PutRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
