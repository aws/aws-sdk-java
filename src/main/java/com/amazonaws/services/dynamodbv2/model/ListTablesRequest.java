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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#listTables(ListTablesRequest) ListTables operation}.
 * <p>
 * Returns an array of all the tables associated with the current account and endpoint.
 * </p>
 * <p>
 * Each Amazon DynamoDB endpoint is entirely independent. For example, if you have two tables called "MyTable," one in
 * <i>dynamodb.us-east-1.amazonaws.com</i> and one in <i>dynamodb.us-west-1.amazonaws.com</i> , they are completely independent and do not share any
 * data. The <i>ListTables</i> operation returns all of the table names associated with the account making the request, for the endpoint that receives
 * the request.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#listTables(ListTablesRequest)
 */
public class ListTablesRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The name of the table that starts the list. If you already ran a
     * <i>ListTables</i> operation and received a
     * <i>LastEvaluatedTableName</i> value in the response, use that value
     * here to continue the list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String exclusiveStartTableName;

    /**
     * A maximum number of table names to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer limit;

    /**
     * The name of the table that starts the list. If you already ran a
     * <i>ListTables</i> operation and received a
     * <i>LastEvaluatedTableName</i> value in the response, use that value
     * here to continue the list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table that starts the list. If you already ran a
     *         <i>ListTables</i> operation and received a
     *         <i>LastEvaluatedTableName</i> value in the response, use that value
     *         here to continue the list.
     */
    public String getExclusiveStartTableName() {
        return exclusiveStartTableName;
    }
    
    /**
     * The name of the table that starts the list. If you already ran a
     * <i>ListTables</i> operation and received a
     * <i>LastEvaluatedTableName</i> value in the response, use that value
     * here to continue the list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartTableName The name of the table that starts the list. If you already ran a
     *         <i>ListTables</i> operation and received a
     *         <i>LastEvaluatedTableName</i> value in the response, use that value
     *         here to continue the list.
     */
    public void setExclusiveStartTableName(String exclusiveStartTableName) {
        this.exclusiveStartTableName = exclusiveStartTableName;
    }
    
    /**
     * The name of the table that starts the list. If you already ran a
     * <i>ListTables</i> operation and received a
     * <i>LastEvaluatedTableName</i> value in the response, use that value
     * here to continue the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartTableName The name of the table that starts the list. If you already ran a
     *         <i>ListTables</i> operation and received a
     *         <i>LastEvaluatedTableName</i> value in the response, use that value
     *         here to continue the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTablesRequest withExclusiveStartTableName(String exclusiveStartTableName) {
        this.exclusiveStartTableName = exclusiveStartTableName;
        return this;
    }
    
    
    /**
     * A maximum number of table names to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return A maximum number of table names to return.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * A maximum number of table names to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit A maximum number of table names to return.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * A maximum number of table names to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit A maximum number of table names to return.
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
        if (getExclusiveStartTableName() != null) sb.append("ExclusiveStartTableName: " + getExclusiveStartTableName() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
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
    