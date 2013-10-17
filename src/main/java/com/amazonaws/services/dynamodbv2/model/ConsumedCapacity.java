/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;


/**
 * <p>
 * The table name that consumed provisioned throughput, and the number of capacity units consumed by it. <i>ConsumedCapacity</i> is only returned if it
 * was asked for in the request. For more information, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"> Provisioned Throughput </a> in the Amazon
 * DynamoDB Developer Guide.
 * </p>
 */
public class ConsumedCapacity implements Serializable {

    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The total number of capacity units consumed.
     */
    private Double capacityUnits;

    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The table that consumed the provisioned throughput.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The table that consumed the provisioned throughput.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The table that consumed the provisioned throughput.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * The total number of capacity units consumed.
     *
     * @return The total number of capacity units consumed.
     */
    public Double getCapacityUnits() {
        return capacityUnits;
    }
    
    /**
     * The total number of capacity units consumed.
     *
     * @param capacityUnits The total number of capacity units consumed.
     */
    public void setCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
    }
    
    /**
     * The total number of capacity units consumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacityUnits The total number of capacity units consumed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getCapacityUnits() != null) sb.append("CapacityUnits: " + getCapacityUnits() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConsumedCapacity == false) return false;
        ConsumedCapacity other = (ConsumedCapacity)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null) return false;
        if (other.getCapacityUnits() != null && other.getCapacityUnits().equals(this.getCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    