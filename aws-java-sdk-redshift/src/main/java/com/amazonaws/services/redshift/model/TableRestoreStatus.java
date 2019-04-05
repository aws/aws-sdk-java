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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of a <a>RestoreTableFromClusterSnapshot</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/TableRestoreStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableRestoreStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     */
    private String tableRestoreRequestId;
    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the status of the table restore request. Status values include <code>SUCCEEDED</code>,
     * <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time that the table restore request was made, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date requestTime;
    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     */
    private Long progressInMegaBytes;
    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     */
    private Long totalDataInMegaBytes;
    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being restored to.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     */
    private String sourceDatabaseName;
    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     */
    private String sourceSchemaName;
    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     */
    private String sourceTableName;
    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     */
    private String targetDatabaseName;
    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     */
    private String targetSchemaName;
    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     */
    private String newTableName;

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     * 
     * @param tableRestoreRequestId
     *        The unique identifier for the table restore request.
     */

    public void setTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
    }

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     * 
     * @return The unique identifier for the table restore request.
     */

    public String getTableRestoreRequestId() {
        return this.tableRestoreRequestId;
    }

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     * 
     * @param tableRestoreRequestId
     *        The unique identifier for the table restore request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTableRestoreRequestId(String tableRestoreRequestId) {
        setTableRestoreRequestId(tableRestoreRequestId);
        return this;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>
     * </p>
     * 
     * @param status
     *        A value that describes the current state of the table restore request.</p>
     *        <p>
     *        Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *        <code>IN_PROGRESS</code>
     * @see TableRestoreStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>
     * </p>
     * 
     * @return A value that describes the current state of the table restore request.</p>
     *         <p>
     *         Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *         <code>IN_PROGRESS</code>
     * @see TableRestoreStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>
     * </p>
     * 
     * @param status
     *        A value that describes the current state of the table restore request.</p>
     *        <p>
     *        Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *        <code>IN_PROGRESS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableRestoreStatusType
     */

    public TableRestoreStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>
     * </p>
     * 
     * @param status
     *        A value that describes the current state of the table restore request.</p>
     *        <p>
     *        Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *        <code>IN_PROGRESS</code>
     * @see TableRestoreStatusType
     */

    public void setStatus(TableRestoreStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     * <code>IN_PROGRESS</code>
     * </p>
     * 
     * @param status
     *        A value that describes the current state of the table restore request.</p>
     *        <p>
     *        Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELED</code>, <code>PENDING</code>,
     *        <code>IN_PROGRESS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableRestoreStatusType
     */

    public TableRestoreStatus withStatus(TableRestoreStatusType status) {
        this.status = status.toString();
        return this;
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
     * The identifier of the Amazon Redshift cluster that the table is being restored to.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the Amazon Redshift cluster that the table is being restored to.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being restored to.
     * </p>
     * 
     * @return The identifier of the Amazon Redshift cluster that the table is being restored to.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being restored to.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the Amazon Redshift cluster that the table is being restored to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot that the table is being restored from.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     * 
     * @return The identifier of the snapshot that the table is being restored from.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot that the table is being restored from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database that contains the table being restored.
     */

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * 
     * @return The name of the source database that contains the table being restored.
     */

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * 
     * @param sourceDatabaseName
     *        The name of the source database that contains the table being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSourceDatabaseName(String sourceDatabaseName) {
        setSourceDatabaseName(sourceDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema that contains the table being restored.
     */

    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * 
     * @return The name of the source schema that contains the table being restored.
     */

    public String getSourceSchemaName() {
        return this.sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * 
     * @param sourceSchemaName
     *        The name of the source schema that contains the table being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSourceSchemaName(String sourceSchemaName) {
        setSourceSchemaName(sourceSchemaName);
        return this;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table being restored.
     */

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * 
     * @return The name of the source table being restored.
     */

    public String getSourceTableName() {
        return this.sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * 
     * @param sourceTableName
     *        The name of the source table being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withSourceTableName(String sourceTableName) {
        setSourceTableName(sourceTableName);
        return this;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * 
     * @param targetDatabaseName
     *        The name of the database to restore the table to.
     */

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * 
     * @return The name of the database to restore the table to.
     */

    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * 
     * @param targetDatabaseName
     *        The name of the database to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTargetDatabaseName(String targetDatabaseName) {
        setTargetDatabaseName(targetDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * 
     * @param targetSchemaName
     *        The name of the schema to restore the table to.
     */

    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * 
     * @return The name of the schema to restore the table to.
     */

    public String getTargetSchemaName() {
        return this.targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * 
     * @param targetSchemaName
     *        The name of the schema to restore the table to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withTargetSchemaName(String targetSchemaName) {
        setTargetSchemaName(targetSchemaName);
        return this;
    }

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create as a result of the table restore request.
     */

    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     * 
     * @return The name of the table to create as a result of the table restore request.
     */

    public String getNewTableName() {
        return this.newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     * 
     * @param newTableName
     *        The name of the table to create as a result of the table restore request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRestoreStatus withNewTableName(String newTableName) {
        setNewTableName(newTableName);
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
        if (getTableRestoreRequestId() != null)
            sb.append("TableRestoreRequestId: ").append(getTableRestoreRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getRequestTime() != null)
            sb.append("RequestTime: ").append(getRequestTime()).append(",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: ").append(getProgressInMegaBytes()).append(",");
        if (getTotalDataInMegaBytes() != null)
            sb.append("TotalDataInMegaBytes: ").append(getTotalDataInMegaBytes()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getSourceDatabaseName() != null)
            sb.append("SourceDatabaseName: ").append(getSourceDatabaseName()).append(",");
        if (getSourceSchemaName() != null)
            sb.append("SourceSchemaName: ").append(getSourceSchemaName()).append(",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: ").append(getSourceTableName()).append(",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: ").append(getTargetDatabaseName()).append(",");
        if (getTargetSchemaName() != null)
            sb.append("TargetSchemaName: ").append(getTargetSchemaName()).append(",");
        if (getNewTableName() != null)
            sb.append("NewTableName: ").append(getNewTableName());
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
        if (other.getTableRestoreRequestId() == null ^ this.getTableRestoreRequestId() == null)
            return false;
        if (other.getTableRestoreRequestId() != null && other.getTableRestoreRequestId().equals(this.getTableRestoreRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getTotalDataInMegaBytes() == null ^ this.getTotalDataInMegaBytes() == null)
            return false;
        if (other.getTotalDataInMegaBytes() != null && other.getTotalDataInMegaBytes().equals(this.getTotalDataInMegaBytes()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
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
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null)
            return false;
        if (other.getTargetSchemaName() != null && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false)
            return false;
        if (other.getNewTableName() == null ^ this.getNewTableName() == null)
            return false;
        if (other.getNewTableName() != null && other.getNewTableName().equals(this.getNewTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableRestoreRequestId() == null) ? 0 : getTableRestoreRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode + ((getProgressInMegaBytes() == null) ? 0 : getProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getTotalDataInMegaBytes() == null) ? 0 : getTotalDataInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDatabaseName() == null) ? 0 : getSourceDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSourceSchemaName() == null) ? 0 : getSourceSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTargetSchemaName() == null) ? 0 : getTargetSchemaName().hashCode());
        hashCode = prime * hashCode + ((getNewTableName() == null) ? 0 : getNewTableName().hashCode());
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

}
