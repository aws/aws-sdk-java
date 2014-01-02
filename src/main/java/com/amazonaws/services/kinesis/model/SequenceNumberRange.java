/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The range of possible sequence numbers for the shard.
 * </p>
 */
public class SequenceNumberRange implements Serializable {

    /**
     * The starting sequence number for the range.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String startingSequenceNumber;

    /**
     * The ending sequence number for the range. Shards that are in the OPEN
     * state have an ending sequence number of <code>null</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String endingSequenceNumber;

    /**
     * The starting sequence number for the range.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The starting sequence number for the range.
     */
    public String getStartingSequenceNumber() {
        return startingSequenceNumber;
    }
    
    /**
     * The starting sequence number for the range.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param startingSequenceNumber The starting sequence number for the range.
     */
    public void setStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
    }
    
    /**
     * The starting sequence number for the range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param startingSequenceNumber The starting sequence number for the range.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SequenceNumberRange withStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
        return this;
    }

    /**
     * The ending sequence number for the range. Shards that are in the OPEN
     * state have an ending sequence number of <code>null</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The ending sequence number for the range. Shards that are in the OPEN
     *         state have an ending sequence number of <code>null</code>.
     */
    public String getEndingSequenceNumber() {
        return endingSequenceNumber;
    }
    
    /**
     * The ending sequence number for the range. Shards that are in the OPEN
     * state have an ending sequence number of <code>null</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param endingSequenceNumber The ending sequence number for the range. Shards that are in the OPEN
     *         state have an ending sequence number of <code>null</code>.
     */
    public void setEndingSequenceNumber(String endingSequenceNumber) {
        this.endingSequenceNumber = endingSequenceNumber;
    }
    
    /**
     * The ending sequence number for the range. Shards that are in the OPEN
     * state have an ending sequence number of <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param endingSequenceNumber The ending sequence number for the range. Shards that are in the OPEN
     *         state have an ending sequence number of <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SequenceNumberRange withEndingSequenceNumber(String endingSequenceNumber) {
        this.endingSequenceNumber = endingSequenceNumber;
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
        if (getStartingSequenceNumber() != null) sb.append("StartingSequenceNumber: " + getStartingSequenceNumber() + ",");
        if (getEndingSequenceNumber() != null) sb.append("EndingSequenceNumber: " + getEndingSequenceNumber() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartingSequenceNumber() == null) ? 0 : getStartingSequenceNumber().hashCode()); 
        hashCode = prime * hashCode + ((getEndingSequenceNumber() == null) ? 0 : getEndingSequenceNumber().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SequenceNumberRange == false) return false;
        SequenceNumberRange other = (SequenceNumberRange)obj;
        
        if (other.getStartingSequenceNumber() == null ^ this.getStartingSequenceNumber() == null) return false;
        if (other.getStartingSequenceNumber() != null && other.getStartingSequenceNumber().equals(this.getStartingSequenceNumber()) == false) return false; 
        if (other.getEndingSequenceNumber() == null ^ this.getEndingSequenceNumber() == null) return false;
        if (other.getEndingSequenceNumber() != null && other.getEndingSequenceNumber().equals(this.getEndingSequenceNumber()) == false) return false; 
        return true;
    }
    
}
    