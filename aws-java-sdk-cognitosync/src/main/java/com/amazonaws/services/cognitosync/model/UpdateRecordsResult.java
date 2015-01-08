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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Returned for a successful UpdateRecordsRequest.
 * </p>
 */
public class UpdateRecordsResult implements Serializable {

    /**
     * A list of records that have been updated.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Record> records;

    /**
     * A list of records that have been updated.
     *
     * @return A list of records that have been updated.
     */
    public java.util.List<Record> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * A list of records that have been updated.
     *
     * @param records A list of records that have been updated.
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * A list of records that have been updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records A list of records that have been updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsResult withRecords(Record... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<Record>(records.length));
        for (Record value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * A list of records that have been updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records A list of records that have been updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsResult withRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
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
        if (getRecords() != null) sb.append("Records: " + getRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateRecordsResult == false) return false;
        UpdateRecordsResult other = (UpdateRecordsResult)obj;
        
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        return true;
    }
    
}
    