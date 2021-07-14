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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for the replication task.
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
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     * </p>
     */
    private String targetEndpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     */
    private String migrationType;
    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html">Using Table
     * Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html">Specifying
     * Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     */
    private String replicationTaskSettings;
    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     */
    private java.util.Date cdcStartTime;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     * </p>
     * </note>
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
     * One or more tags to be assigned to the replication task.
     * </p>
     */
    private java.util.List<Tag> tags;
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
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * An identifier for the replication task.
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
     *        An identifier for the replication task.</p>
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
     * An identifier for the replication task.
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
     * @return An identifier for the replication task.</p>
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
     * An identifier for the replication task.
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
     *        An identifier for the replication task.</p>
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

    public CreateReplicationTaskRequest withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        setReplicationTaskIdentifier(replicationTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of a replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of a replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @see MigrationTypeValue
     */

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @return The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *         <code>full-load-and-cdc</code>
     * @see MigrationTypeValue
     */

    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public CreateReplicationTaskRequest withMigrationType(String migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @see MigrationTypeValue
     */

    public void setMigrationType(MigrationTypeValue migrationType) {
        withMigrationType(migrationType);
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> | <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * 
     * @param migrationType
     *        The migration type. Valid values: <code>full-load</code> | <code>cdc</code> |
     *        <code>full-load-and-cdc</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public CreateReplicationTaskRequest withMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
        return this;
    }

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html">Using Table
     * Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param tableMappings
     *        The table mappings for the task, in JSON format. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     *        >Using Table Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html">Using Table
     * Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return The table mappings for the task, in JSON format. For more information, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     *         >Using Table Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html">Using Table
     * Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param tableMappings
     *        The table mappings for the task, in JSON format. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     *        >Using Table Mapping to Specify Task Settings</a> in the <i>Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html">Specifying
     * Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param replicationTaskSettings
     *        Overall settings for the task, in JSON format. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     *        >Specifying Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service
     *        User Guide.</i>
     */

    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html">Specifying
     * Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return Overall settings for the task, in JSON format. For more information, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     *         >Specifying Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service
     *         User Guide.</i>
     */

    public String getReplicationTaskSettings() {
        return this.replicationTaskSettings;
    }

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html">Specifying
     * Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param replicationTaskSettings
     *        Overall settings for the task, in JSON format. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     *        >Specifying Task Settings for Database Migration Service Tasks</a> in the <i>Database Migration Service
     *        User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withReplicationTaskSettings(String replicationTaskSettings) {
        setReplicationTaskSettings(replicationTaskSettings);
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *        CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @return Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *         CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *         error.</p>
     *         <p>
     *         Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *        CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     * </p>
     * </note>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *        CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
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
     *        </p>
     *        <note>
     *        <p>
     *        When you use this task setting with a source PostgreSQL database, a logical replication slot should
     *        already be created and associated with the source endpoint. You can verify this by setting the
     *        <code>slotName</code> extra connection attribute to the name of this logical replication slot. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *        >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     *        </p>
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     * </p>
     * </note>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *         CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *         error.</p>
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
     *         </p>
     *         <note>
     *         <p>
     *         When you use this task setting with a source PostgreSQL database, a logical replication slot should
     *         already be created and associated with the source endpoint. You can verify this by setting the
     *         <code>slotName</code> extra connection attribute to the name of this logical replication slot. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *         >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     *         </p>
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a logical replication slot should already be
     * created and associated with the source endpoint. You can verify this by setting the <code>slotName</code> extra
     * connection attribute to the name of this logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     * </p>
     * </note>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *        CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
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
     *        </p>
     *        <note>
     *        <p>
     *        When you use this task setting with a source PostgreSQL database, a logical replication slot should
     *        already be created and associated with the source endpoint. You can verify this by setting the
     *        <code>slotName</code> extra connection attribute to the name of this logical replication slot. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *        >Extra Connection Attributes When Using PostgreSQL as a Source for DMS</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withCdcStartPosition(String cdcStartPosition) {
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

    public CreateReplicationTaskRequest withCdcStopPosition(String cdcStopPosition) {
        setCdcStopPosition(cdcStopPosition);
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     * 
     * @return One or more tags to be assigned to the replication task.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the replication task.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateReplicationTaskRequest withTaskData(String taskData) {
        setTaskData(taskData);
        return this;
    }

    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter
     *        that is returned in the created <code>Endpoint</code> object. The value for this parameter can have up to
     *        31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a
     *        hyphen or contain two consecutive hyphens, and can only begin with a letter, such as
     *        <code>Example-App-ARN1</code>. For example, this value might result in the <code>EndpointArn</code> value
     *        <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     *        <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     *        <code>EndpointArn</code>.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @return A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter
     *         that is returned in the created <code>Endpoint</code> object. The value for this parameter can have up to
     *         31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a
     *         hyphen or contain two consecutive hyphens, and can only begin with a letter, such as
     *         <code>Example-App-ARN1</code>. For example, this value might result in the <code>EndpointArn</code> value
     *         <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     *         <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     *         <code>EndpointArn</code>.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter that is
     * returned in the created <code>Endpoint</code> object. The value for this parameter can have up to 31 characters.
     * It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two
     * consecutive hyphens, and can only begin with a letter, such as <code>Example-App-ARN1</code>. For example, this
     * value might result in the <code>EndpointArn</code> value
     * <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     * <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A friendly name for the resource identifier at the end of the <code>EndpointArn</code> response parameter
     *        that is returned in the created <code>Endpoint</code> object. The value for this parameter can have up to
     *        31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a
     *        hyphen or contain two consecutive hyphens, and can only begin with a letter, such as
     *        <code>Example-App-ARN1</code>. For example, this value might result in the <code>EndpointArn</code> value
     *        <code>arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1</code>. If you don't specify a
     *        <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     *        <code>EndpointArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationTaskRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: ").append(getCdcStartTime()).append(",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: ").append(getCdcStartPosition()).append(",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: ").append(getCdcStopPosition()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTaskData() != null)
            sb.append("TaskData: ").append(getTaskData()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationTaskRequest == false)
            return false;
        CreateReplicationTaskRequest other = (CreateReplicationTaskRequest) obj;
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
        if (other.getCdcStartTime() == null ^ this.getCdcStartTime() == null)
            return false;
        if (other.getCdcStartTime() != null && other.getCdcStartTime().equals(this.getCdcStartTime()) == false)
            return false;
        if (other.getCdcStartPosition() == null ^ this.getCdcStartPosition() == null)
            return false;
        if (other.getCdcStartPosition() != null && other.getCdcStartPosition().equals(this.getCdcStartPosition()) == false)
            return false;
        if (other.getCdcStopPosition() == null ^ this.getCdcStopPosition() == null)
            return false;
        if (other.getCdcStopPosition() != null && other.getCdcStopPosition().equals(this.getCdcStopPosition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
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
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationTaskRequest clone() {
        return (CreateReplicationTaskRequest) super.clone();
    }

}
