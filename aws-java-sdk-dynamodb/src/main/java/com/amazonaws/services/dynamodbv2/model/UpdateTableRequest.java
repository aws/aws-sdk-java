/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an <code>UpdateTable</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.
     * </p>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;
    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
     * pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned
     * capacity values are estimated based on the consumed read and write capacity of your table and global secondary
     * indexes over the past 30 minutes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     */
    private String billingMode;
    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;
    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each index in the array, you can request one
     * action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
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
     * You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already
     * has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     */
    private StreamSpecification streamSpecification;
    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     */
    private SSESpecification sSESpecification;

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
     *        The new provisioned throughput settings for the specified table or index.
     */
    public UpdateTableRequest(String tableName, ProvisionedThroughput provisionedThroughput) {
        setTableName(tableName);
        setProvisionedThroughput(provisionedThroughput);
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.
     * </p>
     * 
     * @return An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *         global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of
     *         the new index.
     */

    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
     * secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *        global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of
     *        the new index.
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
     * secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeDefinitions(java.util.Collection)} or {@link #withAttributeDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *        global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of
     *        the new index.
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
     * secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes. If you are adding a new
     *        global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of
     *        the new index.
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
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
     * pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned
     * capacity values are estimated based on the consumed read and write capacity of your table and global secondary
     * indexes over the past 30 minutes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @param billingMode
     *        Controls how you are charged for read and write throughput and how you manage capacity. When switching
     *        from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial
     *        provisioned capacity values are estimated based on the consumed read and write capacity of your table and
     *        global secondary indexes over the past 30 minutes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     *        <code>PROVISIONED</code> for predictable workloads.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *        <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *        </p>
     *        </li>
     * @see BillingMode
     */

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
     * pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned
     * capacity values are estimated based on the consumed read and write capacity of your table and global secondary
     * indexes over the past 30 minutes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Controls how you are charged for read and write throughput and how you manage capacity. When switching
     *         from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The
     *         initial provisioned capacity values are estimated based on the consumed read and write capacity of your
     *         table and global secondary indexes over the past 30 minutes.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     *         <code>PROVISIONED</code> for predictable workloads.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *         <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *         </p>
     *         </li>
     * @see BillingMode
     */

    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
     * pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned
     * capacity values are estimated based on the consumed read and write capacity of your table and global secondary
     * indexes over the past 30 minutes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @param billingMode
     *        Controls how you are charged for read and write throughput and how you manage capacity. When switching
     *        from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial
     *        provisioned capacity values are estimated based on the consumed read and write capacity of your table and
     *        global secondary indexes over the past 30 minutes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     *        <code>PROVISIONED</code> for predictable workloads.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *        <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateTableRequest withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
     * pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned
     * capacity values are estimated based on the consumed read and write capacity of your table and global secondary
     * indexes over the past 30 minutes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @param billingMode
     *        Controls how you are charged for read and write throughput and how you manage capacity. When switching
     *        from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial
     *        provisioned capacity values are estimated based on the consumed read and write capacity of your table and
     *        global secondary indexes over the past 30 minutes.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONED</code> - Sets the billing mode to <code>PROVISIONED</code>. We recommend using
     *        <code>PROVISIONED</code> for predictable workloads.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAY_PER_REQUEST</code> - Sets the billing mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *        <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateTableRequest withBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
        return this;
    }

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     * 
     * @param provisionedThroughput
     *        The new provisioned throughput settings for the specified table or index.
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     * 
     * @return The new provisioned throughput settings for the specified table or index.
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     * 
     * @param provisionedThroughput
     *        The new provisioned throughput settings for the specified table or index.
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
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return An array of one or more global secondary indexes for the table. For each index in the array, you can
     *         request one action:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Create</code> - add a new global secondary index to the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Delete</code> - remove a global secondary index from the table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing
     *         Global Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
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
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        An array of one or more global secondary indexes for the table. For each index in the array, you can
     *        request one action:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Create</code> - add a new global secondary index to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delete</code> - remove a global secondary index from the table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
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
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
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
     *        <code>Create</code> - add a new global secondary index to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delete</code> - remove a global secondary index from the table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
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
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
     * Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        An array of one or more global secondary indexes for the table. For each index in the array, you can
     *        request one action:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Create</code> - add a new global secondary index to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delete</code> - remove a global secondary index from the table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global
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
     * You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already
     * has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * 
     * @param streamSpecification
     *        Represents the DynamoDB Streams configuration for the table.</p> <note>
     *        <p>
     *        You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that
     *        already has a stream, or if you attempt to disable a stream on a table which does not have a stream.
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
     * You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already
     * has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * 
     * @return Represents the DynamoDB Streams configuration for the table.</p> <note>
     *         <p>
     *         You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that
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
     * You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already
     * has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * 
     * @param streamSpecification
     *        Represents the DynamoDB Streams configuration for the table.</p> <note>
     *        <p>
     *        You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that
     *        already has a stream, or if you attempt to disable a stream on a table which does not have a stream.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withStreamSpecification(StreamSpecification streamSpecification) {
        setStreamSpecification(streamSpecification);
        return this;
    }

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     * 
     * @param sSESpecification
     *        The new server-side encryption settings for the specified table.
     */

    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     * 
     * @return The new server-side encryption settings for the specified table.
     */

    public SSESpecification getSSESpecification() {
        return this.sSESpecification;
    }

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     * 
     * @param sSESpecification
     *        The new server-side encryption settings for the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withSSESpecification(SSESpecification sSESpecification) {
        setSSESpecification(sSESpecification);
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
        if (getAttributeDefinitions() != null)
            sb.append("AttributeDefinitions: ").append(getAttributeDefinitions()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getBillingMode() != null)
            sb.append("BillingMode: ").append(getBillingMode()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput()).append(",");
        if (getGlobalSecondaryIndexUpdates() != null)
            sb.append("GlobalSecondaryIndexUpdates: ").append(getGlobalSecondaryIndexUpdates()).append(",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: ").append(getStreamSpecification()).append(",");
        if (getSSESpecification() != null)
            sb.append("SSESpecification: ").append(getSSESpecification());
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
        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null && other.getBillingMode().equals(this.getBillingMode()) == false)
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
        if (other.getSSESpecification() == null ^ this.getSSESpecification() == null)
            return false;
        if (other.getSSESpecification() != null && other.getSSESpecification().equals(this.getSSESpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexUpdates() == null) ? 0 : getGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime * hashCode + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        hashCode = prime * hashCode + ((getSSESpecification() == null) ? 0 : getSSESpecification().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableRequest clone() {
        return (UpdateTableRequest) super.clone();
    }

}
