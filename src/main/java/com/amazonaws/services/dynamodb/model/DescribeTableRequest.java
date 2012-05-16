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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#describeTable(DescribeTableRequest) DescribeTable operation}.
 * <p>
 * Retrieves information about the table, including the current status of the table, the primary key schema and when the table was created.
 * </p>
 * <p>
 * If the table does not exist, Amazon DynamoDB returns a <code>ResourceNotFoundException</code> .
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#describeTable(DescribeTableRequest)
 */
public class DescribeTableRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table you want to describe. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The name of the table you want to describe. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table you want to describe. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table you want to describe. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to describe. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table you want to describe. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to describe. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTableRequest withTableName(String tableName) {
        this.tableName = tableName;
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
        if (tableName != null) sb.append("TableName: " + tableName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeTableRequest == false) return false;
        DescribeTableRequest other = (DescribeTableRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        return true;
    }
    
}
    