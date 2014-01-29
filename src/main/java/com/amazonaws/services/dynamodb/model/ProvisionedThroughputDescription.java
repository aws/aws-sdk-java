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
package com.amazonaws.services.dynamodb.model;
import java.io.Serializable;

/**
 * Provisioned Throughput Description
 * @deprecated Use {@link com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputDescription} instead.
 */
@Deprecated
public class ProvisionedThroughputDescription  implements Serializable  {

    private java.util.Date lastIncreaseDateTime;

    private java.util.Date lastDecreaseDateTime;

    private Long numberOfDecreasesToday;

    private Long readCapacityUnits;

    private Long writeCapacityUnits;

    /**
     * Returns the value of the LastIncreaseDateTime property for this
     * object.
     *
     * @return The value of the LastIncreaseDateTime property for this object.
     */
    public java.util.Date getLastIncreaseDateTime() {
        return lastIncreaseDateTime;
    }
    
    /**
     * Sets the value of the LastIncreaseDateTime property for this object.
     *
     * @param lastIncreaseDateTime The new value for the LastIncreaseDateTime property for this object.
     */
    public void setLastIncreaseDateTime(java.util.Date lastIncreaseDateTime) {
        this.lastIncreaseDateTime = lastIncreaseDateTime;
    }
    
    /**
     * Sets the value of the LastIncreaseDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastIncreaseDateTime The new value for the LastIncreaseDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughputDescription withLastIncreaseDateTime(java.util.Date lastIncreaseDateTime) {
        this.lastIncreaseDateTime = lastIncreaseDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the LastDecreaseDateTime property for this
     * object.
     *
     * @return The value of the LastDecreaseDateTime property for this object.
     */
    public java.util.Date getLastDecreaseDateTime() {
        return lastDecreaseDateTime;
    }
    
    /**
     * Sets the value of the LastDecreaseDateTime property for this object.
     *
     * @param lastDecreaseDateTime The new value for the LastDecreaseDateTime property for this object.
     */
    public void setLastDecreaseDateTime(java.util.Date lastDecreaseDateTime) {
        this.lastDecreaseDateTime = lastDecreaseDateTime;
    }
    
    /**
     * Sets the value of the LastDecreaseDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastDecreaseDateTime The new value for the LastDecreaseDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughputDescription withLastDecreaseDateTime(java.util.Date lastDecreaseDateTime) {
        this.lastDecreaseDateTime = lastDecreaseDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the NumberOfDecreasesToday property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the NumberOfDecreasesToday property for this object.
     */
    public Long getNumberOfDecreasesToday() {
        return numberOfDecreasesToday;
    }
    
    /**
     * Sets the value of the NumberOfDecreasesToday property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfDecreasesToday The new value for the NumberOfDecreasesToday property for this object.
     */
    public void setNumberOfDecreasesToday(Long numberOfDecreasesToday) {
        this.numberOfDecreasesToday = numberOfDecreasesToday;
    }
    
    /**
     * Sets the value of the NumberOfDecreasesToday property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfDecreasesToday The new value for the NumberOfDecreasesToday property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughputDescription withNumberOfDecreasesToday(Long numberOfDecreasesToday) {
        this.numberOfDecreasesToday = numberOfDecreasesToday;
        return this;
    }
    
    
    /**
     * Returns the value of the ReadCapacityUnits property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the ReadCapacityUnits property for this object.
     */
    public Long getReadCapacityUnits() {
        return readCapacityUnits;
    }
    
    /**
     * Sets the value of the ReadCapacityUnits property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits The new value for the ReadCapacityUnits property for this object.
     */
    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }
    
    /**
     * Sets the value of the ReadCapacityUnits property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits The new value for the ReadCapacityUnits property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughputDescription withReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
        return this;
    }
    
    
    /**
     * Returns the value of the WriteCapacityUnits property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the WriteCapacityUnits property for this object.
     */
    public Long getWriteCapacityUnits() {
        return writeCapacityUnits;
    }
    
    /**
     * Sets the value of the WriteCapacityUnits property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits The new value for the WriteCapacityUnits property for this object.
     */
    public void setWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }
    
    /**
     * Sets the value of the WriteCapacityUnits property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits The new value for the WriteCapacityUnits property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProvisionedThroughputDescription withWriteCapacityUnits(Long writeCapacityUnits) {
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
        if (getLastIncreaseDateTime() != null) sb.append("LastIncreaseDateTime: " + getLastIncreaseDateTime() + ", ");
        if (getLastDecreaseDateTime() != null) sb.append("LastDecreaseDateTime: " + getLastDecreaseDateTime() + ", ");
        if (getNumberOfDecreasesToday() != null) sb.append("NumberOfDecreasesToday: " + getNumberOfDecreasesToday() + ", ");
        if (getReadCapacityUnits() != null) sb.append("ReadCapacityUnits: " + getReadCapacityUnits() + ", ");
        if (getWriteCapacityUnits() != null) sb.append("WriteCapacityUnits: " + getWriteCapacityUnits() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLastIncreaseDateTime() == null) ? 0 : getLastIncreaseDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastDecreaseDateTime() == null) ? 0 : getLastDecreaseDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfDecreasesToday() == null) ? 0 : getNumberOfDecreasesToday().hashCode()); 
        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode()); 
        hashCode = prime * hashCode + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ProvisionedThroughputDescription == false) return false;
        ProvisionedThroughputDescription other = (ProvisionedThroughputDescription)obj;
        
        if (other.getLastIncreaseDateTime() == null ^ this.getLastIncreaseDateTime() == null) return false;
        if (other.getLastIncreaseDateTime() != null && other.getLastIncreaseDateTime().equals(this.getLastIncreaseDateTime()) == false) return false; 
        if (other.getLastDecreaseDateTime() == null ^ this.getLastDecreaseDateTime() == null) return false;
        if (other.getLastDecreaseDateTime() != null && other.getLastDecreaseDateTime().equals(this.getLastDecreaseDateTime()) == false) return false; 
        if (other.getNumberOfDecreasesToday() == null ^ this.getNumberOfDecreasesToday() == null) return false;
        if (other.getNumberOfDecreasesToday() != null && other.getNumberOfDecreasesToday().equals(this.getNumberOfDecreasesToday()) == false) return false; 
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null) return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false) return false; 
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null) return false;
        if (other.getWriteCapacityUnits() != null && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    