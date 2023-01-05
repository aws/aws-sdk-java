/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a table restore request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/TableRestoreStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableRestoreStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The namespace of the table being restored from.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     */
    private String newTableName;
    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     */
    private Long progressInMegaBytes;
    /**
     * <p>
     * The time that the table restore request was made, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date requestTime;
    /**
     * <p>
     * The name of the snapshot being restored from.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The name of the source database being restored from.
     * </p>
     */
    private String sourceDatabaseName;
    /**
     * <p>
     * The name of the source schema being restored from.
     * </p>
     */
    private String sourceSchemaName;
    /**
     * <p>
     * The name of the source table being restored from.
     * </p>
     */
    private String sourceTableName;
    /**
     * <p>
     * A value that describes the current state of the table restore request. Possible values include
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the RestoreTableFromSnapshot request.
     * </p>
     */
    private String tableRestoreRequestId;
    /**
     * <p>
     * The name of the database to restore to.
     * </p>
     */
    private String targetDatabaseName;
    /**
     * <p>
     * The name of the schema to restore to.
     * </p>
     */
    private String targetSchemaName;
    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     */
    private Long totalDataInMegaBytes;
    /**
     * <p>
     * The name of the workgroup being restored from.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param message
     *        A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     *        <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     *         <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param message
     *        A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     *        <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The namespace of the table being restored from.
     * </p>
     * 
     * @param namespaceName
     *        The namespace of the table being restored from.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The namespace of the table being restored from.
     * </p>
     * 
     * @return The namespace of the table being restored from.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The namespace of the table being restored from.
     * </p>
     * 
     * @param namespaceName
     *        The namespace of the table being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create from the restore operation.
     */

    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     * 
     * @return The name of the table to create from the restore operation.
     */

    public String getNewTableName() {
        return this.newTableName;
    }

    /**
     * <p>
     * The name of the table to create from the restore operation.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create from the restore operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withNewTableName(String newTableName) {
        setNewTableName(newTableName);
        return this;
    }

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     * 
     * @param progressInMegaBytes
     *        The amount of data restored to the new table so far, in megabytes (MB).
     */

    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     * 
     * @return The amount of data restored to the new table so far, in megabytes (MB).
     */

    public Long getProgressInMegaBytes() {
        return this.progressInMegaBytes;
    }

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     * 
     * @param progressInMegaBytes
     *        The amount of data restored to the new table so far, in megabytes (MB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withProgressInMegaBytes(Long progressInMegaBytes) {
        setProgressInMegaBytes(progressInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The time that the table restore request was made, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param requestTime
     *        The time that the table restore request was made, in Universal Coordinated Time (UTC).
     */

    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * <p>
     * The time that the table restore request was made, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time that the table restore request was made, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getRequestTime() {
        return this.requestTime;
    }

    /**
     * <p>
     * The time that the table restore request was made, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param requestTime
     *        The time that the table restore request was made, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withRequestTime(java.util.Date requestTime) {
        setRequestTime(requestTime);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot being restored from.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot being restored from.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot being restored from.
     * </p>
     * 
     * @return The name of the snapshot being restored from.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot being restored from.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The name of the source database being restored from.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database being restored from.
     */

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database being restored from.
     * </p>
     * 
     * @return The name of the source database being restored from.
     */

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database being restored from.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSourceDatabaseName(String sourceDatabaseName) {
        setSourceDatabaseName(sourceDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the source schema being restored from.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema being restored from.
     */

    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema being restored from.
     * </p>
     * 
     * @return The name of the source schema being restored from.
     */

    public String getSourceSchemaName() {
        return this.sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema being restored from.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSourceSchemaName(String sourceSchemaName) {
        setSourceSchemaName(sourceSchemaName);
        return this;
    }

    /**
     * <p>
     * The name of the source table being restored from.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table being restored from.
     */

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored from.
     * </p>
     * 
     * @return The name of the source table being restored from.
     */

    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored from.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSourceTableName(String sourceTableName) {
        setSourceTableName(sourceTableName);
        return this;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request. Possible values include
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param status
     *        A value that describes the current state of the table restore request. Possible values include
     *        <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *        <code>IN_PROGRESS</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request. Possible values include
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @return A value that describes the current state of the table restore request. Possible values include
     *         <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *         <code>IN_PROGRESS</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request. Possible values include
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>.
     * </p>
     * 
     * @param status
     *        A value that describes the current state of the table restore request. Possible values include
     *        <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *        <code>IN_PROGRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The ID of the RestoreTableFromSnapshot request.
     * </p>
     * 
     * @param tableRestoreRequestId
     *        The ID of the RestoreTableFromSnapshot request.
     */

    public void setTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
    }

    /**
     * <p>
     * The ID of the RestoreTableFromSnapshot request.
     * </p>
     * 
     * @return The ID of the RestoreTableFromSnapshot request.
     */

    public String getTableRestoreRequestId() {
        return this.tableRestoreRequestId;
    }

    /**
     * <p>
     * The ID of the RestoreTableFromSnapshot request.
     * </p>
     * 
     * @param tableRestoreRequestId
     *        The ID of the RestoreTableFromSnapshot request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTableRestoreRequestId(String tableRestoreRequestId) {
        setTableRestoreRequestId(tableRestoreRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the database to restore to.
     * </p>
     * 
     * @param targetDatabaseName
     *        The name of the database to restore to.
     */

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore to.
     * </p>
     * 
     * @return The name of the database to restore to.
     */

    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore to.
     * </p>
     * 
     * @param targetDatabaseName
     *        The name of the database to restore to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTargetDatabaseName(String targetDatabaseName) {
        setTargetDatabaseName(targetDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the schema to restore to.
     * </p>
     * 
     * @param targetSchemaName
     *        The name of the schema to restore to.
     */

    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore to.
     * </p>
     * 
     * @return The name of the schema to restore to.
     */

    public String getTargetSchemaName() {
        return this.targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore to.
     * </p>
     * 
     * @param targetSchemaName
     *        The name of the schema to restore to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTargetSchemaName(String targetSchemaName) {
        setTargetSchemaName(targetSchemaName);
        return this;
    }

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     * 
     * @param totalDataInMegaBytes
     *        The total amount of data to restore to the new table, in megabytes (MB).
     */

    public void setTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
    }

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     * 
     * @return The total amount of data to restore to the new table, in megabytes (MB).
     */

    public Long getTotalDataInMegaBytes() {
        return this.totalDataInMegaBytes;
    }

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     * 
     * @param totalDataInMegaBytes
     *        The total amount of data to restore to the new table, in megabytes (MB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        setTotalDataInMegaBytes(totalDataInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup being restored from.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup being restored from.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup being restored from.
     * </p>
     * 
     * @return The name of the workgroup being restored from.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup being restored from.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getNewTableName() != null)
            sb.append("NewTableName: ").append(getNewTableName()).append(",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: ").append(getProgressInMegaBytes()).append(",");
        if (getRequestTime() != null)
            sb.append("RequestTime: ").append(getRequestTime()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSourceDatabaseName() != null)
            sb.append("SourceDatabaseName: ").append(getSourceDatabaseName()).append(",");
        if (getSourceSchemaName() != null)
            sb.append("SourceSchemaName: ").append(getSourceSchemaName()).append(",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: ").append(getSourceTableName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTableRestoreRequestId() != null)
            sb.append("TableRestoreRequestId: ").append(getTableRestoreRequestId()).append(",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: ").append(getTargetDatabaseName()).append(",");
        if (getTargetSchemaName() != null)
            sb.append("TargetSchemaName: ").append(getTargetSchemaName()).append(",");
        if (getTotalDataInMegaBytes() != null)
            sb.append("TotalDataInMegaBytes: ").append(getTotalDataInMegaBytes()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableRestoreStatus == false)
            return false;
        TableRestoreStatus other = (TableRestoreStatus) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getNewTableName() == null ^ this.getNewTableName() == null)
            return false;
        if (other.getNewTableName() != null && other.getNewTableName().equals(this.getNewTableName()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSourceDatabaseName() == null ^ this.getSourceDatabaseName() == null)
            return false;
        if (other.getSourceDatabaseName() != null && other.getSourceDatabaseName().equals(this.getSourceDatabaseName()) == false)
            return false;
        if (other.getSourceSchemaName() == null ^ this.getSourceSchemaName() == null)
            return false;
        if (other.getSourceSchemaName() != null && other.getSourceSchemaName().equals(this.getSourceSchemaName()) == false)
            return false;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTableRestoreRequestId() == null ^ this.getTableRestoreRequestId() == null)
            return false;
        if (other.getTableRestoreRequestId() != null && other.getTableRestoreRequestId().equals(this.getTableRestoreRequestId()) == false)
            return false;
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null)
            return false;
        if (other.getTargetSchemaName() != null && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false)
            return false;
        if (other.getTotalDataInMegaBytes() == null ^ this.getTotalDataInMegaBytes() == null)
            return false;
        if (other.getTotalDataInMegaBytes() != null && other.getTotalDataInMegaBytes().equals(this.getTotalDataInMegaBytes()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getNewTableName() == null) ? 0 : getNewTableName().hashCode());
        hashCode = prime * hashCode + ((getProgressInMegaBytes() == null) ? 0 : getProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSourceDatabaseName() == null) ? 0 : getSourceDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSourceSchemaName() == null) ? 0 : getSourceSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTableRestoreRequestId() == null) ? 0 : getTableRestoreRequestId().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTargetSchemaName() == null) ? 0 : getTargetSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTotalDataInMegaBytes() == null) ? 0 : getTotalDataInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public TableRestoreStatus clone() {
        try {
            return (TableRestoreStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.TableRestoreStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
