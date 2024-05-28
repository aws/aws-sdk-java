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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Database Migration Service (DMS) replication task. A replication task moves a set of data
 * from the source endpoint to the target endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDmsReplicationTaskDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsReplicationTaskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     * <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of these fields
     * is included.
     * </p>
     */
    private String cdcStartPosition;
    /**
     * <p>
     * Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     * specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     * </p>
     */
    private String cdcStartTime;
    /**
     * <p>
     * Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     * </p>
     */
    private String cdcStopPosition;
    /**
     * <p>
     * The migration type.
     * </p>
     */
    private String migrationType;
    /**
     * <p>
     * The identifier of the replication task.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter. If you
     * don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The user-defined replication task identifier or name.
     * </p>
     */
    private String replicationTaskIdentifier;
    /**
     * <p>
     * The settings for the replication task.
     * </p>
     */
    private String replicationTaskSettings;
    /**
     * <p>
     * The ARN of the source endpoint.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * The table mappings for the replication task, in JSON format.
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * The ARN of the target endpoint.
     * </p>
     */
    private String targetEndpointArn;
    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints.
     * </p>
     */
    private String taskData;

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     * <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of these fields
     * is included.
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     *        <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of these
     *        fields is included.
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     * <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of these fields
     * is included.
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     *         <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of
     *         these fields is included.
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     * <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of these fields
     * is included.
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. <code>CCdcStartPosition</code> or
     *        <code>CCdcStartTime</code> specifies when you want a CDC operation to start. Only a value for one of these
     *        fields is included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withCdcStartPosition(String cdcStartPosition) {
        setCdcStartPosition(cdcStartPosition);
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     * specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     *        specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     */

    public void setCdcStartTime(String cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     * specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     * </p>
     * 
     * @return Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     *         specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     */

    public String getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     * specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a CDC operation. <code>CdcStartPosition</code> or <code>CCdcStartTime</code>
     *        specifies when you want a CDC operation to start. Only a value for one of these fields is included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withCdcStartTime(String cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     */

    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     * </p>
     * 
     * @return Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     */

    public String getCdcStopPosition() {
        return this.cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a CDC operation to stop. The value can be either server time or commit time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withCdcStopPosition(String cdcStopPosition) {
        setCdcStopPosition(cdcStopPosition);
        return this;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * 
     * @param migrationType
     *        The migration type.
     */

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * 
     * @return The migration type.
     */

    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * 
     * @param migrationType
     *        The migration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withMigrationType(String migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * The identifier of the replication task.
     * </p>
     * 
     * @param id
     *        The identifier of the replication task.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the replication task.
     * </p>
     * 
     * @return The identifier of the replication task.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the replication task.
     * </p>
     * 
     * @param id
     *        The identifier of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter. If you
     * don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter.
     *        If you don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value for
     *        the end of <code>EndpointArn</code>.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter. If you
     * don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @return A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter.
     *         If you don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value
     *         for the end of <code>EndpointArn</code>.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter. If you
     * don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value for the end of
     * <code>EndpointArn</code>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A display name for the resource identifier at the end of the <code>EndpointArn</code> response parameter.
     *        If you don't specify a <code>ResourceIdentifier</code> value, DMS generates a default identifier value for
     *        the end of <code>EndpointArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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

    public AwsDmsReplicationTaskDetails withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The user-defined replication task identifier or name.
     * </p>
     * 
     * @param replicationTaskIdentifier
     *        The user-defined replication task identifier or name.
     */

    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    /**
     * <p>
     * The user-defined replication task identifier or name.
     * </p>
     * 
     * @return The user-defined replication task identifier or name.
     */

    public String getReplicationTaskIdentifier() {
        return this.replicationTaskIdentifier;
    }

    /**
     * <p>
     * The user-defined replication task identifier or name.
     * </p>
     * 
     * @param replicationTaskIdentifier
     *        The user-defined replication task identifier or name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        setReplicationTaskIdentifier(replicationTaskIdentifier);
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

    public AwsDmsReplicationTaskDetails withReplicationTaskSettings(String replicationTaskSettings) {
        setReplicationTaskSettings(replicationTaskSettings);
        return this;
    }

    /**
     * <p>
     * The ARN of the source endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The ARN of the source endpoint.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The ARN of the source endpoint.
     * </p>
     * 
     * @return The ARN of the source endpoint.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * The ARN of the source endpoint.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The ARN of the source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * The table mappings for the replication task, in JSON format.
     * </p>
     * 
     * @param tableMappings
     *        The table mappings for the replication task, in JSON format.
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * The table mappings for the replication task, in JSON format.
     * </p>
     * 
     * @return The table mappings for the replication task, in JSON format.
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * The table mappings for the replication task, in JSON format.
     * </p>
     * 
     * @param tableMappings
     *        The table mappings for the replication task, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * The ARN of the target endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        The ARN of the target endpoint.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The ARN of the target endpoint.
     * </p>
     * 
     * @return The ARN of the target endpoint.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * The ARN of the target endpoint.
     * </p>
     * 
     * @param targetEndpointArn
     *        The ARN of the target endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
        return this;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints.
     * </p>
     * 
     * @param taskData
     *        Supplemental information that the task requires to migrate the data for certain source and target
     *        endpoints.
     */

    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints.
     * </p>
     * 
     * @return Supplemental information that the task requires to migrate the data for certain source and target
     *         endpoints.
     */

    public String getTaskData() {
        return this.taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for certain source and target endpoints.
     * </p>
     * 
     * @param taskData
     *        Supplemental information that the task requires to migrate the data for certain source and target
     *        endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationTaskDetails withTaskData(String taskData) {
        setTaskData(taskData);
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
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: ").append(getCdcStartPosition()).append(",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: ").append(getCdcStartTime()).append(",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: ").append(getCdcStopPosition()).append(",");
        if (getMigrationType() != null)
            sb.append("MigrationType: ").append(getMigrationType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: ").append(getReplicationTaskIdentifier()).append(",");
        if (getReplicationTaskSettings() != null)
            sb.append("ReplicationTaskSettings: ").append(getReplicationTaskSettings()).append(",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: ").append(getSourceEndpointArn()).append(",");
        if (getTableMappings() != null)
            sb.append("TableMappings: ").append(getTableMappings()).append(",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: ").append(getTargetEndpointArn()).append(",");
        if (getTaskData() != null)
            sb.append("TaskData: ").append(getTaskData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDmsReplicationTaskDetails == false)
            return false;
        AwsDmsReplicationTaskDetails other = (AwsDmsReplicationTaskDetails) obj;
        if (other.getCdcStartPosition() == null ^ this.getCdcStartPosition() == null)
            return false;
        if (other.getCdcStartPosition() != null && other.getCdcStartPosition().equals(this.getCdcStartPosition()) == false)
            return false;
        if (other.getCdcStartTime() == null ^ this.getCdcStartTime() == null)
            return false;
        if (other.getCdcStartTime() != null && other.getCdcStartTime().equals(this.getCdcStartTime()) == false)
            return false;
        if (other.getCdcStopPosition() == null ^ this.getCdcStopPosition() == null)
            return false;
        if (other.getCdcStopPosition() != null && other.getCdcStopPosition().equals(this.getCdcStopPosition()) == false)
            return false;
        if (other.getMigrationType() == null ^ this.getMigrationType() == null)
            return false;
        if (other.getMigrationType() != null && other.getMigrationType().equals(this.getMigrationType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getReplicationTaskIdentifier() == null ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
            return false;
        if (other.getReplicationTaskSettings() == null ^ this.getReplicationTaskSettings() == null)
            return false;
        if (other.getReplicationTaskSettings() != null && other.getReplicationTaskSettings().equals(this.getReplicationTaskSettings()) == false)
            return false;
        if (other.getSourceEndpointArn() == null ^ this.getSourceEndpointArn() == null)
            return false;
        if (other.getSourceEndpointArn() != null && other.getSourceEndpointArn().equals(this.getSourceEndpointArn()) == false)
            return false;
        if (other.getTableMappings() == null ^ this.getTableMappings() == null)
            return false;
        if (other.getTableMappings() != null && other.getTableMappings().equals(this.getTableMappings()) == false)
            return false;
        if (other.getTargetEndpointArn() == null ^ this.getTargetEndpointArn() == null)
            return false;
        if (other.getTargetEndpointArn() != null && other.getTargetEndpointArn().equals(this.getTargetEndpointArn()) == false)
            return false;
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode + ((getMigrationType() == null) ? 0 : getMigrationType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskSettings() == null) ? 0 : getReplicationTaskSettings().hashCode());
        hashCode = prime * hashCode + ((getSourceEndpointArn() == null) ? 0 : getSourceEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime * hashCode + ((getTargetEndpointArn() == null) ? 0 : getTargetEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        return hashCode;
    }

    @Override
    public AwsDmsReplicationTaskDetails clone() {
        try {
            return (AwsDmsReplicationTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDmsReplicationTaskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
