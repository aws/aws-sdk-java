/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;
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
     * The migration type.
     * </p>
     * <p>
     * Valid values: full-load | cdc | full-load-and-cdc
     * </p>
     */
    private String migrationType;
    /**
     * <p>
     * The path of the JSON file that contains the table mappings. Preceed the path with "file://".
     * </p>
     * <p>
     * For example, --table-mappings file://mappingfile.json
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * JSON file that contains settings for the task, such as target metadata settings.
     * </p>
     */
    private String replicationTaskSettings;
    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     */
    private java.util.Date cdcStartTime;

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

    public ModifyReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
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

    public ModifyReplicationTaskRequest withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        setReplicationTaskIdentifier(replicationTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * <p>
     * Valid values: full-load | cdc | full-load-and-cdc
     * </p>
     * 
     * @param migrationType
     *        The migration type.</p>
     *        <p>
     *        Valid values: full-load | cdc | full-load-and-cdc
     * @see MigrationTypeValue
     */

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * <p>
     * Valid values: full-load | cdc | full-load-and-cdc
     * </p>
     * 
     * @return The migration type.</p>
     *         <p>
     *         Valid values: full-load | cdc | full-load-and-cdc
     * @see MigrationTypeValue
     */

    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * <p>
     * Valid values: full-load | cdc | full-load-and-cdc
     * </p>
     * 
     * @param migrationType
     *        The migration type.</p>
     *        <p>
     *        Valid values: full-load | cdc | full-load-and-cdc
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ModifyReplicationTaskRequest withMigrationType(String migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * <p>
     * Valid values: full-load | cdc | full-load-and-cdc
     * </p>
     * 
     * @param migrationType
     *        The migration type.</p>
     *        <p>
     *        Valid values: full-load | cdc | full-load-and-cdc
     * @see MigrationTypeValue
     */

    public void setMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
    }

    /**
     * <p>
     * The migration type.
     * </p>
     * <p>
     * Valid values: full-load | cdc | full-load-and-cdc
     * </p>
     * 
     * @param migrationType
     *        The migration type.</p>
     *        <p>
     *        Valid values: full-load | cdc | full-load-and-cdc
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ModifyReplicationTaskRequest withMigrationType(MigrationTypeValue migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * The path of the JSON file that contains the table mappings. Preceed the path with "file://".
     * </p>
     * <p>
     * For example, --table-mappings file://mappingfile.json
     * </p>
     * 
     * @param tableMappings
     *        The path of the JSON file that contains the table mappings. Preceed the path with "file://".</p>
     *        <p>
     *        For example, --table-mappings file://mappingfile.json
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * The path of the JSON file that contains the table mappings. Preceed the path with "file://".
     * </p>
     * <p>
     * For example, --table-mappings file://mappingfile.json
     * </p>
     * 
     * @return The path of the JSON file that contains the table mappings. Preceed the path with "file://".</p>
     *         <p>
     *         For example, --table-mappings file://mappingfile.json
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * The path of the JSON file that contains the table mappings. Preceed the path with "file://".
     * </p>
     * <p>
     * For example, --table-mappings file://mappingfile.json
     * </p>
     * 
     * @param tableMappings
     *        The path of the JSON file that contains the table mappings. Preceed the path with "file://".</p>
     *        <p>
     *        For example, --table-mappings file://mappingfile.json
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as target metadata settings.
     * </p>
     * 
     * @param replicationTaskSettings
     *        JSON file that contains settings for the task, such as target metadata settings.
     */

    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as target metadata settings.
     * </p>
     * 
     * @return JSON file that contains settings for the task, such as target metadata settings.
     */

    public String getReplicationTaskSettings() {
        return this.replicationTaskSettings;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as target metadata settings.
     * </p>
     * 
     * @param replicationTaskSettings
     *        JSON file that contains settings for the task, such as target metadata settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withReplicationTaskSettings(String replicationTaskSettings) {
        setReplicationTaskSettings(replicationTaskSettings);
        return this;
    }

    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     * 
     * @param cdcStartTime
     *        The start time for the Change Data Capture (CDC) operation.
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     * 
     * @return The start time for the Change Data Capture (CDC) operation.
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     * 
     * @param cdcStartTime
     *        The start time for the Change Data Capture (CDC) operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: ").append(getReplicationTaskIdentifier()).append(",");
        if (getMigrationType() != null)
            sb.append("MigrationType: ").append(getMigrationType()).append(",");
        if (getTableMappings() != null)
            sb.append("TableMappings: ").append(getTableMappings()).append(",");
        if (getReplicationTaskSettings() != null)
            sb.append("ReplicationTaskSettings: ").append(getReplicationTaskSettings()).append(",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: ").append(getCdcStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationTaskRequest == false)
            return false;
        ModifyReplicationTaskRequest other = (ModifyReplicationTaskRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskIdentifier() == null ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMigrationType() == null) ? 0 : getMigrationType().hashCode());
        hashCode = prime * hashCode + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskSettings() == null) ? 0 : getReplicationTaskSettings().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationTaskRequest clone() {
        return (ModifyReplicationTaskRequest) super.clone();
    }

}
