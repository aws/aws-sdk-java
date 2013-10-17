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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#updateTable(UpdateTableRequest) UpdateTable operation}.
 * <p>
 * Updates the provisioned throughput for the given table. Setting the throughput for a table helps you manage performance and is part of the provisioned
 * throughput feature of Amazon DynamoDB.
 * </p>
 * <p>
 * The provisioned throughput values can be upgraded or downgraded based on the maximums and minimums listed in the <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"> Limits </a> section in the Amazon DynamoDB Developer Guide.
 * </p>
 * <p>
 * The table must be in the <code>ACTIVE</code> state for this operation to succeed. <i>UpdateTable</i> is an asynchronous operation; while executing the
 * operation, the table is in the <code>UPDATING</code> state. While the table is in the <code>UPDATING</code> state, the table still has the provisioned
 * throughput from before the call. The new provisioned throughput setting is in effect only when the table returns to the <code>ACTIVE</code> state
 * after the <i>UpdateTable</i> operation.
 * </p>
 * <p>
 * You cannot add, modify or delete local secondary indexes using <i>UpdateTable</i> . Local secondary indexes can only be defined at table creation
 * time.
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
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     */
    private ProvisionedThroughput provisionedThroughput;

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
     * @param provisionedThroughput The provisioned throughput settings for
     * the specified table. The settings can be modified using the
     * <i>UpdateTable</i> operation. <p>For current minimum and maximum
     * provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
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
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     *
     * @return The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     *
     * @param provisionedThroughput The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() );
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
    