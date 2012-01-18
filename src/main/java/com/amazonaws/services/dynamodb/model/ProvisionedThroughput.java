/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * <p>
 * Provisioned throughput reserves the required read and write resources
 * for your table in terms of ReadCapacityUnits and WriteCapacityUnits.
 * Values for provisioned throughput depend upon your expected read/write
 * rates, item size, and consistency. Provide the expected number of read
 * and write operations, assuming an item size of 1KB and strictly
 * consistent reads. For 2KB item size, double the value, 3KB, triple the
 * value, etc. Eventually consistent reads consume half the resources of
 * strictly consistent reads.
 * </p>
 */
public class ProvisionedThroughput {

    /**
     * ReadCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the ReadCapacityUnits.
     * Eventually consistent reads only require half the ReadCapacityUnits of
     * stirctly consistent reads.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long readCapacityUnits;

    /**
     * WriteCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the WriteCapacityUnits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long writeCapacityUnits;

    /**
     * ReadCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the ReadCapacityUnits.
     * Eventually consistent reads only require half the ReadCapacityUnits of
     * stirctly consistent reads.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return ReadCapacityUnits are in terms of strictly consistent reads, assuming
     *         items of 1KB. 2KB items require twice the ReadCapacityUnits.
     *         Eventually consistent reads only require half the ReadCapacityUnits of
     *         stirctly consistent reads.
     */
    public Long getReadCapacityUnits() {
        return readCapacityUnits;
    }
    
    /**
     * ReadCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the ReadCapacityUnits.
     * Eventually consistent reads only require half the ReadCapacityUnits of
     * stirctly consistent reads.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits ReadCapacityUnits are in terms of strictly consistent reads, assuming
     *         items of 1KB. 2KB items require twice the ReadCapacityUnits.
     *         Eventually consistent reads only require half the ReadCapacityUnits of
     *         stirctly consistent reads.
     */
    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }
    
    /**
     * ReadCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the ReadCapacityUnits.
     * Eventually consistent reads only require half the ReadCapacityUnits of
     * stirctly consistent reads.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits ReadCapacityUnits are in terms of strictly consistent reads, assuming
     *         items of 1KB. 2KB items require twice the ReadCapacityUnits.
     *         Eventually consistent reads only require half the ReadCapacityUnits of
     *         stirctly consistent reads.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughput withReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
        return this;
    }
    
    
    /**
     * WriteCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the WriteCapacityUnits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return WriteCapacityUnits are in terms of strictly consistent reads, assuming
     *         items of 1KB. 2KB items require twice the WriteCapacityUnits.
     */
    public Long getWriteCapacityUnits() {
        return writeCapacityUnits;
    }
    
    /**
     * WriteCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the WriteCapacityUnits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits WriteCapacityUnits are in terms of strictly consistent reads, assuming
     *         items of 1KB. 2KB items require twice the WriteCapacityUnits.
     */
    public void setWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }
    
    /**
     * WriteCapacityUnits are in terms of strictly consistent reads, assuming
     * items of 1KB. 2KB items require twice the WriteCapacityUnits.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits WriteCapacityUnits are in terms of strictly consistent reads, assuming
     *         items of 1KB. 2KB items require twice the WriteCapacityUnits.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughput withWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
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
        if (readCapacityUnits != null) sb.append("ReadCapacityUnits: " + readCapacityUnits + ", ");
        if (writeCapacityUnits != null) sb.append("WriteCapacityUnits: " + writeCapacityUnits + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode()); 
        hashCode = prime * hashCode + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ProvisionedThroughput == false) return false;
        ProvisionedThroughput other = (ProvisionedThroughput)obj;
        
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null) return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false) return false; 
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null) return false;
        if (other.getWriteCapacityUnits() != null && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    