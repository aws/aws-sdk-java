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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a DynamoDB table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of attribute definitions for the table.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableAttributeDefinition> attributeDefinitions;
    /**
     * <p>
     * Information about the billing for read/write capacity on the table.
     * </p>
     */
    private AwsDynamoDbTableBillingModeSummary billingModeSummary;
    /**
     * <p>
     * Indicates when the table was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * List of global secondary indexes for the table.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableGlobalSecondaryIndex> globalSecondaryIndexes;
    /**
     * <p>
     * The version of global tables being used.
     * </p>
     */
    private String globalTableVersion;
    /**
     * <p>
     * The number of items in the table.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * The primary key structure for the table.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableKeySchema> keySchema;
    /**
     * <p>
     * The ARN of the latest stream for the table.
     * </p>
     */
    private String latestStreamArn;
    /**
     * <p>
     * The label of the latest stream. The label is not a unique identifier.
     * </p>
     */
    private String latestStreamLabel;
    /**
     * <p>
     * The list of local secondary indexes for the table.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableLocalSecondaryIndex> localSecondaryIndexes;
    /**
     * <p>
     * Information about the provisioned throughput for the table.
     * </p>
     */
    private AwsDynamoDbTableProvisionedThroughput provisionedThroughput;
    /**
     * <p>
     * The list of replicas of this table.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableReplica> replicas;
    /**
     * <p>
     * Information about the restore for the table.
     * </p>
     */
    private AwsDynamoDbTableRestoreSummary restoreSummary;
    /**
     * <p>
     * Information about the server-side encryption for the table.
     * </p>
     */
    private AwsDynamoDbTableSseDescription sseDescription;
    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     */
    private AwsDynamoDbTableStreamSpecification streamSpecification;
    /**
     * <p>
     * The identifier of the table.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The total size of the table in bytes.
     * </p>
     */
    private Long tableSizeBytes;
    /**
     * <p>
     * The current status of the table.
     * </p>
     */
    private String tableStatus;

    /**
     * <p>
     * A list of attribute definitions for the table.
     * </p>
     * 
     * @return A list of attribute definitions for the table.
     */

    public java.util.List<AwsDynamoDbTableAttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * A list of attribute definitions for the table.
     * </p>
     * 
     * @param attributeDefinitions
     *        A list of attribute definitions for the table.
     */

    public void setAttributeDefinitions(java.util.Collection<AwsDynamoDbTableAttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }

        this.attributeDefinitions = new java.util.ArrayList<AwsDynamoDbTableAttributeDefinition>(attributeDefinitions);
    }

    /**
     * <p>
     * A list of attribute definitions for the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeDefinitions(java.util.Collection)} or {@link #withAttributeDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param attributeDefinitions
     *        A list of attribute definitions for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withAttributeDefinitions(AwsDynamoDbTableAttributeDefinition... attributeDefinitions) {
        if (this.attributeDefinitions == null) {
            setAttributeDefinitions(new java.util.ArrayList<AwsDynamoDbTableAttributeDefinition>(attributeDefinitions.length));
        }
        for (AwsDynamoDbTableAttributeDefinition ele : attributeDefinitions) {
            this.attributeDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute definitions for the table.
     * </p>
     * 
     * @param attributeDefinitions
     *        A list of attribute definitions for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withAttributeDefinitions(java.util.Collection<AwsDynamoDbTableAttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * Information about the billing for read/write capacity on the table.
     * </p>
     * 
     * @param billingModeSummary
     *        Information about the billing for read/write capacity on the table.
     */

    public void setBillingModeSummary(AwsDynamoDbTableBillingModeSummary billingModeSummary) {
        this.billingModeSummary = billingModeSummary;
    }

    /**
     * <p>
     * Information about the billing for read/write capacity on the table.
     * </p>
     * 
     * @return Information about the billing for read/write capacity on the table.
     */

    public AwsDynamoDbTableBillingModeSummary getBillingModeSummary() {
        return this.billingModeSummary;
    }

    /**
     * <p>
     * Information about the billing for read/write capacity on the table.
     * </p>
     * 
     * @param billingModeSummary
     *        Information about the billing for read/write capacity on the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withBillingModeSummary(AwsDynamoDbTableBillingModeSummary billingModeSummary) {
        setBillingModeSummary(billingModeSummary);
        return this;
    }

    /**
     * <p>
     * Indicates when the table was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param creationDateTime
     *        Indicates when the table was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * Indicates when the table was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the table was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * Indicates when the table was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param creationDateTime
     *        Indicates when the table was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the table.
     * </p>
     * 
     * @return List of global secondary indexes for the table.
     */

    public java.util.List<AwsDynamoDbTableGlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * List of global secondary indexes for the table.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        List of global secondary indexes for the table.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<AwsDynamoDbTableGlobalSecondaryIndex> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<AwsDynamoDbTableGlobalSecondaryIndex>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * List of global secondary indexes for the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        List of global secondary indexes for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withGlobalSecondaryIndexes(AwsDynamoDbTableGlobalSecondaryIndex... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<AwsDynamoDbTableGlobalSecondaryIndex>(globalSecondaryIndexes.length));
        }
        for (AwsDynamoDbTableGlobalSecondaryIndex ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the table.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        List of global secondary indexes for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withGlobalSecondaryIndexes(java.util.Collection<AwsDynamoDbTableGlobalSecondaryIndex> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * The version of global tables being used.
     * </p>
     * 
     * @param globalTableVersion
     *        The version of global tables being used.
     */

    public void setGlobalTableVersion(String globalTableVersion) {
        this.globalTableVersion = globalTableVersion;
    }

    /**
     * <p>
     * The version of global tables being used.
     * </p>
     * 
     * @return The version of global tables being used.
     */

    public String getGlobalTableVersion() {
        return this.globalTableVersion;
    }

    /**
     * <p>
     * The version of global tables being used.
     * </p>
     * 
     * @param globalTableVersion
     *        The version of global tables being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withGlobalTableVersion(String globalTableVersion) {
        setGlobalTableVersion(globalTableVersion);
        return this;
    }

    /**
     * <p>
     * The number of items in the table.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the table.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the table.
     * </p>
     * 
     * @return The number of items in the table.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items in the table.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The primary key structure for the table.
     * </p>
     * 
     * @return The primary key structure for the table.
     */

    public java.util.List<AwsDynamoDbTableKeySchema> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The primary key structure for the table.
     * </p>
     * 
     * @param keySchema
     *        The primary key structure for the table.
     */

    public void setKeySchema(java.util.Collection<AwsDynamoDbTableKeySchema> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<AwsDynamoDbTableKeySchema>(keySchema);
    }

    /**
     * <p>
     * The primary key structure for the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The primary key structure for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withKeySchema(AwsDynamoDbTableKeySchema... keySchema) {
        if (this.keySchema == null) {
            setKeySchema(new java.util.ArrayList<AwsDynamoDbTableKeySchema>(keySchema.length));
        }
        for (AwsDynamoDbTableKeySchema ele : keySchema) {
            this.keySchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The primary key structure for the table.
     * </p>
     * 
     * @param keySchema
     *        The primary key structure for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withKeySchema(java.util.Collection<AwsDynamoDbTableKeySchema> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * The ARN of the latest stream for the table.
     * </p>
     * 
     * @param latestStreamArn
     *        The ARN of the latest stream for the table.
     */

    public void setLatestStreamArn(String latestStreamArn) {
        this.latestStreamArn = latestStreamArn;
    }

    /**
     * <p>
     * The ARN of the latest stream for the table.
     * </p>
     * 
     * @return The ARN of the latest stream for the table.
     */

    public String getLatestStreamArn() {
        return this.latestStreamArn;
    }

    /**
     * <p>
     * The ARN of the latest stream for the table.
     * </p>
     * 
     * @param latestStreamArn
     *        The ARN of the latest stream for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withLatestStreamArn(String latestStreamArn) {
        setLatestStreamArn(latestStreamArn);
        return this;
    }

    /**
     * <p>
     * The label of the latest stream. The label is not a unique identifier.
     * </p>
     * 
     * @param latestStreamLabel
     *        The label of the latest stream. The label is not a unique identifier.
     */

    public void setLatestStreamLabel(String latestStreamLabel) {
        this.latestStreamLabel = latestStreamLabel;
    }

    /**
     * <p>
     * The label of the latest stream. The label is not a unique identifier.
     * </p>
     * 
     * @return The label of the latest stream. The label is not a unique identifier.
     */

    public String getLatestStreamLabel() {
        return this.latestStreamLabel;
    }

    /**
     * <p>
     * The label of the latest stream. The label is not a unique identifier.
     * </p>
     * 
     * @param latestStreamLabel
     *        The label of the latest stream. The label is not a unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withLatestStreamLabel(String latestStreamLabel) {
        setLatestStreamLabel(latestStreamLabel);
        return this;
    }

    /**
     * <p>
     * The list of local secondary indexes for the table.
     * </p>
     * 
     * @return The list of local secondary indexes for the table.
     */

    public java.util.List<AwsDynamoDbTableLocalSecondaryIndex> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * The list of local secondary indexes for the table.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        The list of local secondary indexes for the table.
     */

    public void setLocalSecondaryIndexes(java.util.Collection<AwsDynamoDbTableLocalSecondaryIndex> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        this.localSecondaryIndexes = new java.util.ArrayList<AwsDynamoDbTableLocalSecondaryIndex>(localSecondaryIndexes);
    }

    /**
     * <p>
     * The list of local secondary indexes for the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalSecondaryIndexes(java.util.Collection)} or
     * {@link #withLocalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        The list of local secondary indexes for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withLocalSecondaryIndexes(AwsDynamoDbTableLocalSecondaryIndex... localSecondaryIndexes) {
        if (this.localSecondaryIndexes == null) {
            setLocalSecondaryIndexes(new java.util.ArrayList<AwsDynamoDbTableLocalSecondaryIndex>(localSecondaryIndexes.length));
        }
        for (AwsDynamoDbTableLocalSecondaryIndex ele : localSecondaryIndexes) {
            this.localSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of local secondary indexes for the table.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        The list of local secondary indexes for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withLocalSecondaryIndexes(java.util.Collection<AwsDynamoDbTableLocalSecondaryIndex> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * Information about the provisioned throughput for the table.
     * </p>
     * 
     * @param provisionedThroughput
     *        Information about the provisioned throughput for the table.
     */

    public void setProvisionedThroughput(AwsDynamoDbTableProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Information about the provisioned throughput for the table.
     * </p>
     * 
     * @return Information about the provisioned throughput for the table.
     */

    public AwsDynamoDbTableProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * Information about the provisioned throughput for the table.
     * </p>
     * 
     * @param provisionedThroughput
     *        Information about the provisioned throughput for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withProvisionedThroughput(AwsDynamoDbTableProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * The list of replicas of this table.
     * </p>
     * 
     * @return The list of replicas of this table.
     */

    public java.util.List<AwsDynamoDbTableReplica> getReplicas() {
        return replicas;
    }

    /**
     * <p>
     * The list of replicas of this table.
     * </p>
     * 
     * @param replicas
     *        The list of replicas of this table.
     */

    public void setReplicas(java.util.Collection<AwsDynamoDbTableReplica> replicas) {
        if (replicas == null) {
            this.replicas = null;
            return;
        }

        this.replicas = new java.util.ArrayList<AwsDynamoDbTableReplica>(replicas);
    }

    /**
     * <p>
     * The list of replicas of this table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicas(java.util.Collection)} or {@link #withReplicas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param replicas
     *        The list of replicas of this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withReplicas(AwsDynamoDbTableReplica... replicas) {
        if (this.replicas == null) {
            setReplicas(new java.util.ArrayList<AwsDynamoDbTableReplica>(replicas.length));
        }
        for (AwsDynamoDbTableReplica ele : replicas) {
            this.replicas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of replicas of this table.
     * </p>
     * 
     * @param replicas
     *        The list of replicas of this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withReplicas(java.util.Collection<AwsDynamoDbTableReplica> replicas) {
        setReplicas(replicas);
        return this;
    }

    /**
     * <p>
     * Information about the restore for the table.
     * </p>
     * 
     * @param restoreSummary
     *        Information about the restore for the table.
     */

    public void setRestoreSummary(AwsDynamoDbTableRestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
    }

    /**
     * <p>
     * Information about the restore for the table.
     * </p>
     * 
     * @return Information about the restore for the table.
     */

    public AwsDynamoDbTableRestoreSummary getRestoreSummary() {
        return this.restoreSummary;
    }

    /**
     * <p>
     * Information about the restore for the table.
     * </p>
     * 
     * @param restoreSummary
     *        Information about the restore for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withRestoreSummary(AwsDynamoDbTableRestoreSummary restoreSummary) {
        setRestoreSummary(restoreSummary);
        return this;
    }

    /**
     * <p>
     * Information about the server-side encryption for the table.
     * </p>
     * 
     * @param sseDescription
     *        Information about the server-side encryption for the table.
     */

    public void setSseDescription(AwsDynamoDbTableSseDescription sseDescription) {
        this.sseDescription = sseDescription;
    }

    /**
     * <p>
     * Information about the server-side encryption for the table.
     * </p>
     * 
     * @return Information about the server-side encryption for the table.
     */

    public AwsDynamoDbTableSseDescription getSseDescription() {
        return this.sseDescription;
    }

    /**
     * <p>
     * Information about the server-side encryption for the table.
     * </p>
     * 
     * @param sseDescription
     *        Information about the server-side encryption for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withSseDescription(AwsDynamoDbTableSseDescription sseDescription) {
        setSseDescription(sseDescription);
        return this;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * 
     * @param streamSpecification
     *        The current DynamoDB Streams configuration for the table.
     */

    public void setStreamSpecification(AwsDynamoDbTableStreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * 
     * @return The current DynamoDB Streams configuration for the table.
     */

    public AwsDynamoDbTableStreamSpecification getStreamSpecification() {
        return this.streamSpecification;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * 
     * @param streamSpecification
     *        The current DynamoDB Streams configuration for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withStreamSpecification(AwsDynamoDbTableStreamSpecification streamSpecification) {
        setStreamSpecification(streamSpecification);
        return this;
    }

    /**
     * <p>
     * The identifier of the table.
     * </p>
     * 
     * @param tableId
     *        The identifier of the table.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The identifier of the table.
     * </p>
     * 
     * @return The identifier of the table.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The identifier of the table.
     * </p>
     * 
     * @param tableId
     *        The identifier of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The total size of the table in bytes.
     * </p>
     * 
     * @param tableSizeBytes
     *        The total size of the table in bytes.
     */

    public void setTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
    }

    /**
     * <p>
     * The total size of the table in bytes.
     * </p>
     * 
     * @return The total size of the table in bytes.
     */

    public Long getTableSizeBytes() {
        return this.tableSizeBytes;
    }

    /**
     * <p>
     * The total size of the table in bytes.
     * </p>
     * 
     * @param tableSizeBytes
     *        The total size of the table in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withTableSizeBytes(Long tableSizeBytes) {
        setTableSizeBytes(tableSizeBytes);
        return this;
    }

    /**
     * <p>
     * The current status of the table.
     * </p>
     * 
     * @param tableStatus
     *        The current status of the table.
     */

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    /**
     * <p>
     * The current status of the table.
     * </p>
     * 
     * @return The current status of the table.
     */

    public String getTableStatus() {
        return this.tableStatus;
    }

    /**
     * <p>
     * The current status of the table.
     * </p>
     * 
     * @param tableStatus
     *        The current status of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableDetails withTableStatus(String tableStatus) {
        setTableStatus(tableStatus);
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
        if (getBillingModeSummary() != null)
            sb.append("BillingModeSummary: ").append(getBillingModeSummary()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes()).append(",");
        if (getGlobalTableVersion() != null)
            sb.append("GlobalTableVersion: ").append(getGlobalTableVersion()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getLatestStreamArn() != null)
            sb.append("LatestStreamArn: ").append(getLatestStreamArn()).append(",");
        if (getLatestStreamLabel() != null)
            sb.append("LatestStreamLabel: ").append(getLatestStreamLabel()).append(",");
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: ").append(getLocalSecondaryIndexes()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput()).append(",");
        if (getReplicas() != null)
            sb.append("Replicas: ").append(getReplicas()).append(",");
        if (getRestoreSummary() != null)
            sb.append("RestoreSummary: ").append(getRestoreSummary()).append(",");
        if (getSseDescription() != null)
            sb.append("SseDescription: ").append(getSseDescription()).append(",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: ").append(getStreamSpecification()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableSizeBytes() != null)
            sb.append("TableSizeBytes: ").append(getTableSizeBytes()).append(",");
        if (getTableStatus() != null)
            sb.append("TableStatus: ").append(getTableStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableDetails == false)
            return false;
        AwsDynamoDbTableDetails other = (AwsDynamoDbTableDetails) obj;
        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null)
            return false;
        if (other.getAttributeDefinitions() != null && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false)
            return false;
        if (other.getBillingModeSummary() == null ^ this.getBillingModeSummary() == null)
            return false;
        if (other.getBillingModeSummary() != null && other.getBillingModeSummary().equals(this.getBillingModeSummary()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalTableVersion() == null ^ this.getGlobalTableVersion() == null)
            return false;
        if (other.getGlobalTableVersion() != null && other.getGlobalTableVersion().equals(this.getGlobalTableVersion()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getLatestStreamArn() == null ^ this.getLatestStreamArn() == null)
            return false;
        if (other.getLatestStreamArn() != null && other.getLatestStreamArn().equals(this.getLatestStreamArn()) == false)
            return false;
        if (other.getLatestStreamLabel() == null ^ this.getLatestStreamLabel() == null)
            return false;
        if (other.getLatestStreamLabel() != null && other.getLatestStreamLabel().equals(this.getLatestStreamLabel()) == false)
            return false;
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getReplicas() == null ^ this.getReplicas() == null)
            return false;
        if (other.getReplicas() != null && other.getReplicas().equals(this.getReplicas()) == false)
            return false;
        if (other.getRestoreSummary() == null ^ this.getRestoreSummary() == null)
            return false;
        if (other.getRestoreSummary() != null && other.getRestoreSummary().equals(this.getRestoreSummary()) == false)
            return false;
        if (other.getSseDescription() == null ^ this.getSseDescription() == null)
            return false;
        if (other.getSseDescription() != null && other.getSseDescription().equals(this.getSseDescription()) == false)
            return false;
        if (other.getStreamSpecification() == null ^ this.getStreamSpecification() == null)
            return false;
        if (other.getStreamSpecification() != null && other.getStreamSpecification().equals(this.getStreamSpecification()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableSizeBytes() == null ^ this.getTableSizeBytes() == null)
            return false;
        if (other.getTableSizeBytes() != null && other.getTableSizeBytes().equals(this.getTableSizeBytes()) == false)
            return false;
        if (other.getTableStatus() == null ^ this.getTableStatus() == null)
            return false;
        if (other.getTableStatus() != null && other.getTableStatus().equals(this.getTableStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode());
        hashCode = prime * hashCode + ((getBillingModeSummary() == null) ? 0 : getBillingModeSummary().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getGlobalTableVersion() == null) ? 0 : getGlobalTableVersion().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getLatestStreamArn() == null) ? 0 : getLatestStreamArn().hashCode());
        hashCode = prime * hashCode + ((getLatestStreamLabel() == null) ? 0 : getLatestStreamLabel().hashCode());
        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getReplicas() == null) ? 0 : getReplicas().hashCode());
        hashCode = prime * hashCode + ((getRestoreSummary() == null) ? 0 : getRestoreSummary().hashCode());
        hashCode = prime * hashCode + ((getSseDescription() == null) ? 0 : getSseDescription().hashCode());
        hashCode = prime * hashCode + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableSizeBytes() == null) ? 0 : getTableSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableDetails clone() {
        try {
            return (AwsDynamoDbTableDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
