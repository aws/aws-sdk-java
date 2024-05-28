/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace that the specified table is stored in.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * The name of the specified table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified table.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The creation timestamp of the specified table.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The current status of the specified table.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The schema definition of the specified table.
     * </p>
     */
    private SchemaDefinition schemaDefinition;
    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>
     * </p>
     * </li>
     * </ul>
     */
    private CapacitySpecificationSummary capacitySpecification;
    /**
     * <p>
     * The encryption settings of the specified table.
     * </p>
     */
    private EncryptionSpecification encryptionSpecification;
    /**
     * <p>
     * The point-in-time recovery status of the specified table.
     * </p>
     */
    private PointInTimeRecoverySummary pointInTimeRecovery;
    /**
     * <p>
     * The custom Time to Live settings of the specified table.
     * </p>
     */
    private TimeToLive ttl;
    /**
     * <p>
     * The default Time to Live settings in seconds of the specified table.
     * </p>
     */
    private Integer defaultTimeToLive;
    /**
     * <p>
     * The the description of the specified table.
     * </p>
     */
    private Comment comment;
    /**
     * <p>
     * The client-side timestamps setting of the table.
     * </p>
     */
    private ClientSideTimestamps clientSideTimestamps;
    /**
     * <p>
     * Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated in.
     * </p>
     */
    private java.util.List<ReplicaSpecificationSummary> replicaSpecifications;

    /**
     * <p>
     * The name of the keyspace that the specified table is stored in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the specified table is stored in.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the specified table is stored in.
     * </p>
     * 
     * @return The name of the keyspace that the specified table is stored in.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the specified table is stored in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the specified table is stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
        return this;
    }

    /**
     * <p>
     * The name of the specified table.
     * </p>
     * 
     * @param tableName
     *        The name of the specified table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the specified table.
     * </p>
     * 
     * @return The name of the specified table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the specified table.
     * </p>
     * 
     * @param tableName
     *        The name of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the specified table.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified table.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The creation timestamp of the specified table.
     * </p>
     * 
     * @param creationTimestamp
     *        The creation timestamp of the specified table.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The creation timestamp of the specified table.
     * </p>
     * 
     * @return The creation timestamp of the specified table.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The creation timestamp of the specified table.
     * </p>
     * 
     * @param creationTimestamp
     *        The creation timestamp of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The current status of the specified table.
     * </p>
     * 
     * @param status
     *        The current status of the specified table.
     * @see TableStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the specified table.
     * </p>
     * 
     * @return The current status of the specified table.
     * @see TableStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the specified table.
     * </p>
     * 
     * @param status
     *        The current status of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public GetTableResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the specified table.
     * </p>
     * 
     * @param status
     *        The current status of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public GetTableResult withStatus(TableStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The schema definition of the specified table.
     * </p>
     * 
     * @param schemaDefinition
     *        The schema definition of the specified table.
     */

    public void setSchemaDefinition(SchemaDefinition schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * The schema definition of the specified table.
     * </p>
     * 
     * @return The schema definition of the specified table.
     */

    public SchemaDefinition getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * The schema definition of the specified table.
     * </p>
     * 
     * @param schemaDefinition
     *        The schema definition of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withSchemaDefinition(SchemaDefinition schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
        return this;
    }

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacitySpecification
     *        The read/write throughput capacity mode for a table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>throughputMode:PAY_PER_REQUEST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>throughputMode:PROVISIONED</code>
     *        </p>
     *        </li>
     */

    public void setCapacitySpecification(CapacitySpecificationSummary capacitySpecification) {
        this.capacitySpecification = capacitySpecification;
    }

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The read/write throughput capacity mode for a table. The options are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>throughputMode:PAY_PER_REQUEST</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>throughputMode:PROVISIONED</code>
     *         </p>
     *         </li>
     */

    public CapacitySpecificationSummary getCapacitySpecification() {
        return this.capacitySpecification;
    }

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacitySpecification
     *        The read/write throughput capacity mode for a table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>throughputMode:PAY_PER_REQUEST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>throughputMode:PROVISIONED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withCapacitySpecification(CapacitySpecificationSummary capacitySpecification) {
        setCapacitySpecification(capacitySpecification);
        return this;
    }

    /**
     * <p>
     * The encryption settings of the specified table.
     * </p>
     * 
     * @param encryptionSpecification
     *        The encryption settings of the specified table.
     */

    public void setEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        this.encryptionSpecification = encryptionSpecification;
    }

    /**
     * <p>
     * The encryption settings of the specified table.
     * </p>
     * 
     * @return The encryption settings of the specified table.
     */

    public EncryptionSpecification getEncryptionSpecification() {
        return this.encryptionSpecification;
    }

    /**
     * <p>
     * The encryption settings of the specified table.
     * </p>
     * 
     * @param encryptionSpecification
     *        The encryption settings of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        setEncryptionSpecification(encryptionSpecification);
        return this;
    }

    /**
     * <p>
     * The point-in-time recovery status of the specified table.
     * </p>
     * 
     * @param pointInTimeRecovery
     *        The point-in-time recovery status of the specified table.
     */

    public void setPointInTimeRecovery(PointInTimeRecoverySummary pointInTimeRecovery) {
        this.pointInTimeRecovery = pointInTimeRecovery;
    }

    /**
     * <p>
     * The point-in-time recovery status of the specified table.
     * </p>
     * 
     * @return The point-in-time recovery status of the specified table.
     */

    public PointInTimeRecoverySummary getPointInTimeRecovery() {
        return this.pointInTimeRecovery;
    }

    /**
     * <p>
     * The point-in-time recovery status of the specified table.
     * </p>
     * 
     * @param pointInTimeRecovery
     *        The point-in-time recovery status of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withPointInTimeRecovery(PointInTimeRecoverySummary pointInTimeRecovery) {
        setPointInTimeRecovery(pointInTimeRecovery);
        return this;
    }

    /**
     * <p>
     * The custom Time to Live settings of the specified table.
     * </p>
     * 
     * @param ttl
     *        The custom Time to Live settings of the specified table.
     */

    public void setTtl(TimeToLive ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The custom Time to Live settings of the specified table.
     * </p>
     * 
     * @return The custom Time to Live settings of the specified table.
     */

    public TimeToLive getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The custom Time to Live settings of the specified table.
     * </p>
     * 
     * @param ttl
     *        The custom Time to Live settings of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withTtl(TimeToLive ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * The default Time to Live settings in seconds of the specified table.
     * </p>
     * 
     * @param defaultTimeToLive
     *        The default Time to Live settings in seconds of the specified table.
     */

    public void setDefaultTimeToLive(Integer defaultTimeToLive) {
        this.defaultTimeToLive = defaultTimeToLive;
    }

    /**
     * <p>
     * The default Time to Live settings in seconds of the specified table.
     * </p>
     * 
     * @return The default Time to Live settings in seconds of the specified table.
     */

    public Integer getDefaultTimeToLive() {
        return this.defaultTimeToLive;
    }

    /**
     * <p>
     * The default Time to Live settings in seconds of the specified table.
     * </p>
     * 
     * @param defaultTimeToLive
     *        The default Time to Live settings in seconds of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withDefaultTimeToLive(Integer defaultTimeToLive) {
        setDefaultTimeToLive(defaultTimeToLive);
        return this;
    }

    /**
     * <p>
     * The the description of the specified table.
     * </p>
     * 
     * @param comment
     *        The the description of the specified table.
     */

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The the description of the specified table.
     * </p>
     * 
     * @return The the description of the specified table.
     */

    public Comment getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The the description of the specified table.
     * </p>
     * 
     * @param comment
     *        The the description of the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withComment(Comment comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The client-side timestamps setting of the table.
     * </p>
     * 
     * @param clientSideTimestamps
     *        The client-side timestamps setting of the table.
     */

    public void setClientSideTimestamps(ClientSideTimestamps clientSideTimestamps) {
        this.clientSideTimestamps = clientSideTimestamps;
    }

    /**
     * <p>
     * The client-side timestamps setting of the table.
     * </p>
     * 
     * @return The client-side timestamps setting of the table.
     */

    public ClientSideTimestamps getClientSideTimestamps() {
        return this.clientSideTimestamps;
    }

    /**
     * <p>
     * The client-side timestamps setting of the table.
     * </p>
     * 
     * @param clientSideTimestamps
     *        The client-side timestamps setting of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withClientSideTimestamps(ClientSideTimestamps clientSideTimestamps) {
        setClientSideTimestamps(clientSideTimestamps);
        return this;
    }

    /**
     * <p>
     * Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated in.
     * </p>
     * 
     * @return Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is
     *         replicated in.
     */

    public java.util.List<ReplicaSpecificationSummary> getReplicaSpecifications() {
        return replicaSpecifications;
    }

    /**
     * <p>
     * Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated in.
     * </p>
     * 
     * @param replicaSpecifications
     *        Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated
     *        in.
     */

    public void setReplicaSpecifications(java.util.Collection<ReplicaSpecificationSummary> replicaSpecifications) {
        if (replicaSpecifications == null) {
            this.replicaSpecifications = null;
            return;
        }

        this.replicaSpecifications = new java.util.ArrayList<ReplicaSpecificationSummary>(replicaSpecifications);
    }

    /**
     * <p>
     * Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaSpecifications(java.util.Collection)} or
     * {@link #withReplicaSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicaSpecifications
     *        Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated
     *        in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withReplicaSpecifications(ReplicaSpecificationSummary... replicaSpecifications) {
        if (this.replicaSpecifications == null) {
            setReplicaSpecifications(new java.util.ArrayList<ReplicaSpecificationSummary>(replicaSpecifications.length));
        }
        for (ReplicaSpecificationSummary ele : replicaSpecifications) {
            this.replicaSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated in.
     * </p>
     * 
     * @param replicaSpecifications
     *        Returns the Amazon Web Services Region specific settings of all Regions a multi-Region table is replicated
     *        in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableResult withReplicaSpecifications(java.util.Collection<ReplicaSpecificationSummary> replicaSpecifications) {
        setReplicaSpecifications(replicaSpecifications);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition()).append(",");
        if (getCapacitySpecification() != null)
            sb.append("CapacitySpecification: ").append(getCapacitySpecification()).append(",");
        if (getEncryptionSpecification() != null)
            sb.append("EncryptionSpecification: ").append(getEncryptionSpecification()).append(",");
        if (getPointInTimeRecovery() != null)
            sb.append("PointInTimeRecovery: ").append(getPointInTimeRecovery()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getDefaultTimeToLive() != null)
            sb.append("DefaultTimeToLive: ").append(getDefaultTimeToLive()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getClientSideTimestamps() != null)
            sb.append("ClientSideTimestamps: ").append(getClientSideTimestamps()).append(",");
        if (getReplicaSpecifications() != null)
            sb.append("ReplicaSpecifications: ").append(getReplicaSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableResult == false)
            return false;
        GetTableResult other = (GetTableResult) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        if (other.getCapacitySpecification() == null ^ this.getCapacitySpecification() == null)
            return false;
        if (other.getCapacitySpecification() != null && other.getCapacitySpecification().equals(this.getCapacitySpecification()) == false)
            return false;
        if (other.getEncryptionSpecification() == null ^ this.getEncryptionSpecification() == null)
            return false;
        if (other.getEncryptionSpecification() != null && other.getEncryptionSpecification().equals(this.getEncryptionSpecification()) == false)
            return false;
        if (other.getPointInTimeRecovery() == null ^ this.getPointInTimeRecovery() == null)
            return false;
        if (other.getPointInTimeRecovery() != null && other.getPointInTimeRecovery().equals(this.getPointInTimeRecovery()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getDefaultTimeToLive() == null ^ this.getDefaultTimeToLive() == null)
            return false;
        if (other.getDefaultTimeToLive() != null && other.getDefaultTimeToLive().equals(this.getDefaultTimeToLive()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getClientSideTimestamps() == null ^ this.getClientSideTimestamps() == null)
            return false;
        if (other.getClientSideTimestamps() != null && other.getClientSideTimestamps().equals(this.getClientSideTimestamps()) == false)
            return false;
        if (other.getReplicaSpecifications() == null ^ this.getReplicaSpecifications() == null)
            return false;
        if (other.getReplicaSpecifications() != null && other.getReplicaSpecifications().equals(this.getReplicaSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        hashCode = prime * hashCode + ((getCapacitySpecification() == null) ? 0 : getCapacitySpecification().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSpecification() == null) ? 0 : getEncryptionSpecification().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecovery() == null) ? 0 : getPointInTimeRecovery().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getDefaultTimeToLive() == null) ? 0 : getDefaultTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getClientSideTimestamps() == null) ? 0 : getClientSideTimestamps().hashCode());
        hashCode = prime * hashCode + ((getReplicaSpecifications() == null) ? 0 : getReplicaSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public GetTableResult clone() {
        try {
            return (GetTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
