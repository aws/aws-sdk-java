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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes a serverless replication created by the <code>CreateReplication</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Replication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Replication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     */
    private String replicationConfigIdentifier;
    /**
     * <p>
     * The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     */
    private String replicationConfigArn;
    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * source.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * target.
     * </p>
     */
    private String targetEndpointArn;
    /**
     * <p>
     * The type of the serverless replication.
     * </p>
     */
    private String replicationType;
    /**
     * <p>
     * The current status of the serverless replication.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about provisioning resources for an DMS serverless replication.
     * </p>
     */
    private ProvisionData provisionData;
    /**
     * <p>
     * The reason the replication task was stopped. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Stop Reason NORMAL"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECOVERABLE_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FATAL_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECYCLE_TASK"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String stopReason;
    /**
     * <p>
     * Error and other information about why a serverless replication failed.
     * </p>
     */
    private java.util.List<String> failureMessages;
    /**
     * <p>
     * This object provides a collection of statistics about a serverless replication.
     * </p>
     */
    private ReplicationStats replicationStats;
    /**
     * <p>
     * The replication type.
     * </p>
     */
    private String startReplicationType;
    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     */
    private java.util.Date cdcStartTime;
    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     */
    private String cdcStartPosition;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
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
     * The time the serverless replication was created.
     * </p>
     */
    private java.util.Date replicationCreateTime;
    /**
     * <p>
     * The time the serverless replication was updated.
     * </p>
     */
    private java.util.Date replicationUpdateTime;
    /**
     * <p>
     * The timestamp when replication was last stopped.
     * </p>
     */
    private java.util.Date replicationLastStopTime;
    /**
     * <p>
     * The timestamp when DMS will deprovision the replication.
     * </p>
     */
    private java.util.Date replicationDeprovisionTime;

    /**
     * <p>
     * The identifier for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     * 
     * @param replicationConfigIdentifier
     *        The identifier for the <code>ReplicationConfig</code> associated with the replication.
     */

    public void setReplicationConfigIdentifier(String replicationConfigIdentifier) {
        this.replicationConfigIdentifier = replicationConfigIdentifier;
    }

    /**
     * <p>
     * The identifier for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     * 
     * @return The identifier for the <code>ReplicationConfig</code> associated with the replication.
     */

    public String getReplicationConfigIdentifier() {
        return this.replicationConfigIdentifier;
    }

    /**
     * <p>
     * The identifier for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     * 
     * @param replicationConfigIdentifier
     *        The identifier for the <code>ReplicationConfig</code> associated with the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationConfigIdentifier(String replicationConfigIdentifier) {
        setReplicationConfigIdentifier(replicationConfigIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     */

    public void setReplicationConfigArn(String replicationConfigArn) {
        this.replicationConfigArn = replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     * 
     * @return The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     */

    public String getReplicationConfigArn() {
        return this.replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name for the <code>ReplicationConfig</code> associated with the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationConfigArn(String replicationConfigArn) {
        setReplicationConfigArn(replicationConfigArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * source.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its
     *        data source.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * source.
     * </p>
     * 
     * @return The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its
     *         data source.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * source.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its
     *        data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * target.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its
     *        data target.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * target.
     * </p>
     * 
     * @return The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its
     *         data target.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its data
     * target.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name for an existing <code>Endpoint</code> the serverless replication uses for its
     *        data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
        return this;
    }

    /**
     * <p>
     * The type of the serverless replication.
     * </p>
     * 
     * @param replicationType
     *        The type of the serverless replication.
     * @see MigrationTypeValue
     */

    public void setReplicationType(String replicationType) {
        this.replicationType = replicationType;
    }

    /**
     * <p>
     * The type of the serverless replication.
     * </p>
     * 
     * @return The type of the serverless replication.
     * @see MigrationTypeValue
     */

    public String getReplicationType() {
        return this.replicationType;
    }

    /**
     * <p>
     * The type of the serverless replication.
     * </p>
     * 
     * @param replicationType
     *        The type of the serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public Replication withReplicationType(String replicationType) {
        setReplicationType(replicationType);
        return this;
    }

    /**
     * <p>
     * The type of the serverless replication.
     * </p>
     * 
     * @param replicationType
     *        The type of the serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public Replication withReplicationType(MigrationTypeValue replicationType) {
        this.replicationType = replicationType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the serverless replication.
     * </p>
     * 
     * @param status
     *        The current status of the serverless replication.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the serverless replication.
     * </p>
     * 
     * @return The current status of the serverless replication.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the serverless replication.
     * </p>
     * 
     * @param status
     *        The current status of the serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Information about provisioning resources for an DMS serverless replication.
     * </p>
     * 
     * @param provisionData
     *        Information about provisioning resources for an DMS serverless replication.
     */

    public void setProvisionData(ProvisionData provisionData) {
        this.provisionData = provisionData;
    }

    /**
     * <p>
     * Information about provisioning resources for an DMS serverless replication.
     * </p>
     * 
     * @return Information about provisioning resources for an DMS serverless replication.
     */

    public ProvisionData getProvisionData() {
        return this.provisionData;
    }

    /**
     * <p>
     * Information about provisioning resources for an DMS serverless replication.
     * </p>
     * 
     * @param provisionData
     *        Information about provisioning resources for an DMS serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withProvisionData(ProvisionData provisionData) {
        setProvisionData(provisionData);
        return this;
    }

    /**
     * <p>
     * The reason the replication task was stopped. This response parameter can return one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Stop Reason NORMAL"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECOVERABLE_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FATAL_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECYCLE_TASK"</code>
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
     *        <code>"Stop Reason NORMAL"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason RECOVERABLE_ERROR"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason FATAL_ERROR"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason RECYCLE_TASK"</code>
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
     * <code>"Stop Reason NORMAL"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECOVERABLE_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FATAL_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECYCLE_TASK"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason the replication task was stopped. This response parameter can return one of the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"Stop Reason NORMAL"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason RECOVERABLE_ERROR"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason FATAL_ERROR"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Stop Reason RECYCLE_TASK"</code>
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
     * <code>"Stop Reason NORMAL"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECOVERABLE_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FATAL_ERROR"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Stop Reason RECYCLE_TASK"</code>
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
     *        <code>"Stop Reason NORMAL"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason RECOVERABLE_ERROR"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason FATAL_ERROR"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason FULL_LOAD_ONLY_FINISHED"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AFTER_FULL_LOAD"</code> – Full load completed, with cached changes not applied
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AFTER_CACHED_EVENTS"</code> – Full load completed, with cached changes applied
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason EXPRESS_LICENSE_LIMITS_REACHED"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AFTER_DDL_APPLY"</code> – User-defined stop task after DDL applied
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_DUE_TO_LOW_MEMORY"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_DUE_TO_LOW_DISK"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AT_SERVER_TIME"</code> – User-defined server time for stopping task
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason STOPPED_AT_COMMIT_TIME"</code> – User-defined commit time for stopping task
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason RECONFIGURATION_RESTART"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Stop Reason RECYCLE_TASK"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withStopReason(String stopReason) {
        setStopReason(stopReason);
        return this;
    }

    /**
     * <p>
     * Error and other information about why a serverless replication failed.
     * </p>
     * 
     * @return Error and other information about why a serverless replication failed.
     */

    public java.util.List<String> getFailureMessages() {
        return failureMessages;
    }

    /**
     * <p>
     * Error and other information about why a serverless replication failed.
     * </p>
     * 
     * @param failureMessages
     *        Error and other information about why a serverless replication failed.
     */

    public void setFailureMessages(java.util.Collection<String> failureMessages) {
        if (failureMessages == null) {
            this.failureMessages = null;
            return;
        }

        this.failureMessages = new java.util.ArrayList<String>(failureMessages);
    }

    /**
     * <p>
     * Error and other information about why a serverless replication failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureMessages(java.util.Collection)} or {@link #withFailureMessages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failureMessages
     *        Error and other information about why a serverless replication failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withFailureMessages(String... failureMessages) {
        if (this.failureMessages == null) {
            setFailureMessages(new java.util.ArrayList<String>(failureMessages.length));
        }
        for (String ele : failureMessages) {
            this.failureMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error and other information about why a serverless replication failed.
     * </p>
     * 
     * @param failureMessages
     *        Error and other information about why a serverless replication failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withFailureMessages(java.util.Collection<String> failureMessages) {
        setFailureMessages(failureMessages);
        return this;
    }

    /**
     * <p>
     * This object provides a collection of statistics about a serverless replication.
     * </p>
     * 
     * @param replicationStats
     *        This object provides a collection of statistics about a serverless replication.
     */

    public void setReplicationStats(ReplicationStats replicationStats) {
        this.replicationStats = replicationStats;
    }

    /**
     * <p>
     * This object provides a collection of statistics about a serverless replication.
     * </p>
     * 
     * @return This object provides a collection of statistics about a serverless replication.
     */

    public ReplicationStats getReplicationStats() {
        return this.replicationStats;
    }

    /**
     * <p>
     * This object provides a collection of statistics about a serverless replication.
     * </p>
     * 
     * @param replicationStats
     *        This object provides a collection of statistics about a serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationStats(ReplicationStats replicationStats) {
        setReplicationStats(replicationStats);
        return this;
    }

    /**
     * <p>
     * The replication type.
     * </p>
     * 
     * @param startReplicationType
     *        The replication type.
     */

    public void setStartReplicationType(String startReplicationType) {
        this.startReplicationType = startReplicationType;
    }

    /**
     * <p>
     * The replication type.
     * </p>
     * 
     * @return The replication type.
     */

    public String getStartReplicationType() {
        return this.startReplicationType;
    }

    /**
     * <p>
     * The replication type.
     * </p>
     * 
     * @param startReplicationType
     *        The replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withStartReplicationType(String startReplicationType) {
        setStartReplicationType(startReplicationType);
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *        or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values
     *        results in an error.
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @return Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *         or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both
     *         values results in an error.
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *        or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values
     *        results in an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *        or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values
     *        results in an error.
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @return Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *         or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both
     *         values results in an error.
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *        or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values
     *        results in an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withCdcStartPosition(String cdcStartPosition) {
        setCdcStartPosition(cdcStartPosition);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.
     */

    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to stop. The value can be either server
     *         time or commit time.
     */

    public String getCdcStopPosition() {
        return this.cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withCdcStopPosition(String cdcStopPosition) {
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

    public Replication withRecoveryCheckpoint(String recoveryCheckpoint) {
        setRecoveryCheckpoint(recoveryCheckpoint);
        return this;
    }

    /**
     * <p>
     * The time the serverless replication was created.
     * </p>
     * 
     * @param replicationCreateTime
     *        The time the serverless replication was created.
     */

    public void setReplicationCreateTime(java.util.Date replicationCreateTime) {
        this.replicationCreateTime = replicationCreateTime;
    }

    /**
     * <p>
     * The time the serverless replication was created.
     * </p>
     * 
     * @return The time the serverless replication was created.
     */

    public java.util.Date getReplicationCreateTime() {
        return this.replicationCreateTime;
    }

    /**
     * <p>
     * The time the serverless replication was created.
     * </p>
     * 
     * @param replicationCreateTime
     *        The time the serverless replication was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationCreateTime(java.util.Date replicationCreateTime) {
        setReplicationCreateTime(replicationCreateTime);
        return this;
    }

    /**
     * <p>
     * The time the serverless replication was updated.
     * </p>
     * 
     * @param replicationUpdateTime
     *        The time the serverless replication was updated.
     */

    public void setReplicationUpdateTime(java.util.Date replicationUpdateTime) {
        this.replicationUpdateTime = replicationUpdateTime;
    }

    /**
     * <p>
     * The time the serverless replication was updated.
     * </p>
     * 
     * @return The time the serverless replication was updated.
     */

    public java.util.Date getReplicationUpdateTime() {
        return this.replicationUpdateTime;
    }

    /**
     * <p>
     * The time the serverless replication was updated.
     * </p>
     * 
     * @param replicationUpdateTime
     *        The time the serverless replication was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationUpdateTime(java.util.Date replicationUpdateTime) {
        setReplicationUpdateTime(replicationUpdateTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when replication was last stopped.
     * </p>
     * 
     * @param replicationLastStopTime
     *        The timestamp when replication was last stopped.
     */

    public void setReplicationLastStopTime(java.util.Date replicationLastStopTime) {
        this.replicationLastStopTime = replicationLastStopTime;
    }

    /**
     * <p>
     * The timestamp when replication was last stopped.
     * </p>
     * 
     * @return The timestamp when replication was last stopped.
     */

    public java.util.Date getReplicationLastStopTime() {
        return this.replicationLastStopTime;
    }

    /**
     * <p>
     * The timestamp when replication was last stopped.
     * </p>
     * 
     * @param replicationLastStopTime
     *        The timestamp when replication was last stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationLastStopTime(java.util.Date replicationLastStopTime) {
        setReplicationLastStopTime(replicationLastStopTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when DMS will deprovision the replication.
     * </p>
     * 
     * @param replicationDeprovisionTime
     *        The timestamp when DMS will deprovision the replication.
     */

    public void setReplicationDeprovisionTime(java.util.Date replicationDeprovisionTime) {
        this.replicationDeprovisionTime = replicationDeprovisionTime;
    }

    /**
     * <p>
     * The timestamp when DMS will deprovision the replication.
     * </p>
     * 
     * @return The timestamp when DMS will deprovision the replication.
     */

    public java.util.Date getReplicationDeprovisionTime() {
        return this.replicationDeprovisionTime;
    }

    /**
     * <p>
     * The timestamp when DMS will deprovision the replication.
     * </p>
     * 
     * @param replicationDeprovisionTime
     *        The timestamp when DMS will deprovision the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replication withReplicationDeprovisionTime(java.util.Date replicationDeprovisionTime) {
        setReplicationDeprovisionTime(replicationDeprovisionTime);
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
        if (getReplicationConfigIdentifier() != null)
            sb.append("ReplicationConfigIdentifier: ").append(getReplicationConfigIdentifier()).append(",");
        if (getReplicationConfigArn() != null)
            sb.append("ReplicationConfigArn: ").append(getReplicationConfigArn()).append(",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: ").append(getSourceEndpointArn()).append(",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: ").append(getTargetEndpointArn()).append(",");
        if (getReplicationType() != null)
            sb.append("ReplicationType: ").append(getReplicationType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProvisionData() != null)
            sb.append("ProvisionData: ").append(getProvisionData()).append(",");
        if (getStopReason() != null)
            sb.append("StopReason: ").append(getStopReason()).append(",");
        if (getFailureMessages() != null)
            sb.append("FailureMessages: ").append(getFailureMessages()).append(",");
        if (getReplicationStats() != null)
            sb.append("ReplicationStats: ").append(getReplicationStats()).append(",");
        if (getStartReplicationType() != null)
            sb.append("StartReplicationType: ").append(getStartReplicationType()).append(",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: ").append(getCdcStartTime()).append(",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: ").append(getCdcStartPosition()).append(",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: ").append(getCdcStopPosition()).append(",");
        if (getRecoveryCheckpoint() != null)
            sb.append("RecoveryCheckpoint: ").append(getRecoveryCheckpoint()).append(",");
        if (getReplicationCreateTime() != null)
            sb.append("ReplicationCreateTime: ").append(getReplicationCreateTime()).append(",");
        if (getReplicationUpdateTime() != null)
            sb.append("ReplicationUpdateTime: ").append(getReplicationUpdateTime()).append(",");
        if (getReplicationLastStopTime() != null)
            sb.append("ReplicationLastStopTime: ").append(getReplicationLastStopTime()).append(",");
        if (getReplicationDeprovisionTime() != null)
            sb.append("ReplicationDeprovisionTime: ").append(getReplicationDeprovisionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Replication == false)
            return false;
        Replication other = (Replication) obj;
        if (other.getReplicationConfigIdentifier() == null ^ this.getReplicationConfigIdentifier() == null)
            return false;
        if (other.getReplicationConfigIdentifier() != null && other.getReplicationConfigIdentifier().equals(this.getReplicationConfigIdentifier()) == false)
            return false;
        if (other.getReplicationConfigArn() == null ^ this.getReplicationConfigArn() == null)
            return false;
        if (other.getReplicationConfigArn() != null && other.getReplicationConfigArn().equals(this.getReplicationConfigArn()) == false)
            return false;
        if (other.getSourceEndpointArn() == null ^ this.getSourceEndpointArn() == null)
            return false;
        if (other.getSourceEndpointArn() != null && other.getSourceEndpointArn().equals(this.getSourceEndpointArn()) == false)
            return false;
        if (other.getTargetEndpointArn() == null ^ this.getTargetEndpointArn() == null)
            return false;
        if (other.getTargetEndpointArn() != null && other.getTargetEndpointArn().equals(this.getTargetEndpointArn()) == false)
            return false;
        if (other.getReplicationType() == null ^ this.getReplicationType() == null)
            return false;
        if (other.getReplicationType() != null && other.getReplicationType().equals(this.getReplicationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProvisionData() == null ^ this.getProvisionData() == null)
            return false;
        if (other.getProvisionData() != null && other.getProvisionData().equals(this.getProvisionData()) == false)
            return false;
        if (other.getStopReason() == null ^ this.getStopReason() == null)
            return false;
        if (other.getStopReason() != null && other.getStopReason().equals(this.getStopReason()) == false)
            return false;
        if (other.getFailureMessages() == null ^ this.getFailureMessages() == null)
            return false;
        if (other.getFailureMessages() != null && other.getFailureMessages().equals(this.getFailureMessages()) == false)
            return false;
        if (other.getReplicationStats() == null ^ this.getReplicationStats() == null)
            return false;
        if (other.getReplicationStats() != null && other.getReplicationStats().equals(this.getReplicationStats()) == false)
            return false;
        if (other.getStartReplicationType() == null ^ this.getStartReplicationType() == null)
            return false;
        if (other.getStartReplicationType() != null && other.getStartReplicationType().equals(this.getStartReplicationType()) == false)
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
        if (other.getRecoveryCheckpoint() == null ^ this.getRecoveryCheckpoint() == null)
            return false;
        if (other.getRecoveryCheckpoint() != null && other.getRecoveryCheckpoint().equals(this.getRecoveryCheckpoint()) == false)
            return false;
        if (other.getReplicationCreateTime() == null ^ this.getReplicationCreateTime() == null)
            return false;
        if (other.getReplicationCreateTime() != null && other.getReplicationCreateTime().equals(this.getReplicationCreateTime()) == false)
            return false;
        if (other.getReplicationUpdateTime() == null ^ this.getReplicationUpdateTime() == null)
            return false;
        if (other.getReplicationUpdateTime() != null && other.getReplicationUpdateTime().equals(this.getReplicationUpdateTime()) == false)
            return false;
        if (other.getReplicationLastStopTime() == null ^ this.getReplicationLastStopTime() == null)
            return false;
        if (other.getReplicationLastStopTime() != null && other.getReplicationLastStopTime().equals(this.getReplicationLastStopTime()) == false)
            return false;
        if (other.getReplicationDeprovisionTime() == null ^ this.getReplicationDeprovisionTime() == null)
            return false;
        if (other.getReplicationDeprovisionTime() != null && other.getReplicationDeprovisionTime().equals(this.getReplicationDeprovisionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfigIdentifier() == null) ? 0 : getReplicationConfigIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfigArn() == null) ? 0 : getReplicationConfigArn().hashCode());
        hashCode = prime * hashCode + ((getSourceEndpointArn() == null) ? 0 : getSourceEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getTargetEndpointArn() == null) ? 0 : getTargetEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationType() == null) ? 0 : getReplicationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProvisionData() == null) ? 0 : getProvisionData().hashCode());
        hashCode = prime * hashCode + ((getStopReason() == null) ? 0 : getStopReason().hashCode());
        hashCode = prime * hashCode + ((getFailureMessages() == null) ? 0 : getFailureMessages().hashCode());
        hashCode = prime * hashCode + ((getReplicationStats() == null) ? 0 : getReplicationStats().hashCode());
        hashCode = prime * hashCode + ((getStartReplicationType() == null) ? 0 : getStartReplicationType().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode + ((getRecoveryCheckpoint() == null) ? 0 : getRecoveryCheckpoint().hashCode());
        hashCode = prime * hashCode + ((getReplicationCreateTime() == null) ? 0 : getReplicationCreateTime().hashCode());
        hashCode = prime * hashCode + ((getReplicationUpdateTime() == null) ? 0 : getReplicationUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getReplicationLastStopTime() == null) ? 0 : getReplicationLastStopTime().hashCode());
        hashCode = prime * hashCode + ((getReplicationDeprovisionTime() == null) ? 0 : getReplicationDeprovisionTime().hashCode());
        return hashCode;
    }

    @Override
    public Replication clone() {
        try {
            return (Replication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
