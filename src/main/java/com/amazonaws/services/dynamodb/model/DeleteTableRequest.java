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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#deleteTable(DeleteTableRequest) DeleteTable operation}.
 * <p>
 * Deletes a table and all of its items.
 * </p>
 * <p>
 * If the table is in the <code>ACTIVE</code> state, you can delete it. If a table is in <code>CREATING</code> or <code>UPDATING</code> states then
 * Amazon DynamoDB returns a <code>ResourceInUseException</code> . If the specified table does not exist, Amazon DynamoDB returns a
 * <code>ResourceNotFoundException</code> .
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#deleteTable(DeleteTableRequest)
 */
public class DeleteTableRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table you want to delete. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
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
     * @param tableName The name of the table you want to delete. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     */
    public DeleteTableRequest(String tableName) {
        this.tableName = tableName;
    }

    
    
    /**
     * The name of the table you want to delete. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table you want to delete. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table you want to delete. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to delete. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table you want to delete. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to delete. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
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
    
        if (obj instanceof DeleteTableRequest == false) return false;
        DeleteTableRequest other = (DeleteTableRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        return true;
    }
    
}
    