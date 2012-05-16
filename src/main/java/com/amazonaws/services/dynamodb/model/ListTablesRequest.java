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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#listTables(ListTablesRequest) ListTables operation}.
 * <p>
 * Retrieves a paginated list of table names created by the AWS Account of the caller in the AWS Region (e.g. <code>us-east-1</code> ).
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#listTables(ListTablesRequest)
 */
public class ListTablesRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table that starts the list. If you already ran a
     * <code>ListTables</code> operation and received a
     * <code>LastEvaluatedTableName</code> value in the response, use that
     * value here to continue the list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String exclusiveStartTableName;

    /**
     * A number of maximum table names to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer limit;

    /**
     * The name of the table that starts the list. If you already ran a
     * <code>ListTables</code> operation and received a
     * <code>LastEvaluatedTableName</code> value in the response, use that
     * value here to continue the list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table that starts the list. If you already ran a
     *         <code>ListTables</code> operation and received a
     *         <code>LastEvaluatedTableName</code> value in the response, use that
     *         value here to continue the list.
     */
    public String getExclusiveStartTableName() {
        return exclusiveStartTableName;
    }
    
    /**
     * The name of the table that starts the list. If you already ran a
     * <code>ListTables</code> operation and received a
     * <code>LastEvaluatedTableName</code> value in the response, use that
     * value here to continue the list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartTableName The name of the table that starts the list. If you already ran a
     *         <code>ListTables</code> operation and received a
     *         <code>LastEvaluatedTableName</code> value in the response, use that
     *         value here to continue the list.
     */
    public void setExclusiveStartTableName(String exclusiveStartTableName) {
        this.exclusiveStartTableName = exclusiveStartTableName;
    }
    
    /**
     * The name of the table that starts the list. If you already ran a
     * <code>ListTables</code> operation and received a
     * <code>LastEvaluatedTableName</code> value in the response, use that
     * value here to continue the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartTableName The name of the table that starts the list. If you already ran a
     *         <code>ListTables</code> operation and received a
     *         <code>LastEvaluatedTableName</code> value in the response, use that
     *         value here to continue the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTablesRequest withExclusiveStartTableName(String exclusiveStartTableName) {
        this.exclusiveStartTableName = exclusiveStartTableName;
        return this;
    }
    
    
    /**
     * A number of maximum table names to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return A number of maximum table names to return.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * A number of maximum table names to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit A number of maximum table names to return.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * A number of maximum table names to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit A number of maximum table names to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTablesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (exclusiveStartTableName != null) sb.append("ExclusiveStartTableName: " + exclusiveStartTableName + ", ");
        if (limit != null) sb.append("Limit: " + limit + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExclusiveStartTableName() == null) ? 0 : getExclusiveStartTableName().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListTablesRequest == false) return false;
        ListTablesRequest other = (ListTablesRequest)obj;
        
        if (other.getExclusiveStartTableName() == null ^ this.getExclusiveStartTableName() == null) return false;
        if (other.getExclusiveStartTableName() != null && other.getExclusiveStartTableName().equals(this.getExclusiveStartTableName()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    