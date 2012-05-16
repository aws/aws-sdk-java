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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#updateTable(UpdateTableRequest) UpdateTable operation}.
 * <p>
 * Updates the provisioned throughput for the given table.
 * </p>
 * <p>
 * Setting the throughput for a table helps you manage performance and is part of the Provisioned Throughput feature of Amazon DynamoDB.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#updateTable(UpdateTableRequest)
 */
public class UpdateTableRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table you want to update. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * Provisioned throughput reserves the required read and write resources
     * for your table in terms of <code>ReadCapacityUnits</code> and
     * <code>WriteCapacityUnits</code>. Values for provisioned throughput
     * depend upon your expected read/write rates, item size, and
     * consistency. Provide the expected number of read and write operations,
     * assuming an item size of 1k and strictly consistent reads. For 2k item
     * size, double the value. For 3k, triple the value, etc.
     * Eventually-consistent reads consume half the resources of strictly
     * consistent reads.
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * The name of the table you want to update. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table you want to update. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table you want to update. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to update. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table you want to update. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to update. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateTableRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * Provisioned throughput reserves the required read and write resources
     * for your table in terms of <code>ReadCapacityUnits</code> and
     * <code>WriteCapacityUnits</code>. Values for provisioned throughput
     * depend upon your expected read/write rates, item size, and
     * consistency. Provide the expected number of read and write operations,
     * assuming an item size of 1k and strictly consistent reads. For 2k item
     * size, double the value. For 3k, triple the value, etc.
     * Eventually-consistent reads consume half the resources of strictly
     * consistent reads.
     *
     * @return Provisioned throughput reserves the required read and write resources
     *         for your table in terms of <code>ReadCapacityUnits</code> and
     *         <code>WriteCapacityUnits</code>. Values for provisioned throughput
     *         depend upon your expected read/write rates, item size, and
     *         consistency. Provide the expected number of read and write operations,
     *         assuming an item size of 1k and strictly consistent reads. For 2k item
     *         size, double the value. For 3k, triple the value, etc.
     *         Eventually-consistent reads consume half the resources of strictly
     *         consistent reads.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * Provisioned throughput reserves the required read and write resources
     * for your table in terms of <code>ReadCapacityUnits</code> and
     * <code>WriteCapacityUnits</code>. Values for provisioned throughput
     * depend upon your expected read/write rates, item size, and
     * consistency. Provide the expected number of read and write operations,
     * assuming an item size of 1k and strictly consistent reads. For 2k item
     * size, double the value. For 3k, triple the value, etc.
     * Eventually-consistent reads consume half the resources of strictly
     * consistent reads.
     *
     * @param provisionedThroughput Provisioned throughput reserves the required read and write resources
     *         for your table in terms of <code>ReadCapacityUnits</code> and
     *         <code>WriteCapacityUnits</code>. Values for provisioned throughput
     *         depend upon your expected read/write rates, item size, and
     *         consistency. Provide the expected number of read and write operations,
     *         assuming an item size of 1k and strictly consistent reads. For 2k item
     *         size, double the value. For 3k, triple the value, etc.
     *         Eventually-consistent reads consume half the resources of strictly
     *         consistent reads.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * Provisioned throughput reserves the required read and write resources
     * for your table in terms of <code>ReadCapacityUnits</code> and
     * <code>WriteCapacityUnits</code>. Values for provisioned throughput
     * depend upon your expected read/write rates, item size, and
     * consistency. Provide the expected number of read and write operations,
     * assuming an item size of 1k and strictly consistent reads. For 2k item
     * size, double the value. For 3k, triple the value, etc.
     * Eventually-consistent reads consume half the resources of strictly
     * consistent reads.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput Provisioned throughput reserves the required read and write resources
     *         for your table in terms of <code>ReadCapacityUnits</code> and
     *         <code>WriteCapacityUnits</code>. Values for provisioned throughput
     *         depend upon your expected read/write rates, item size, and
     *         consistency. Provide the expected number of read and write operations,
     *         assuming an item size of 1k and strictly consistent reads. For 2k item
     *         size, double the value. For 3k, triple the value, etc.
     *         Eventually-consistent reads consume half the resources of strictly
     *         consistent reads.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
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
        if (provisionedThroughput != null) sb.append("ProvisionedThroughput: " + provisionedThroughput + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof UpdateTableRequest == false) return false;
        UpdateTableRequest other = (UpdateTableRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        return true;
    }
    
}
    