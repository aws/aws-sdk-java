/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an <i>UpdateTable</i> operation.
 * </p>
 */
public class UpdateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the new index.
     * </p>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;
    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     */
    private String tableName;

    private ProvisionedThroughput provisionedThroughput;
    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each index in the array, you can request one
     * action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Create</i> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Delete</i> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates;
    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that already has a
     * stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     */
    private StreamSpecification streamSpecification;

    /**
     * Default constructor for UpdateTableRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public UpdateTableRequest() {
    }

    /**
     * Constructs a new UpdateTableRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table to be updated.
     * @param provisionedThroughput
     */
    public UpdateTableRequest(String tableName, ProvisionedThroughput provisionedThroughput) {
        setTableName(tableName);
        setProvisionedThroughput(provisionedThroughput);
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the new index.
     * </p>
     * 
     * @return An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *         global secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the
     *         new index.
     */

    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the new index.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *        global secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the
     *        new index.
     */

    public void setAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }

        this.attributeDefinitions = new java.util.ArrayList<AttributeDefinition>(attributeDefinitions);
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the new index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeDefinitions(java.util.Collection)} or {@link #withAttributeDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *        global secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the
     *        new index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
        if (this.attributeDefinitions == null) {
            setAttributeDefinitions(new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.length));
        }
        for (AttributeDefinition ele : attributeDefinitions) {
            this.attributeDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the new index.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *        global secondary index to the table, <i>AttributeDefinitions</i> must include the key element(s) of the
     *        new index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     * 
     * @param tableName
     *        The name of the table to be updated.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     * 
     * @return The name of the table to be updated.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     * 
     * @param tableName
     *        The name of the table to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @param provisionedThroughput
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * @return
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * @param provisionedThroughput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each index in the array, you can request one
     * action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Create</i> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Delete</i> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return An array of one or more global secondary indexes for the table. For each index in the array, you can
     *         request one action:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Create</i> - add a new global secondary index to the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Delete</i> - remove a global secondary index from the table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     *         Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.List<GlobalSecondaryIndexUpdate> getGlobalSecondaryIndexUpdates() {
        return globalSecondaryIndexUpdates;
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each index in the array, you can request one
     * action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Create</i> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Delete</i> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        An array of one or more global secondary indexes for the table. For each index in the array, you can
     *        request one action:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Create</i> - add a new global secondary index to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Delete</i> - remove a global secondary index from the table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     *        Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setGlobalSecondaryIndexUpdates(java.util.Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        if (globalSecondaryIndexUpdates == null) {
            this.globalSecondaryIndexUpdates = null;
            return;
        }

        this.globalSecondaryIndexUpdates = new java.util.ArrayList<GlobalSecondaryIndexUpdate>(globalSecondaryIndexUpdates);
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each index in the array, you can request one
     * action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Create</i> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Delete</i> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexUpdates(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        An array of one or more global secondary indexes for the table. For each index in the array, you can
     *        request one action:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Create</i> - add a new global secondary index to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Delete</i> - remove a global secondary index from the table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     *        Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withGlobalSecondaryIndexUpdates(GlobalSecondaryIndexUpdate... globalSecondaryIndexUpdates) {
        if (this.globalSecondaryIndexUpdates == null) {
            setGlobalSecondaryIndexUpdates(new java.util.ArrayList<GlobalSecondaryIndexUpdate>(globalSecondaryIndexUpdates.length));
        }
        for (GlobalSecondaryIndexUpdate ele : globalSecondaryIndexUpdates) {
            this.globalSecondaryIndexUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each index in the array, you can request one
     * action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Create</i> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Delete</i> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        An array of one or more global secondary indexes for the table. For each index in the array, you can
     *        request one action:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Create</i> - add a new global secondary index to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Update</i> - modify the provisioned throughput settings of an existing global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Delete</i> - remove a global secondary index from the table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     *        Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withGlobalSecondaryIndexUpdates(java.util.Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        setGlobalSecondaryIndexUpdates(globalSecondaryIndexUpdates);
        return this;
    }

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that already has a
     * stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * 
     * @param streamSpecification
     *        Represents the DynamoDB Streams configuration for the table.</p> <note>
     *        <p>
     *        You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that already
     *        has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     *        </p>
     */

    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that already has a
     * stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * 
     * @return Represents the DynamoDB Streams configuration for the table.</p> <note>
     *         <p>
     *         You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that
     *         already has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     *         </p>
     */

    public StreamSpecification getStreamSpecification() {
        return this.streamSpecification;
    }

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that already has a
     * stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * 
     * @param streamSpecification
     *        Represents the DynamoDB Streams configuration for the table.</p> <note>
     *        <p>
     *        You will receive a <i>ResourceInUseException</i> if you attempt to enable a stream on a table that already
     *        has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withStreamSpecification(StreamSpecification streamSpecification) {
        setStreamSpecification(streamSpecification);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeDefinitions() != null)
            sb.append("AttributeDefinitions: " + getAttributeDefinitions() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getGlobalSecondaryIndexUpdates() != null)
            sb.append("GlobalSecondaryIndexUpdates: " + getGlobalSecondaryIndexUpdates() + ",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: " + getStreamSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableRequest == false)
            return false;
        UpdateTableRequest other = (UpdateTableRequest) obj;
        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null)
            return false;
        if (other.getAttributeDefinitions() != null && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getGlobalSecondaryIndexUpdates() == null ^ this.getGlobalSecondaryIndexUpdates() == null)
            return false;
        if (other.getGlobalSecondaryIndexUpdates() != null && other.getGlobalSecondaryIndexUpdates().equals(this.getGlobalSecondaryIndexUpdates()) == false)
            return false;
        if (other.getStreamSpecification() == null ^ this.getStreamSpecification() == null)
            return false;
        if (other.getStreamSpecification() != null && other.getStreamSpecification().equals(this.getStreamSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexUpdates() == null) ? 0 : getGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime * hashCode + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableRequest clone() {
        return (UpdateTableRequest) super.clone();
    }
}
