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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteTable(DeleteTableRequest) DeleteTable operation}.
 * <p>
 * The <i>DeleteTable</i> operation deletes a table and all of its items. After a <i>DeleteTable</i> request, the specified table is in the
 * <code>DELETING</code> state until Amazon DynamoDB completes the deletion. If the table is in the <code>ACTIVE</code> state, you can delete it. If a
 * table is in <code>CREATING</code> or <code>UPDATING</code> states, then Amazon DynamoDB returns a
 * <i>ResourceInUseException</i> . If the specified table does not exist, Amazon DynamoDB returns a <i>ResourceNotFoundException</i>
 * . If table is already in the <code>DELETING</code> state, no error is returned.
 * </p>
 * <p>
 * <b>NOTE:</b> Amazon DynamoDB might continue to accept data read and write operations, such as GetItem and PutItem, on a table in the DELETING state
 * until the table deletion is complete.
 * </p>
 * <p>
 * When you delete a table, any local secondary indexes on that table are also deleted.
 * </p>
 * <p>
 * Use the <i>DescribeTable</i> API to check the status of the table.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteTable(DeleteTableRequest)
 */
public class DeleteTableRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * Default constructor for a new DeleteTableRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteTableRequest() {}
    
    /**
     * Constructs a new DeleteTableRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to delete.
     */
    public DeleteTableRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * The name of the table to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table to delete.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to delete.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTableRequest withTableName(String tableName) {
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() );
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

        if (obj instanceof DeleteTableRequest == false) return false;
        DeleteTableRequest other = (DeleteTableRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        return true;
    }
    
}
    