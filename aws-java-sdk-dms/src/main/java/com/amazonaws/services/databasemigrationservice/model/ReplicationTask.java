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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class ReplicationTask implements Serializable, Cloneable {

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String replicationTaskIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String targetEndpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The type of migration.
     * </p>
     */
    private String migrationType;
    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * The settings for the replication task.
     * </p>
     */
    private String replicationTaskSettings;
    /**
     * <p>
     * The status of the replication task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     */
    private String lastFailureMessage;
    /**
     * <p>
     * The date the replication task was created.
     * </p>
     */
    private java.util.Date replicationTaskCreationDate;
    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     */
    private java.util.Date replicationTaskStartDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and table errors.
     * </p>
     */
    private ReplicationTaskStats replicationTaskStats;

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationTaskIdentifier
     *        The replication task identifier.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The replication task identifier.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getReplicationTaskIdentifier() {
        return this.replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationTaskIdentifier
     *        The replication task identifier.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        setReplicationTaskIdentifier(replicationTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * 
     * @param migrationType
     *        The type of migration.
     * @see MigrationTypeValue
     */

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * 
     * @return The type of migration.
     * @see MigrationTypeValue
     */

    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * 
     * @param migrationType
     *        The type of migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ReplicationTask withMigrationType(String migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * 
     * @param migrationType
     *        The type of migration.
     * @see MigrationTypeValue
     */

    public void setMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * 
     * @param migrationType
     *        The type of migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ReplicationTask withMigrationType(MigrationTypeValue migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     * 
     * @param tableMappings
     *        Table mappings specified in the task.
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     * 
     * @return Table mappings specified in the task.
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     * 
     * @param tableMappings
     *        Table mappings specified in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     * 
     * @param replicationTaskSettings
     *        The settings for the replication task.
     */

    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     * 
     * @return The settings for the replication task.
     */

    public String getReplicationTaskSettings() {
        return this.replicationTaskSettings;
    }

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     * 
     * @param replicationTaskSettings
     *        The settings for the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationTaskSettings(String replicationTaskSettings) {
        setReplicationTaskSettings(replicationTaskSettings);
        return this;
    }

    /**
     * <p>
     * The status of the replication task.
     * </p>
     * 
     * @param status
     *        The status of the replication task.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the replication task.
     * </p>
     * 
     * @return The status of the replication task.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the replication task.
     * </p>
     * 
     * @param status
     *        The status of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     * 
     * @param lastFailureMessage
     *        The last error (failure) message generated for the replication instance.
     */

    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     * 
     * @return The last error (failure) message generated for the replication instance.
     */

    public String getLastFailureMessage() {
        return this.lastFailureMessage;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     * 
     * @param lastFailureMessage
     *        The last error (failure) message generated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withLastFailureMessage(String lastFailureMessage) {
        setLastFailureMessage(lastFailureMessage);
        return this;
    }

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     * 
     * @param replicationTaskCreationDate
     *        The date the replication task was created.
     */

    public void setReplicationTaskCreationDate(java.util.Date replicationTaskCreationDate) {
        this.replicationTaskCreationDate = replicationTaskCreationDate;
    }

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     * 
     * @return The date the replication task was created.
     */

    public java.util.Date getReplicationTaskCreationDate() {
        return this.replicationTaskCreationDate;
    }

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     * 
     * @param replicationTaskCreationDate
     *        The date the replication task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationTaskCreationDate(java.util.Date replicationTaskCreationDate) {
        setReplicationTaskCreationDate(replicationTaskCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     * 
     * @param replicationTaskStartDate
     *        The date the replication task is scheduled to start.
     */

    public void setReplicationTaskStartDate(java.util.Date replicationTaskStartDate) {
        this.replicationTaskStartDate = replicationTaskStartDate;
    }

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     * 
     * @return The date the replication task is scheduled to start.
     */

    public java.util.Date getReplicationTaskStartDate() {
        return this.replicationTaskStartDate;
    }

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     * 
     * @param replicationTaskStartDate
     *        The date the replication task is scheduled to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationTaskStartDate(java.util.Date replicationTaskStartDate) {
        setReplicationTaskStartDate(replicationTaskStartDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication task.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and table errors.
     * </p>
     * 
     * @param replicationTaskStats
     *        The statistics for the task, including elapsed time, tables loaded, and table errors.
     */

    public void setReplicationTaskStats(ReplicationTaskStats replicationTaskStats) {
        this.replicationTaskStats = replicationTaskStats;
    }

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and table errors.
     * </p>
     * 
     * @return The statistics for the task, including elapsed time, tables loaded, and table errors.
     */

    public ReplicationTaskStats getReplicationTaskStats() {
        return this.replicationTaskStats;
    }

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and table errors.
     * </p>
     * 
     * @param replicationTaskStats
     *        The statistics for the task, including elapsed time, tables loaded, and table errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withReplicationTaskStats(ReplicationTaskStats replicationTaskStats) {
        setReplicationTaskStats(replicationTaskStats);
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
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: " + getReplicationTaskIdentifier() + ",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: " + getSourceEndpointArn() + ",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: " + getTargetEndpointArn() + ",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getMigrationType() != null)
            sb.append("MigrationType: " + getMigrationType() + ",");
        if (getTableMappings() != null)
            sb.append("TableMappings: " + getTableMappings() + ",");
        if (getReplicationTaskSettings() != null)
            sb.append("ReplicationTaskSettings: " + getReplicationTaskSettings() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: " + getLastFailureMessage() + ",");
        if (getReplicationTaskCreationDate() != null)
            sb.append("ReplicationTaskCreationDate: " + getReplicationTaskCreationDate() + ",");
        if (getReplicationTaskStartDate() != null)
            sb.append("ReplicationTaskStartDate: " + getReplicationTaskStartDate() + ",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getReplicationTaskStats() != null)
            sb.append("ReplicationTaskStats: " + getReplicationTaskStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTask == false)
            return false;
        ReplicationTask other = (ReplicationTask) obj;
        if (other.getReplicationTaskIdentifier() == null ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
            return false;
        if (other.getSourceEndpointArn() == null ^ this.getSourceEndpointArn() == null)
            return false;
        if (other.getSourceEndpointArn() != null && other.getSourceEndpointArn().equals(this.getSourceEndpointArn()) == false)
            return false;
        if (other.getTargetEndpointArn() == null ^ this.getTargetEndpointArn() == null)
            return false;
        if (other.getTargetEndpointArn() != null && other.getTargetEndpointArn().equals(this.getTargetEndpointArn()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getMigrationType() == null ^ this.getMigrationType() == null)
            return false;
        if (other.getMigrationType() != null && other.getMigrationType().equals(this.getMigrationType()) == false)
            return false;
        if (other.getTableMappings() == null ^ this.getTableMappings() == null)
            return false;
        if (other.getTableMappings() != null && other.getTableMappings().equals(this.getTableMappings()) == false)
            return false;
        if (other.getReplicationTaskSettings() == null ^ this.getReplicationTaskSettings() == null)
            return false;
        if (other.getReplicationTaskSettings() != null && other.getReplicationTaskSettings().equals(this.getReplicationTaskSettings()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        if (other.getReplicationTaskCreationDate() == null ^ this.getReplicationTaskCreationDate() == null)
            return false;
        if (other.getReplicationTaskCreationDate() != null && other.getReplicationTaskCreationDate().equals(this.getReplicationTaskCreationDate()) == false)
            return false;
        if (other.getReplicationTaskStartDate() == null ^ this.getReplicationTaskStartDate() == null)
            return false;
        if (other.getReplicationTaskStartDate() != null && other.getReplicationTaskStartDate().equals(this.getReplicationTaskStartDate()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskStats() == null ^ this.getReplicationTaskStats() == null)
            return false;
        if (other.getReplicationTaskStats() != null && other.getReplicationTaskStats().equals(this.getReplicationTaskStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceEndpointArn() == null) ? 0 : getSourceEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getTargetEndpointArn() == null) ? 0 : getTargetEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getMigrationType() == null) ? 0 : getMigrationType().hashCode());
        hashCode = prime * hashCode + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskSettings() == null) ? 0 : getReplicationTaskSettings().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskCreationDate() == null) ? 0 : getReplicationTaskCreationDate().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskStartDate() == null) ? 0 : getReplicationTaskStartDate().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskStats() == null) ? 0 : getReplicationTaskStats().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationTask clone() {
        try {
            return (ReplicationTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
