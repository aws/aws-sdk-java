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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes a replication task created by the <code>CreateReplicationTask</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     * The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * The ARN that uniquely identifies the endpoint.
     * </p>
     */
    private String targetEndpointArn;
    /**
     * <p>
     * The ARN of the replication instance.
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
     * The status of the replication task. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"moving"</code> – The task is being moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code> – The task is being created in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     * <code>CreateReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code> – The task is being deleted in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code> – The task failed to successfully complete the database migration in response to running
     * the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed-move"</code> – The task failed to move in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code> – The task definition is being modified in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     * <code>ModifyReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task operations,
     * such as <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> or <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code> – The task is performing a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"starting"</code> – The task is preparing to perform a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopped"</code> – The task has stopped in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code> – The database migration specified for this task is being tested in response to running
     * either the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation.
     * </p>
     * <note>
     * <p>
     * <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment operation. The <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between the
     * source and target database of a given migration task. In contrast, <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     * assessments in addition to data type compatibility. These assessments include ones for the validity of primary
     * key definitions and likely issues with database migration performance, among others.
     * </p>
     * </note></li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The last error (failure) message generated for the replication task.
     * </p>
     */
    private String lastFailureMessage;
    /**
     * <p>
     * The reason the replication task was stopped. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load stopped
     * as specified before starting the CDC migration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     * </p>
     * </li>
     * </ul>
     */
    private String stopReason;
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
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want the CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     */
    private String cdcStartPosition;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     */
    private String cdcStopPosition;
    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this
     * value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that checkpoint.
     * </p>
     */
    private String recoveryCheckpoint;
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
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     */
    private String taskData;
    /**
     * <p>
     * The ARN of the replication instance to which this task is moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     * <code>ReplicationTask</code> object.
     * </p>
     */
    private String targetReplicationInstanceArn;

    /**
     * <p>
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     *        The user-assigned replication task identifier or name.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1-255 alphanumeric characters or hyphens.
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
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     * @return The user-assigned replication task identifier or name.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1-255 alphanumeric characters or hyphens.
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
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     *        The user-assigned replication task identifier or name.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1-255 alphanumeric characters or hyphens.
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
     * The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * The ARN that uniquely identifies the endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        The ARN that uniquely identifies the endpoint.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The ARN that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The ARN that uniquely identifies the endpoint.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * The ARN that uniquely identifies the endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        The ARN that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The ARN of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * 
     * @return The ARN of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The ARN of the replication instance.
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
        withMigrationType(migrationType);
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
        this.migrationType = migrationType.toString();
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
     * The status of the replication task. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"moving"</code> – The task is being moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code> – The task is being created in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     * <code>CreateReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code> – The task is being deleted in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code> – The task failed to successfully complete the database migration in response to running
     * the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed-move"</code> – The task failed to move in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code> – The task definition is being modified in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     * <code>ModifyReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task operations,
     * such as <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> or <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code> – The task is performing a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"starting"</code> – The task is preparing to perform a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopped"</code> – The task has stopped in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code> – The database migration specified for this task is being tested in response to running
     * either the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation.
     * </p>
     * <note>
     * <p>
     * <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment operation. The <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between the
     * source and target database of a given migration task. In contrast, <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     * assessments in addition to data type compatibility. These assessments include ones for the validity of primary
     * key definitions and likely issues with database migration performance, among others.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param status
     *        The status of the replication task. This response parameter can return one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"moving"</code> – The task is being moved in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *        <code>MoveReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"creating"</code> – The task is being created in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     *        <code>CreateReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"deleting"</code> – The task is being deleted in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     *        <code>DeleteReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed"</code> – The task failed to successfully complete the database migration in response to
     *        running the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed-move"</code> – The task failed to move in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *        <code>MoveReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"modifying"</code> – The task definition is being modified in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     *        <code>ModifyReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task
     *        operations, such as <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> or <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     *        <code>DeleteReplicationTask</code> </a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"running"</code> – The task is performing a database migration in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"starting"</code> – The task is preparing to perform a database migration in response to running the
     *        <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"stopped"</code> – The task has stopped in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     *        <code>StopReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     *        <code>StopReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"testing"</code> – The database migration specified for this task is being tested in response to
     *        running either the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *        <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     *        <code>StartReplicationTaskAssessment</code> </a> operation.
     *        </p>
     *        <note>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *        <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment operation.
     *        The <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     *        <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between
     *        the source and target database of a given migration task. In contrast, <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *        <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     *        assessments in addition to data type compatibility. These assessments include ones for the validity of
     *        primary key definitions and likely issues with database migration performance, among others.
     *        </p>
     *        </note></li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the replication task. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"moving"</code> – The task is being moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code> – The task is being created in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     * <code>CreateReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code> – The task is being deleted in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code> – The task failed to successfully complete the database migration in response to running
     * the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed-move"</code> – The task failed to move in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code> – The task definition is being modified in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     * <code>ModifyReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task operations,
     * such as <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> or <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code> – The task is performing a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"starting"</code> – The task is preparing to perform a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopped"</code> – The task has stopped in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code> – The database migration specified for this task is being tested in response to running
     * either the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation.
     * </p>
     * <note>
     * <p>
     * <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment operation. The <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between the
     * source and target database of a given migration task. In contrast, <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     * assessments in addition to data type compatibility. These assessments include ones for the validity of primary
     * key definitions and likely issues with database migration performance, among others.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The status of the replication task. This response parameter can return one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"moving"</code> – The task is being moved in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *         <code>MoveReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"creating"</code> – The task is being created in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     *         <code>CreateReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"deleting"</code> – The task is being deleted in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     *         <code>DeleteReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"failed"</code> – The task failed to successfully complete the database migration in response to
     *         running the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *         <code>StartReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"failed-move"</code> – The task failed to move in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *         <code>MoveReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"modifying"</code> – The task definition is being modified in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     *         <code>ModifyReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task
     *         operations, such as <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *         <code>StartReplicationTask</code> </a> or <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     *         <code>DeleteReplicationTask</code> </a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"running"</code> – The task is performing a database migration in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *         <code>StartReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"starting"</code> – The task is preparing to perform a database migration in response to running
     *         the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *         <code>StartReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"stopped"</code> – The task has stopped in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     *         <code>StopReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     *         <code>StopReplicationTask</code> </a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"testing"</code> – The database migration specified for this task is being tested in response to
     *         running either the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *         <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     *         <code>StartReplicationTaskAssessment</code> </a> operation.
     *         </p>
     *         <note>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *         <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment
     *         operation. The <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     *         <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between
     *         the source and target database of a given migration task. In contrast, <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *         <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     *         assessments in addition to data type compatibility. These assessments include ones for the validity of
     *         primary key definitions and likely issues with database migration performance, among others.
     *         </p>
     *         </note></li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the replication task. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"moving"</code> – The task is being moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code> – The task is being created in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     * <code>CreateReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code> – The task is being deleted in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code> – The task failed to successfully complete the database migration in response to running
     * the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed-move"</code> – The task failed to move in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code> – The task definition is being modified in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     * <code>ModifyReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task operations,
     * such as <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> or <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     * <code>DeleteReplicationTask</code> </a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code> – The task is performing a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"starting"</code> – The task is preparing to perform a database migration in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     * <code>StartReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopped"</code> – The task has stopped in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     * <code>StopReplicationTask</code> </a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code> – The database migration specified for this task is being tested in response to running
     * either the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation.
     * </p>
     * <note>
     * <p>
     * <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment operation. The <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     * <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between the
     * source and target database of a given migration task. In contrast, <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     * <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     * assessments in addition to data type compatibility. These assessments include ones for the validity of primary
     * key definitions and likely issues with database migration performance, among others.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param status
     *        The status of the replication task. This response parameter can return one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"moving"</code> – The task is being moved in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *        <code>MoveReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"creating"</code> – The task is being created in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html">
     *        <code>CreateReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"deleting"</code> – The task is being deleted in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     *        <code>DeleteReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed"</code> – The task failed to successfully complete the database migration in response to
     *        running the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed-move"</code> – The task failed to move in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *        <code>MoveReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"modifying"</code> – The task definition is being modified in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html">
     *        <code>ModifyReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ready"</code> – The task is in a <code>ready</code> state where it can respond to other task
     *        operations, such as <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> or <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_DeleteReplicationTask.html">
     *        <code>DeleteReplicationTask</code> </a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"running"</code> – The task is performing a database migration in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"starting"</code> – The task is preparing to perform a database migration in response to running the
     *        <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html">
     *        <code>StartReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"stopped"</code> – The task has stopped in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     *        <code>StopReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"stopping"</code> – The task is preparing to stop in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StopReplicationTask.html">
     *        <code>StopReplicationTask</code> </a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"testing"</code> – The database migration specified for this task is being tested in response to
     *        running either the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *        <code>StartReplicationTaskAssessmentRun</code> </a> or the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     *        <code>StartReplicationTaskAssessment</code> </a> operation.
     *        </p>
     *        <note>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *        <code>StartReplicationTaskAssessmentRun</code> </a> is an improved premigration task assessment operation.
     *        The <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessment.html">
     *        <code>StartReplicationTaskAssessment</code> </a> operation assesses data type compatibility only between
     *        the source and target database of a given migration task. In contrast, <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTaskAssessmentRun.html">
     *        <code>StartReplicationTaskAssessmentRun</code> </a> enables you to specify a variety of premigration task
     *        assessments in addition to data type compatibility. These assessments include ones for the validity of
     *        primary key definitions and likely issues with database migration performance, among others.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication task.
     * </p>
     * 
     * @param lastFailureMessage
     *        The last error (failure) message generated for the replication task.
     */

    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication task.
     * </p>
     * 
     * @return The last error (failure) message generated for the replication task.
     */

    public String getLastFailureMessage() {
        return this.lastFailureMessage;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication task.
     * </p>
     * 
     * @param lastFailureMessage
     *        The last error (failure) message generated for the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withLastFailureMessage(String lastFailureMessage) {
        setLastFailureMessage(lastFailureMessage);
        return this;
    }

    /**
     * <p>
     * The reason the replication task was stopped. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load stopped
     * as specified before starting the CDC migration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopReason
     *        The reason the replication task was stopped. This response parameter can return one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load
     *        stopped as specified before starting the CDC migration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     *        </p>
     *        </li>
     */

    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    /**
     * <p>
     * The reason the replication task was stopped. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load stopped
     * as specified before starting the CDC migration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason the replication task was stopped. This response parameter can return one of the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load
     *         stopped as specified before starting the CDC migration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     *         </p>
     *         </li>
     */

    public String getStopReason() {
        return this.stopReason;
    }

    /**
     * <p>
     * The reason the replication task was stopped. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load stopped
     * as specified before starting the CDC migration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopReason
     *        The reason the replication task was stopped. This response parameter can return one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_FULL_LOAD_COMPLETED"</code> – Full-load migration completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_CACHED_CHANGES_APPLIED"</code> – Change data capture (CDC) load completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_CACHED_CHANGES_NOT_APPLIED"</code> – In a full-load and CDC migration, the full load
     *        stopped as specified before starting the CDC migration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"STOP_REASON_SERVER_TIME"</code> – The migration stopped at the specified server time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withStopReason(String stopReason) {
        setStopReason(stopReason);
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
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want the CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either
     *        <code>CdcStartPosition</code> or <code>CdcStartTime</code> to specify when you want the CDC operation to
     *        start. Specifying both values results in an error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     *        </p>
     *        <p>
     *        Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *        </p>
     *        <p>
     *        Checkpoint Example: --cdc-start-position
     *        "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *        </p>
     *        <p>
     *        LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want the CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to start. Use either
     *         <code>CdcStartPosition</code> or <code>CdcStartTime</code> to specify when you want the CDC operation to
     *         start. Specifying both values results in an error.</p>
     *         <p>
     *         The value can be in date, checkpoint, or LSN/SCN format.
     *         </p>
     *         <p>
     *         Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *         </p>
     *         <p>
     *         Checkpoint Example: --cdc-start-position
     *         "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *         </p>
     *         <p>
     *         LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want the CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either
     *        <code>CdcStartPosition</code> or <code>CdcStartTime</code> to specify when you want the CDC operation to
     *        start. Specifying both values results in an error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     *        </p>
     *        <p>
     *        Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *        </p>
     *        <p>
     *        Checkpoint Example: --cdc-start-position
     *        "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *        </p>
     *        <p>
     *        LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withCdcStartPosition(String cdcStartPosition) {
        setCdcStartPosition(cdcStartPosition);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.</p>
     *        <p>
     *        Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     *        </p>
     *        <p>
     *        Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     */

    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to stop. The value can be either server
     *         time or commit time.</p>
     *         <p>
     *         Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     *         </p>
     *         <p>
     *         Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     */

    public String getCdcStopPosition() {
        return this.cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.</p>
     *        <p>
     *        Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12”
     *        </p>
     *        <p>
     *        Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withCdcStopPosition(String cdcStopPosition) {
        setCdcStopPosition(cdcStopPosition);
        return this;
    }

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this
     * value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that checkpoint.
     * </p>
     * 
     * @param recoveryCheckpoint
     *        Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide
     *        this value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that
     *        checkpoint.
     */

    public void setRecoveryCheckpoint(String recoveryCheckpoint) {
        this.recoveryCheckpoint = recoveryCheckpoint;
    }

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this
     * value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that checkpoint.
     * </p>
     * 
     * @return Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide
     *         this value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that
     *         checkpoint.
     */

    public String getRecoveryCheckpoint() {
        return this.recoveryCheckpoint;
    }

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this
     * value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that checkpoint.
     * </p>
     * 
     * @param recoveryCheckpoint
     *        Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide
     *        this value to the <code>CdcStartPosition</code> parameter to start a CDC operation that begins at that
     *        checkpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withRecoveryCheckpoint(String recoveryCheckpoint) {
        setRecoveryCheckpoint(recoveryCheckpoint);
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
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param taskData
     *        Supplemental information that the task requires to migrate the data for certain source and target
     *        endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental
     *        Data for Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     */

    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return Supplemental information that the task requires to migrate the data for certain source and target
     *         endpoints. For more information, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental
     *         Data for Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     */

    public String getTaskData() {
        return this.taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental Data for
     * Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param taskData
     *        Supplemental information that the task requires to migrate the data for certain source and target
     *        endpoints. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html">Specifying Supplemental
     *        Data for Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withTaskData(String taskData) {
        setTaskData(taskData);
        return this;
    }

    /**
     * <p>
     * The ARN of the replication instance to which this task is moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     * <code>ReplicationTask</code> object.
     * </p>
     * 
     * @param targetReplicationInstanceArn
     *        The ARN of the replication instance to which this task is moved in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *        <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     *        <code>ReplicationTask</code> object.
     */

    public void setTargetReplicationInstanceArn(String targetReplicationInstanceArn) {
        this.targetReplicationInstanceArn = targetReplicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance to which this task is moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     * <code>ReplicationTask</code> object.
     * </p>
     * 
     * @return The ARN of the replication instance to which this task is moved in response to running the <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *         <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     *         <code>ReplicationTask</code> object.
     */

    public String getTargetReplicationInstanceArn() {
        return this.targetReplicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance to which this task is moved in response to running the <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     * <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     * <code>ReplicationTask</code> object.
     * </p>
     * 
     * @param targetReplicationInstanceArn
     *        The ARN of the replication instance to which this task is moved in response to running the <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_MoveReplicationTask.html">
     *        <code>MoveReplicationTask</code> </a> operation. Otherwise, this response parameter isn't a member of the
     *        <code>ReplicationTask</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTask withTargetReplicationInstanceArn(String targetReplicationInstanceArn) {
        setTargetReplicationInstanceArn(targetReplicationInstanceArn);
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
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: ").append(getReplicationTaskIdentifier()).append(",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: ").append(getSourceEndpointArn()).append(",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: ").append(getTargetEndpointArn()).append(",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getMigrationType() != null)
            sb.append("MigrationType: ").append(getMigrationType()).append(",");
        if (getTableMappings() != null)
            sb.append("TableMappings: ").append(getTableMappings()).append(",");
        if (getReplicationTaskSettings() != null)
            sb.append("ReplicationTaskSettings: ").append(getReplicationTaskSettings()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: ").append(getLastFailureMessage()).append(",");
        if (getStopReason() != null)
            sb.append("StopReason: ").append(getStopReason()).append(",");
        if (getReplicationTaskCreationDate() != null)
            sb.append("ReplicationTaskCreationDate: ").append(getReplicationTaskCreationDate()).append(",");
        if (getReplicationTaskStartDate() != null)
            sb.append("ReplicationTaskStartDate: ").append(getReplicationTaskStartDate()).append(",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: ").append(getCdcStartPosition()).append(",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: ").append(getCdcStopPosition()).append(",");
        if (getRecoveryCheckpoint() != null)
            sb.append("RecoveryCheckpoint: ").append(getRecoveryCheckpoint()).append(",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getReplicationTaskStats() != null)
            sb.append("ReplicationTaskStats: ").append(getReplicationTaskStats()).append(",");
        if (getTaskData() != null)
            sb.append("TaskData: ").append(getTaskData()).append(",");
        if (getTargetReplicationInstanceArn() != null)
            sb.append("TargetReplicationInstanceArn: ").append(getTargetReplicationInstanceArn());
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
        if (other.getStopReason() == null ^ this.getStopReason() == null)
            return false;
        if (other.getStopReason() != null && other.getStopReason().equals(this.getStopReason()) == false)
            return false;
        if (other.getReplicationTaskCreationDate() == null ^ this.getReplicationTaskCreationDate() == null)
            return false;
        if (other.getReplicationTaskCreationDate() != null && other.getReplicationTaskCreationDate().equals(this.getReplicationTaskCreationDate()) == false)
            return false;
        if (other.getReplicationTaskStartDate() == null ^ this.getReplicationTaskStartDate() == null)
            return false;
        if (other.getReplicationTaskStartDate() != null && other.getReplicationTaskStartDate().equals(this.getReplicationTaskStartDate()) == false)
            return false;
        if (other.getCdcStartPosition() == null ^ this.getCdcStartPosition() == null)
            return false;
        if (other.getCdcStartPosition() != null && other.getCdcStartPosition().equals(this.getCdcStartPosition()) == false)
            return false;
        if (other.getCdcStopPosition() == null ^ this.getCdcStopPosition() == null)
            return false;
        if (other.getCdcStopPosition() != null && other.getCdcStopPosition().equals(this.getCdcStopPosition()) == false)
            return false;
        if (other.getRecoveryCheckpoint() == null ^ this.getRecoveryCheckpoint() == null)
            return false;
        if (other.getRecoveryCheckpoint() != null && other.getRecoveryCheckpoint().equals(this.getRecoveryCheckpoint()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskStats() == null ^ this.getReplicationTaskStats() == null)
            return false;
        if (other.getReplicationTaskStats() != null && other.getReplicationTaskStats().equals(this.getReplicationTaskStats()) == false)
            return false;
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        if (other.getTargetReplicationInstanceArn() == null ^ this.getTargetReplicationInstanceArn() == null)
            return false;
        if (other.getTargetReplicationInstanceArn() != null && other.getTargetReplicationInstanceArn().equals(this.getTargetReplicationInstanceArn()) == false)
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
        hashCode = prime * hashCode + ((getStopReason() == null) ? 0 : getStopReason().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskCreationDate() == null) ? 0 : getReplicationTaskCreationDate().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskStartDate() == null) ? 0 : getReplicationTaskStartDate().hashCode());
        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode + ((getRecoveryCheckpoint() == null) ? 0 : getRecoveryCheckpoint().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskStats() == null) ? 0 : getReplicationTaskStats().hashCode());
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        hashCode = prime * hashCode + ((getTargetReplicationInstanceArn() == null) ? 0 : getTargetReplicationInstanceArn().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
