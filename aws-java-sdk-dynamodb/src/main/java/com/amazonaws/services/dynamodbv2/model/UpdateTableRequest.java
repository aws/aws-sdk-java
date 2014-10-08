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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#updateTable(UpdateTableRequest) UpdateTable operation}.
 * <p>
 * Updates the provisioned throughput for the given table. Setting the
 * throughput for a table helps you manage performance and is part of the
 * provisioned throughput feature of DynamoDB.
 * </p>
 * <p>
 * The provisioned throughput values can be upgraded or downgraded based
 * on the maximums and minimums listed in the
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"> Limits </a>
 * section in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * The table must be in the <code>ACTIVE</code> state for this operation
 * to succeed. <i>UpdateTable</i> is an asynchronous operation; while
 * executing the operation, the table is in the <code>UPDATING</code>
 * state. While the table is in the <code>UPDATING</code> state, the
 * table still has the provisioned throughput from before the call. The
 * new provisioned throughput setting is in effect only when the table
 * returns to the <code>ACTIVE</code> state after the <i>UpdateTable</i>
 * operation.
 * </p>
 * <p>
 * You cannot add, modify or delete indexes using <i>UpdateTable</i> .
 * Indexes can only be defined at table creation time.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#updateTable(UpdateTableRequest)
 */
public class UpdateTableRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table to be updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * An array of one or more global secondary indexes on the table,
     * together with provisioned throughput settings for each index.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates;

    /**
     * Default constructor for a new UpdateTableRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateTableRequest() {}
    
    /**
     * Constructs a new UpdateTableRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to be updated.
     * @param provisionedThroughput Represents the provisioned throughput
     * settings for a specified table or index. The settings can be modified
     * using the <i>UpdateTable</i> operation. <p>For current minimum and
     * maximum provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public UpdateTableRequest(String tableName, ProvisionedThroughput provisionedThroughput) {
        setTableName(tableName);
        setProvisionedThroughput(provisionedThroughput);
    }

    /**
     * The name of the table to be updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table to be updated.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table to be updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to be updated.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table to be updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to be updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTableRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return Represents the provisioned throughput settings for a specified table
     *         or index. The settings can be modified using the <i>UpdateTable</i>
     *         operation. <p>For current minimum and maximum provisioned throughput
     *         values, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @param provisionedThroughput Represents the provisioned throughput settings for a specified table
     *         or index. The settings can be modified using the <i>UpdateTable</i>
     *         operation. <p>For current minimum and maximum provisioned throughput
     *         values, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput Represents the provisioned throughput settings for a specified table
     *         or index. The settings can be modified using the <i>UpdateTable</i>
     *         operation. <p>For current minimum and maximum provisioned throughput
     *         values, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * An array of one or more global secondary indexes on the table,
     * together with provisioned throughput settings for each index.
     *
     * @return An array of one or more global secondary indexes on the table,
     *         together with provisioned throughput settings for each index.
     */
    public java.util.List<GlobalSecondaryIndexUpdate> getGlobalSecondaryIndexUpdates() {
        return globalSecondaryIndexUpdates;
    }
    
    /**
     * An array of one or more global secondary indexes on the table,
     * together with provisioned throughput settings for each index.
     *
     * @param globalSecondaryIndexUpdates An array of one or more global secondary indexes on the table,
     *         together with provisioned throughput settings for each index.
     */
    public void setGlobalSecondaryIndexUpdates(java.util.Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        if (globalSecondaryIndexUpdates == null) {
            this.globalSecondaryIndexUpdates = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate>(globalSecondaryIndexUpdates.size());
        globalSecondaryIndexUpdatesCopy.addAll(globalSecondaryIndexUpdates);
        this.globalSecondaryIndexUpdates = globalSecondaryIndexUpdatesCopy;
    }
    
    /**
     * An array of one or more global secondary indexes on the table,
     * together with provisioned throughput settings for each index.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param globalSecondaryIndexUpdates An array of one or more global secondary indexes on the table,
     *         together with provisioned throughput settings for each index.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTableRequest withGlobalSecondaryIndexUpdates(GlobalSecondaryIndexUpdate... globalSecondaryIndexUpdates) {
        if (getGlobalSecondaryIndexUpdates() == null) setGlobalSecondaryIndexUpdates(new java.util.ArrayList<GlobalSecondaryIndexUpdate>(globalSecondaryIndexUpdates.length));
        for (GlobalSecondaryIndexUpdate value : globalSecondaryIndexUpdates) {
            getGlobalSecondaryIndexUpdates().add(value);
        }
        return this;
    }
    
    /**
     * An array of one or more global secondary indexes on the table,
     * together with provisioned throughput settings for each index.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param globalSecondaryIndexUpdates An array of one or more global secondary indexes on the table,
     *         together with provisioned throughput settings for each index.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTableRequest withGlobalSecondaryIndexUpdates(java.util.Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        if (globalSecondaryIndexUpdates == null) {
            this.globalSecondaryIndexUpdates = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GlobalSecondaryIndexUpdate>(globalSecondaryIndexUpdates.size());
            globalSecondaryIndexUpdatesCopy.addAll(globalSecondaryIndexUpdates);
            this.globalSecondaryIndexUpdates = globalSecondaryIndexUpdatesCopy;
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getGlobalSecondaryIndexUpdates() != null) sb.append("GlobalSecondaryIndexUpdates: " + getGlobalSecondaryIndexUpdates() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexUpdates() == null) ? 0 : getGlobalSecondaryIndexUpdates().hashCode()); 
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
        if (other.getGlobalSecondaryIndexUpdates() == null ^ this.getGlobalSecondaryIndexUpdates() == null) return false;
        if (other.getGlobalSecondaryIndexUpdates() != null && other.getGlobalSecondaryIndexUpdates().equals(this.getGlobalSecondaryIndexUpdates()) == false) return false; 
        return true;
    }
    
}
    