/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the properties of a global secondary index.
 * </p>
 */
public class GlobalSecondaryIndexDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The complete key schema for the global secondary index, consisting of one
     * or more pairs of attribute names and key types (<code>HASH</code> or
     * <code>RANGE</code>).
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;

    private Projection projection;
    /**
     * <p>
     * The current state of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CREATING</i> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>UPDATING</i> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETING</i> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ACTIVE</i> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String indexStatus;
    /**
     * <p>
     * Indicates whether the index is currently backfilling. <i>Backfilling</i>
     * is the process of reading items from the table and determining whether
     * they can be added to the index. (Not all items will qualify: For example,
     * a hash key attribute cannot have any duplicates.) If an item can be added
     * to the index, DynamoDB will do so. After all items have been processed,
     * the backfilling operation is complete and <i>Backfilling</i> is false.
     * </p>
     * <note>
     * <p>
     * For indexes that were created during a <i>CreateTable</i> operation, the
     * <i>Backfilling</i> attribute does not appear in the <i>DescribeTable</i>
     * output.
     * </p>
     * </note>
     */
    private Boolean backfilling;

    private ProvisionedThroughputDescription provisionedThroughput;
    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     */
    private Long indexSizeBytes;
    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     */
    private Long itemCount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     */
    private String indexArn;

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @return The name of the global secondary index.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The complete key schema for the global secondary index, consisting of one
     * or more pairs of attribute names and key types (<code>HASH</code> or
     * <code>RANGE</code>).
     * </p>
     * 
     * @return The complete key schema for the global secondary index,
     *         consisting of one or more pairs of attribute names and key types
     *         (<code>HASH</code> or <code>RANGE</code>).
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The complete key schema for the global secondary index, consisting of one
     * or more pairs of attribute names and key types (<code>HASH</code> or
     * <code>RANGE</code>).
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the global secondary index, consisting
     *        of one or more pairs of attribute names and key types (
     *        <code>HASH</code> or <code>RANGE</code>).
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<KeySchemaElement>(keySchema);
    }

    /**
     * <p>
     * The complete key schema for the global secondary index, consisting of one
     * or more pairs of attribute names and key types (<code>HASH</code> or
     * <code>RANGE</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setKeySchema(java.util.Collection)} or
     * {@link #withKeySchema(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the global secondary index, consisting
     *        of one or more pairs of attribute names and key types (
     *        <code>HASH</code> or <code>RANGE</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withKeySchema(
            KeySchemaElement... keySchema) {
        if (this.keySchema == null) {
            setKeySchema(new java.util.ArrayList<KeySchemaElement>(
                    keySchema.length));
        }
        for (KeySchemaElement ele : keySchema) {
            this.keySchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The complete key schema for the global secondary index, consisting of one
     * or more pairs of attribute names and key types (<code>HASH</code> or
     * <code>RANGE</code>).
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the global secondary index, consisting
     *        of one or more pairs of attribute names and key types (
     *        <code>HASH</code> or <code>RANGE</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withKeySchema(
            java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * Sets the value of the Projection property for this object.
     * 
     * @param projection
     *        The new value for the Projection property for this object.
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    /**
     * Returns the value of the Projection property for this object.
     * 
     * @return The value of the Projection property for this object.
     */
    public Projection getProjection() {
        return this.projection;
    }

    /**
     * Sets the value of the Projection property for this object.
     * 
     * @param projection
     *        The new value for the Projection property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withProjection(Projection projection) {
        setProjection(projection);
        return this;
    }

    /**
     * <p>
     * The current state of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CREATING</i> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>UPDATING</i> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETING</i> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ACTIVE</i> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CREATING</i> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>UPDATING</i> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETING</i> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ACTIVE</i> - The index is ready for use.
     *        </p>
     *        </li>
     * @see IndexStatus
     */
    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The current state of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CREATING</i> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>UPDATING</i> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETING</i> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ACTIVE</i> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the global secondary index:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>CREATING</i> - The index is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>UPDATING</i> - The index is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DELETING</i> - The index is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ACTIVE</i> - The index is ready for use.
     *         </p>
     *         </li>
     * @see IndexStatus
     */
    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * <p>
     * The current state of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CREATING</i> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>UPDATING</i> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETING</i> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ACTIVE</i> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CREATING</i> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>UPDATING</i> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETING</i> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ACTIVE</i> - The index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public GlobalSecondaryIndexDescription withIndexStatus(String indexStatus) {
        setIndexStatus(indexStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CREATING</i> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>UPDATING</i> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETING</i> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ACTIVE</i> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CREATING</i> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>UPDATING</i> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETING</i> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ACTIVE</i> - The index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public void setIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
    }

    /**
     * <p>
     * The current state of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CREATING</i> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>UPDATING</i> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DELETING</i> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ACTIVE</i> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CREATING</i> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>UPDATING</i> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DELETING</i> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ACTIVE</i> - The index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public GlobalSecondaryIndexDescription withIndexStatus(
            IndexStatus indexStatus) {
        setIndexStatus(indexStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the index is currently backfilling. <i>Backfilling</i>
     * is the process of reading items from the table and determining whether
     * they can be added to the index. (Not all items will qualify: For example,
     * a hash key attribute cannot have any duplicates.) If an item can be added
     * to the index, DynamoDB will do so. After all items have been processed,
     * the backfilling operation is complete and <i>Backfilling</i> is false.
     * </p>
     * <note>
     * <p>
     * For indexes that were created during a <i>CreateTable</i> operation, the
     * <i>Backfilling</i> attribute does not appear in the <i>DescribeTable</i>
     * output.
     * </p>
     * </note>
     * 
     * @param backfilling
     *        Indicates whether the index is currently backfilling.
     *        <i>Backfilling</i> is the process of reading items from the table
     *        and determining whether they can be added to the index. (Not all
     *        items will qualify: For example, a hash key attribute cannot have
     *        any duplicates.) If an item can be added to the index, DynamoDB
     *        will do so. After all items have been processed, the backfilling
     *        operation is complete and <i>Backfilling</i> is false.</p> <note>
     *        <p>
     *        For indexes that were created during a <i>CreateTable</i>
     *        operation, the <i>Backfilling</i> attribute does not appear in the
     *        <i>DescribeTable</i> output.
     *        </p>
     */
    public void setBackfilling(Boolean backfilling) {
        this.backfilling = backfilling;
    }

    /**
     * <p>
     * Indicates whether the index is currently backfilling. <i>Backfilling</i>
     * is the process of reading items from the table and determining whether
     * they can be added to the index. (Not all items will qualify: For example,
     * a hash key attribute cannot have any duplicates.) If an item can be added
     * to the index, DynamoDB will do so. After all items have been processed,
     * the backfilling operation is complete and <i>Backfilling</i> is false.
     * </p>
     * <note>
     * <p>
     * For indexes that were created during a <i>CreateTable</i> operation, the
     * <i>Backfilling</i> attribute does not appear in the <i>DescribeTable</i>
     * output.
     * </p>
     * </note>
     * 
     * @return Indicates whether the index is currently backfilling.
     *         <i>Backfilling</i> is the process of reading items from the table
     *         and determining whether they can be added to the index. (Not all
     *         items will qualify: For example, a hash key attribute cannot have
     *         any duplicates.) If an item can be added to the index, DynamoDB
     *         will do so. After all items have been processed, the backfilling
     *         operation is complete and <i>Backfilling</i> is false.</p> <note>
     *         <p>
     *         For indexes that were created during a <i>CreateTable</i>
     *         operation, the <i>Backfilling</i> attribute does not appear in
     *         the <i>DescribeTable</i> output.
     *         </p>
     */
    public Boolean getBackfilling() {
        return this.backfilling;
    }

    /**
     * <p>
     * Indicates whether the index is currently backfilling. <i>Backfilling</i>
     * is the process of reading items from the table and determining whether
     * they can be added to the index. (Not all items will qualify: For example,
     * a hash key attribute cannot have any duplicates.) If an item can be added
     * to the index, DynamoDB will do so. After all items have been processed,
     * the backfilling operation is complete and <i>Backfilling</i> is false.
     * </p>
     * <note>
     * <p>
     * For indexes that were created during a <i>CreateTable</i> operation, the
     * <i>Backfilling</i> attribute does not appear in the <i>DescribeTable</i>
     * output.
     * </p>
     * </note>
     * 
     * @param backfilling
     *        Indicates whether the index is currently backfilling.
     *        <i>Backfilling</i> is the process of reading items from the table
     *        and determining whether they can be added to the index. (Not all
     *        items will qualify: For example, a hash key attribute cannot have
     *        any duplicates.) If an item can be added to the index, DynamoDB
     *        will do so. After all items have been processed, the backfilling
     *        operation is complete and <i>Backfilling</i> is false.</p> <note>
     *        <p>
     *        For indexes that were created during a <i>CreateTable</i>
     *        operation, the <i>Backfilling</i> attribute does not appear in the
     *        <i>DescribeTable</i> output.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withBackfilling(Boolean backfilling) {
        setBackfilling(backfilling);
        return this;
    }

    /**
     * <p>
     * Indicates whether the index is currently backfilling. <i>Backfilling</i>
     * is the process of reading items from the table and determining whether
     * they can be added to the index. (Not all items will qualify: For example,
     * a hash key attribute cannot have any duplicates.) If an item can be added
     * to the index, DynamoDB will do so. After all items have been processed,
     * the backfilling operation is complete and <i>Backfilling</i> is false.
     * </p>
     * <note>
     * <p>
     * For indexes that were created during a <i>CreateTable</i> operation, the
     * <i>Backfilling</i> attribute does not appear in the <i>DescribeTable</i>
     * output.
     * </p>
     * </note>
     * 
     * @return Indicates whether the index is currently backfilling.
     *         <i>Backfilling</i> is the process of reading items from the table
     *         and determining whether they can be added to the index. (Not all
     *         items will qualify: For example, a hash key attribute cannot have
     *         any duplicates.) If an item can be added to the index, DynamoDB
     *         will do so. After all items have been processed, the backfilling
     *         operation is complete and <i>Backfilling</i> is false.</p> <note>
     *         <p>
     *         For indexes that were created during a <i>CreateTable</i>
     *         operation, the <i>Backfilling</i> attribute does not appear in
     *         the <i>DescribeTable</i> output.
     *         </p>
     */
    public Boolean isBackfilling() {
        return this.backfilling;
    }

    /**
     * Sets the value of the ProvisionedThroughput property for this object.
     * 
     * @param provisionedThroughput
     *        The new value for the ProvisionedThroughput property for this
     *        object.
     */
    public void setProvisionedThroughput(
            ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * Returns the value of the ProvisionedThroughput property for this object.
     * 
     * @return The value of the ProvisionedThroughput property for this object.
     */
    public ProvisionedThroughputDescription getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * Sets the value of the ProvisionedThroughput property for this object.
     * 
     * @param provisionedThroughput
     *        The new value for the ProvisionedThroughput property for this
     *        object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withProvisionedThroughput(
            ProvisionedThroughputDescription provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     * 
     * @param indexSizeBytes
     *        The total size of the specified index, in bytes. DynamoDB updates
     *        this value approximately every six hours. Recent changes might not
     *        be reflected in this value.
     */
    public void setIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     * 
     * @return The total size of the specified index, in bytes. DynamoDB updates
     *         this value approximately every six hours. Recent changes might
     *         not be reflected in this value.
     */
    public Long getIndexSizeBytes() {
        return this.indexSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     * 
     * @param indexSizeBytes
     *        The total size of the specified index, in bytes. DynamoDB updates
     *        this value approximately every six hours. Recent changes might not
     *        be reflected in this value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withIndexSizeBytes(
            Long indexSizeBytes) {
        setIndexSizeBytes(indexSizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the specified index. DynamoDB updates this
     *        value approximately every six hours. Recent changes might not be
     *        reflected in this value.
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     * 
     * @return The number of items in the specified index. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     */
    public Long getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the specified index. DynamoDB updates this
     *        value approximately every six hours. Recent changes might not be
     *        reflected in this value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withItemCount(Long itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the index.
     */
    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the
     *         index.
     */
    public String getIndexArn() {
        return this.indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the index.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexDescription withIndexArn(String indexArn) {
        setIndexArn(indexArn);
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getKeySchema() != null)
            sb.append("KeySchema: " + getKeySchema() + ",");
        if (getProjection() != null)
            sb.append("Projection: " + getProjection() + ",");
        if (getIndexStatus() != null)
            sb.append("IndexStatus: " + getIndexStatus() + ",");
        if (getBackfilling() != null)
            sb.append("Backfilling: " + getBackfilling() + ",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput()
                    + ",");
        if (getIndexSizeBytes() != null)
            sb.append("IndexSizeBytes: " + getIndexSizeBytes() + ",");
        if (getItemCount() != null)
            sb.append("ItemCount: " + getItemCount() + ",");
        if (getIndexArn() != null)
            sb.append("IndexArn: " + getIndexArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalSecondaryIndexDescription == false)
            return false;
        GlobalSecondaryIndexDescription other = (GlobalSecondaryIndexDescription) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null
                && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getProjection() == null ^ this.getProjection() == null)
            return false;
        if (other.getProjection() != null
                && other.getProjection().equals(this.getProjection()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null
                && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getBackfilling() == null ^ this.getBackfilling() == null)
            return false;
        if (other.getBackfilling() != null
                && other.getBackfilling().equals(this.getBackfilling()) == false)
            return false;
        if (other.getProvisionedThroughput() == null
                ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null
                && other.getProvisionedThroughput().equals(
                        this.getProvisionedThroughput()) == false)
            return false;
        if (other.getIndexSizeBytes() == null
                ^ this.getIndexSizeBytes() == null)
            return false;
        if (other.getIndexSizeBytes() != null
                && other.getIndexSizeBytes().equals(this.getIndexSizeBytes()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null
                && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null
                && other.getIndexArn().equals(this.getIndexArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode
                + ((getProjection() == null) ? 0 : getProjection().hashCode());
        hashCode = prime
                * hashCode
                + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackfilling() == null) ? 0 : getBackfilling().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughput() == null) ? 0
                        : getProvisionedThroughput().hashCode());
        hashCode = prime
                * hashCode
                + ((getIndexSizeBytes() == null) ? 0 : getIndexSizeBytes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode
                + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        return hashCode;
    }

    @Override
    public GlobalSecondaryIndexDescription clone() {
        try {
            return (GlobalSecondaryIndexDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}