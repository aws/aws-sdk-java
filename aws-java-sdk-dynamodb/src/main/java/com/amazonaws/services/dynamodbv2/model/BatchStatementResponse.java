/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A PartiQL batch statement response..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchStatementResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStatementResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error associated with a failed PartiQL batch statement.
     * </p>
     */
    private BatchStatementError error;
    /**
     * <p>
     * The table name associated with a failed PartiQL batch statement.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A DynamoDB item associated with a BatchStatementResponse
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * <p>
     * The error associated with a failed PartiQL batch statement.
     * </p>
     * 
     * @param error
     *        The error associated with a failed PartiQL batch statement.
     */

    public void setError(BatchStatementError error) {
        this.error = error;
    }

    /**
     * <p>
     * The error associated with a failed PartiQL batch statement.
     * </p>
     * 
     * @return The error associated with a failed PartiQL batch statement.
     */

    public BatchStatementError getError() {
        return this.error;
    }

    /**
     * <p>
     * The error associated with a failed PartiQL batch statement.
     * </p>
     * 
     * @param error
     *        The error associated with a failed PartiQL batch statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementResponse withError(BatchStatementError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The table name associated with a failed PartiQL batch statement.
     * </p>
     * 
     * @param tableName
     *        The table name associated with a failed PartiQL batch statement.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name associated with a failed PartiQL batch statement.
     * </p>
     * 
     * @return The table name associated with a failed PartiQL batch statement.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The table name associated with a failed PartiQL batch statement.
     * </p>
     * 
     * @param tableName
     *        The table name associated with a failed PartiQL batch statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementResponse withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A DynamoDB item associated with a BatchStatementResponse
     * </p>
     * 
     * @return A DynamoDB item associated with a BatchStatementResponse
     */

    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A DynamoDB item associated with a BatchStatementResponse
     * </p>
     * 
     * @param item
     *        A DynamoDB item associated with a BatchStatementResponse
     */

    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A DynamoDB item associated with a BatchStatementResponse
     * </p>
     * 
     * @param item
     *        A DynamoDB item associated with a BatchStatementResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementResponse withItem(java.util.Map<String, AttributeValue> item) {
        setItem(item);
        return this;
    }

    /**
     * Add a single Item entry
     *
     * @see BatchStatementResponse#withItem
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementResponse addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStatementResponse clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getItem() != null)
            sb.append("Item: ").append(getItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStatementResponse == false)
            return false;
        BatchStatementResponse other = (BatchStatementResponse) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        return hashCode;
    }

    @Override
    public BatchStatementResponse clone() {
        try {
            return (BatchStatementResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.BatchStatementResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
