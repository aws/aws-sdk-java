/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * <code>PutRecords</code> results.
 * </p>
 */
public class PutRecordsResult implements Serializable {

    /**
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer failedRecordCount;

    /**
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to your Amazon Kinesis stream includes
     * <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     * record that fails to be added to your Amazon Kinesis stream includes
     * <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsResultEntry> records;

    /**
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The number of unsuccessfully processed records in a
     *         <code>PutRecords</code> request.
     */
    public Integer getFailedRecordCount() {
        return failedRecordCount;
    }
    
    /**
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param failedRecordCount The number of unsuccessfully processed records in a
     *         <code>PutRecords</code> request.
     */
    public void setFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }
    
    /**
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param failedRecordCount The number of unsuccessfully processed records in a
     *         <code>PutRecords</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResult withFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
        return this;
    }

    /**
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to your Amazon Kinesis stream includes
     * <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     * record that fails to be added to your Amazon Kinesis stream includes
     * <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return An array of successfully and unsuccessfully processed record results,
     *         correlated with the request by natural ordering. A record that is
     *         successfully added to your Amazon Kinesis stream includes
     *         <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     *         record that fails to be added to your Amazon Kinesis stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     */
    public java.util.List<PutRecordsResultEntry> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsResultEntry>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to your Amazon Kinesis stream includes
     * <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     * record that fails to be added to your Amazon Kinesis stream includes
     * <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records An array of successfully and unsuccessfully processed record results,
     *         correlated with the request by natural ordering. A record that is
     *         successfully added to your Amazon Kinesis stream includes
     *         <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     *         record that fails to be added to your Amazon Kinesis stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     */
    public void setRecords(java.util.Collection<PutRecordsResultEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsResultEntry> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsResultEntry>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to your Amazon Kinesis stream includes
     * <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     * record that fails to be added to your Amazon Kinesis stream includes
     * <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records An array of successfully and unsuccessfully processed record results,
     *         correlated with the request by natural ordering. A record that is
     *         successfully added to your Amazon Kinesis stream includes
     *         <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     *         record that fails to be added to your Amazon Kinesis stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResult withRecords(PutRecordsResultEntry... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<PutRecordsResultEntry>(records.length));
        for (PutRecordsResultEntry value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to your Amazon Kinesis stream includes
     * <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     * record that fails to be added to your Amazon Kinesis stream includes
     * <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records An array of successfully and unsuccessfully processed record results,
     *         correlated with the request by natural ordering. A record that is
     *         successfully added to your Amazon Kinesis stream includes
     *         <code>SequenceNumber</code> and <code>ShardId</code> in the result. A
     *         record that fails to be added to your Amazon Kinesis stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordsResult withRecords(java.util.Collection<PutRecordsResultEntry> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsResultEntry> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PutRecordsResultEntry>(records.size());
            recordsCopy.addAll(records);
            this.records = recordsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailedRecordCount() != null) sb.append("FailedRecordCount: " + getFailedRecordCount() + ",");
        if (getRecords() != null) sb.append("Records: " + getRecords() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordsResult == false) return false;
        PutRecordsResult other = (PutRecordsResult)obj;
        
        if (other.getFailedRecordCount() == null ^ this.getFailedRecordCount() == null) return false;
        if (other.getFailedRecordCount() != null && other.getFailedRecordCount().equals(this.getFailedRecordCount()) == false) return false; 
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        return true;
    }
    
}
    