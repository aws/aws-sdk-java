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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#createTable(CreateTableRequest) CreateTable operation}.
 * <p>
 * Adds a new table to your account.
 * </p>
 * <p>
 * The table name must be unique among those associated with the AWS Account issuing the request, and the AWS Region that receives the request (e.g.
 * <code>us-east-1</code> ).
 * </p>
 * <p>
 * The <code>CreateTable</code> operation triggers an asynchronous workflow to begin creating the table. Amazon DynamoDB immediately returns the state of
 * the table ( <code>CREATING</code> ) until the table is in the <code>ACTIVE</code> state. Once the table is in the <code>ACTIVE</code> state, you can
 * perform data plane operations.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#createTable(CreateTableRequest)
 */
public class CreateTableRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table you want to create. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     */
    private KeySchema keySchema;

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
     * Default constructor for a new CreateTableRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateTableRequest() {}
    
    /**
     * Constructs a new CreateTableRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table you want to create. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * @param keySchema The KeySchema identifies the primary key as a one
     * attribute primary key (hash) or a composite two attribute
     * (hash-and-range) primary key. Single attribute primary keys have one
     * index value: a <code>HashKeyElement</code>. A composite hash-and-range
     * primary key contains two attribute values: a
     * <code>HashKeyElement</code> and a <code>RangeKeyElement</code>.
     */
    public CreateTableRequest(String tableName, KeySchema keySchema) {
        this.tableName = tableName;
        this.keySchema = keySchema;
    }

    
    
    /**
     * The name of the table you want to create. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table you want to create. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table you want to create. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to create. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table you want to create. Allowed characters are
     * <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     * (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table you want to create. Allowed characters are
     *         <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>, <code>_</code>
     *         (underscore), <code>-</code> (hyphen) and <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTableRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     *
     * @return The KeySchema identifies the primary key as a one attribute primary
     *         key (hash) or a composite two attribute (hash-and-range) primary key.
     *         Single attribute primary keys have one index value: a
     *         <code>HashKeyElement</code>. A composite hash-and-range primary key
     *         contains two attribute values: a <code>HashKeyElement</code> and a
     *         <code>RangeKeyElement</code>.
     */
    public KeySchema getKeySchema() {
        return keySchema;
    }
    
    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     *
     * @param keySchema The KeySchema identifies the primary key as a one attribute primary
     *         key (hash) or a composite two attribute (hash-and-range) primary key.
     *         Single attribute primary keys have one index value: a
     *         <code>HashKeyElement</code>. A composite hash-and-range primary key
     *         contains two attribute values: a <code>HashKeyElement</code> and a
     *         <code>RangeKeyElement</code>.
     */
    public void setKeySchema(KeySchema keySchema) {
        this.keySchema = keySchema;
    }
    
    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keySchema The KeySchema identifies the primary key as a one attribute primary
     *         key (hash) or a composite two attribute (hash-and-range) primary key.
     *         Single attribute primary keys have one index value: a
     *         <code>HashKeyElement</code>. A composite hash-and-range primary key
     *         contains two attribute values: a <code>HashKeyElement</code> and a
     *         <code>RangeKeyElement</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTableRequest withKeySchema(KeySchema keySchema) {
        this.keySchema = keySchema;
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
    public CreateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
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
        if (keySchema != null) sb.append("KeySchema: " + keySchema + ", ");
        if (provisionedThroughput != null) sb.append("ProvisionedThroughput: " + provisionedThroughput + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateTableRequest == false) return false;
        CreateTableRequest other = (CreateTableRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        return true;
    }
    
}
    