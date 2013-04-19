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
 * Represents the output of a <i>BatchGetItem</i> operation.
 * </p>
 */
public class BatchGetItemResult  implements Serializable  {

    /**
     * A map of table name to a list of items. Each object in
     * <i>Responses</i>consists of a table name, along with a map of
     * attribute data consisting of the data type and attribute value.
     */
    private java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> responses;

    /**
     * A map of tables and their respective keys that were not processed with
     * the current response, possibly due to reaching a limit on the response
     * size. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so the value can be provided directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each element
     * consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     * that define the items and the attributes associated with the items.
     * </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     * retrieve from the table or index. If no attribute names are specified
     * then all attributes will be returned. If any of the specified
     * attributes are not found, they will not appear in the result. <p>If
     * you are querying an index and only request attributes that are
     * projected into that index, the operation will consult the index and
     * bypass the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     * read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private java.util.Map<String,KeysAndAttributes> unprocessedKeys;

    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     * number of capacity units consumed. </li> </ul>
     */
    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * A map of table name to a list of items. Each object in
     * <i>Responses</i>consists of a table name, along with a map of
     * attribute data consisting of the data type and attribute value.
     *
     * @return A map of table name to a list of items. Each object in
     *         <i>Responses</i>consists of a table name, along with a map of
     *         attribute data consisting of the data type and attribute value.
     */
    public java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> getResponses() {
        
        return responses;

    }
    
    /**
     * A map of table name to a list of items. Each object in
     * <i>Responses</i>consists of a table name, along with a map of
     * attribute data consisting of the data type and attribute value.
     *
     * @param responses A map of table name to a list of items. Each object in
     *         <i>Responses</i>consists of a table name, along with a map of
     *         attribute data consisting of the data type and attribute value.
     */
    public void setResponses(java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> responses) {
        this.responses = responses;
    }
    
    /**
     * A map of table name to a list of items. Each object in
     * <i>Responses</i>consists of a table name, along with a map of
     * attribute data consisting of the data type and attribute value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responses A map of table name to a list of items. Each object in
     *         <i>Responses</i>consists of a table name, along with a map of
     *         attribute data consisting of the data type and attribute value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withResponses(java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> responses) {
        setResponses(responses);
        return this;
    }
    
    /**
     * A map of tables and their respective keys that were not processed with
     * the current response, possibly due to reaching a limit on the response
     * size. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so the value can be provided directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each element
     * consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     * that define the items and the attributes associated with the items.
     * </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     * retrieve from the table or index. If no attribute names are specified
     * then all attributes will be returned. If any of the specified
     * attributes are not found, they will not appear in the result. <p>If
     * you are querying an index and only request attributes that are
     * projected into that index, the operation will consult the index and
     * bypass the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     * read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A map of tables and their respective keys that were not processed with
     *         the current response, possibly due to reaching a limit on the response
     *         size. The <i>UnprocessedKeys</i> value is in the same form as
     *         <i>RequestItems</i>, so the value can be provided directly to a
     *         subsequent <i>BatchGetItem</i> operation. For more information, see
     *         <i>RequestItems</i> in the Request Parameters section. <p>Each element
     *         consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     *         that define the items and the attributes associated with the items.
     *         </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     *         retrieve from the table or index. If no attribute names are specified
     *         then all attributes will be returned. If any of the specified
     *         attributes are not found, they will not appear in the result. <p>If
     *         you are querying an index and only request attributes that are
     *         projected into that index, the operation will consult the index and
     *         bypass the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     *         read operation. If set to <code>true</code>, then a strongly
     *         consistent read is used; otherwise, an eventually consistent read is
     *         used. </li> </ul>
     */
    public java.util.Map<String,KeysAndAttributes> getUnprocessedKeys() {
        
        return unprocessedKeys;

    }
    
    /**
     * A map of tables and their respective keys that were not processed with
     * the current response, possibly due to reaching a limit on the response
     * size. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so the value can be provided directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each element
     * consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     * that define the items and the attributes associated with the items.
     * </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     * retrieve from the table or index. If no attribute names are specified
     * then all attributes will be returned. If any of the specified
     * attributes are not found, they will not appear in the result. <p>If
     * you are querying an index and only request attributes that are
     * projected into that index, the operation will consult the index and
     * bypass the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     * read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param unprocessedKeys A map of tables and their respective keys that were not processed with
     *         the current response, possibly due to reaching a limit on the response
     *         size. The <i>UnprocessedKeys</i> value is in the same form as
     *         <i>RequestItems</i>, so the value can be provided directly to a
     *         subsequent <i>BatchGetItem</i> operation. For more information, see
     *         <i>RequestItems</i> in the Request Parameters section. <p>Each element
     *         consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     *         that define the items and the attributes associated with the items.
     *         </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     *         retrieve from the table or index. If no attribute names are specified
     *         then all attributes will be returned. If any of the specified
     *         attributes are not found, they will not appear in the result. <p>If
     *         you are querying an index and only request attributes that are
     *         projected into that index, the operation will consult the index and
     *         bypass the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     *         read operation. If set to <code>true</code>, then a strongly
     *         consistent read is used; otherwise, an eventually consistent read is
     *         used. </li> </ul>
     */
    public void setUnprocessedKeys(java.util.Map<String,KeysAndAttributes> unprocessedKeys) {
        this.unprocessedKeys = unprocessedKeys;
    }
    
    /**
     * A map of tables and their respective keys that were not processed with
     * the current response, possibly due to reaching a limit on the response
     * size. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so the value can be provided directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each element
     * consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     * that define the items and the attributes associated with the items.
     * </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     * retrieve from the table or index. If no attribute names are specified
     * then all attributes will be returned. If any of the specified
     * attributes are not found, they will not appear in the result. <p>If
     * you are querying an index and only request attributes that are
     * projected into that index, the operation will consult the index and
     * bypass the table. If any of the requested attributes are not projected
     * into the index, Amazon DynamoDB will need to fetch each matching item
     * from the table. This extra fetching incurs additional throughput cost
     * and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     * read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param unprocessedKeys A map of tables and their respective keys that were not processed with
     *         the current response, possibly due to reaching a limit on the response
     *         size. The <i>UnprocessedKeys</i> value is in the same form as
     *         <i>RequestItems</i>, so the value can be provided directly to a
     *         subsequent <i>BatchGetItem</i> operation. For more information, see
     *         <i>RequestItems</i> in the Request Parameters section. <p>Each element
     *         consists of: <ul> <li> <p><i>Keys</i>-The primary key attribute values
     *         that define the items and the attributes associated with the items.
     *         </li> <li> <p><i>AttributesToGet</i>-One or more attributes to
     *         retrieve from the table or index. If no attribute names are specified
     *         then all attributes will be returned. If any of the specified
     *         attributes are not found, they will not appear in the result. <p>If
     *         you are querying an index and only request attributes that are
     *         projected into that index, the operation will consult the index and
     *         bypass the table. If any of the requested attributes are not projected
     *         into the index, Amazon DynamoDB will need to fetch each matching item
     *         from the table. This extra fetching incurs additional throughput cost
     *         and latency. </li> <li> <p><i>ConsistentRead</i>-The consistency of a
     *         read operation. If set to <code>true</code>, then a strongly
     *         consistent read is used; otherwise, an eventually consistent read is
     *         used. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withUnprocessedKeys(java.util.Map<String,KeysAndAttributes> unprocessedKeys) {
        setUnprocessedKeys(unprocessedKeys);
        return this;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     * number of capacity units consumed. </li> </ul>
     *
     * @return The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     *         number of capacity units consumed. </li> </ul>
     */
    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        
        return consumedCapacity;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     * number of capacity units consumed. </li> </ul>
     *
     * @param consumedCapacity The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     *         number of capacity units consumed. </li> </ul>
     */
    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        java.util.List<ConsumedCapacity> consumedCapacityCopy = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.size());
        consumedCapacityCopy.addAll(consumedCapacity);
        this.consumedCapacity = consumedCapacityCopy;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     * number of capacity units consumed. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     *         number of capacity units consumed. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (getConsumedCapacity() == null) setConsumedCapacity(new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.length));
        for (ConsumedCapacity value : consumedCapacity) {
            getConsumedCapacity().add(value);
        }
        return this;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     * number of capacity units consumed. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i>-The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i>-The total
     *         number of capacity units consumed. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
        } else {
            java.util.List<ConsumedCapacity> consumedCapacityCopy = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.size());
            consumedCapacityCopy.addAll(consumedCapacity);
            this.consumedCapacity = consumedCapacityCopy;
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
        if (getResponses() != null) sb.append("Responses: " + getResponses() + ",");    	
        if (getUnprocessedKeys() != null) sb.append("UnprocessedKeys: " + getUnprocessedKeys() + ",");    	
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode()); 
        hashCode = prime * hashCode + ((getUnprocessedKeys() == null) ? 0 : getUnprocessedKeys().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetItemResult == false) return false;
        BatchGetItemResult other = (BatchGetItemResult)obj;
        
        if (other.getResponses() == null ^ this.getResponses() == null) return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false) return false; 
        if (other.getUnprocessedKeys() == null ^ this.getUnprocessedKeys() == null) return false;
        if (other.getUnprocessedKeys() != null && other.getUnprocessedKeys().equals(this.getUnprocessedKeys()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    