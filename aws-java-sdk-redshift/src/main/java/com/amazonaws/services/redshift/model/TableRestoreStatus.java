/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a RestoreTableFromClusterSnapshot operation.
 * </p>
 */
public class TableRestoreStatus implements Serializable, Cloneable {

    /**
     * The unique identifier for the table restore request.
     */
    private String tableRestoreRequestId;

    /**
     * A value that describes the current state of the table restore request.
     * <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     */
    private String status;

    /**
     * A description of the status of the table restore request. Status
     * values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     */
    private String message;

    /**
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     */
    private java.util.Date requestTime;

    /**
     * The amount of data restored to the new table so far, in megabytes
     * (MB).
     */
    private Long progressInMegaBytes;

    /**
     * The total amount of data to restore to the new table, in megabytes
     * (MB).
     */
    private Long totalDataInMegaBytes;

    /**
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     */
    private String clusterIdentifier;

    /**
     * The identifier of the snapshot that the table is being restored from.
     */
    private String snapshotIdentifier;

    /**
     * The name of the source database that contains the table being
     * restored.
     */
    private String sourceDatabaseName;

    /**
     * The name of the source schema that contains the table being restored.
     */
    private String sourceSchemaName;

    /**
     * The name of the source table being restored.
     */
    private String sourceTableName;

    /**
     * The name of the database to restore the table to.
     */
    private String targetDatabaseName;

    /**
     * The name of the schema to restore the table to.
     */
    private String targetSchemaName;

    /**
     * The name of the table to create as a result of the table restore
     * request.
     */
    private String newTableName;

    /**
     * The unique identifier for the table restore request.
     *
     * @return The unique identifier for the table restore request.
     */
    public String getTableRestoreRequestId() {
        return tableRestoreRequestId;
    }
    
    /**
     * The unique identifier for the table restore request.
     *
     * @param tableRestoreRequestId The unique identifier for the table restore request.
     */
    public void setTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
    }
    
    /**
     * The unique identifier for the table restore request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableRestoreRequestId The unique identifier for the table restore request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
        return this;
    }

    /**
     * A value that describes the current state of the table restore request.
     * <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @return A value that describes the current state of the table restore request.
     *         <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     *
     * @see TableRestoreStatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * A value that describes the current state of the table restore request.
     * <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status A value that describes the current state of the table restore request.
     *         <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     *
     * @see TableRestoreStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * A value that describes the current state of the table restore request.
     * <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status A value that describes the current state of the table restore request.
     *         <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TableRestoreStatusType
     */
    public TableRestoreStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * A value that describes the current state of the table restore request.
     * <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status A value that describes the current state of the table restore request.
     *         <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     *
     * @see TableRestoreStatusType
     */
    public void setStatus(TableRestoreStatusType status) {
        this.status = status.toString();
    }
    
    /**
     * A value that describes the current state of the table restore request.
     * <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status A value that describes the current state of the table restore request.
     *         <p>Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TableRestoreStatusType
     */
    public TableRestoreStatus withStatus(TableRestoreStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * A description of the status of the table restore request. Status
     * values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     *
     * @return A description of the status of the table restore request. Status
     *         values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A description of the status of the table restore request. Status
     * values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     *
     * @param message A description of the status of the table restore request. Status
     *         values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A description of the status of the table restore request. Status
     * values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message A description of the status of the table restore request. Status
     *         values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     *
     * @return The time that the table restore request was made, in Universal
     *         Coordinated Time (UTC).
     */
    public java.util.Date getRequestTime() {
        return requestTime;
    }
    
    /**
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     *
     * @param requestTime The time that the table restore request was made, in Universal
     *         Coordinated Time (UTC).
     */
    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }
    
    /**
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestTime The time that the table restore request was made, in Universal
     *         Coordinated Time (UTC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * The amount of data restored to the new table so far, in megabytes
     * (MB).
     *
     * @return The amount of data restored to the new table so far, in megabytes
     *         (MB).
     */
    public Long getProgressInMegaBytes() {
        return progressInMegaBytes;
    }
    
    /**
     * The amount of data restored to the new table so far, in megabytes
     * (MB).
     *
     * @param progressInMegaBytes The amount of data restored to the new table so far, in megabytes
     *         (MB).
     */
    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }
    
    /**
     * The amount of data restored to the new table so far, in megabytes
     * (MB).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progressInMegaBytes The amount of data restored to the new table so far, in megabytes
     *         (MB).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
        return this;
    }

    /**
     * The total amount of data to restore to the new table, in megabytes
     * (MB).
     *
     * @return The total amount of data to restore to the new table, in megabytes
     *         (MB).
     */
    public Long getTotalDataInMegaBytes() {
        return totalDataInMegaBytes;
    }
    
    /**
     * The total amount of data to restore to the new table, in megabytes
     * (MB).
     *
     * @param totalDataInMegaBytes The total amount of data to restore to the new table, in megabytes
     *         (MB).
     */
    public void setTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
    }
    
    /**
     * The total amount of data to restore to the new table, in megabytes
     * (MB).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalDataInMegaBytes The total amount of data to restore to the new table, in megabytes
     *         (MB).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
        return this;
    }

    /**
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     *
     * @return The identifier of the Amazon Redshift cluster that the table is being
     *         restored to.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     *
     * @param clusterIdentifier The identifier of the Amazon Redshift cluster that the table is being
     *         restored to.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the Amazon Redshift cluster that the table is being
     *         restored to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The identifier of the snapshot that the table is being restored from.
     *
     * @return The identifier of the snapshot that the table is being restored from.
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The identifier of the snapshot that the table is being restored from.
     *
     * @param snapshotIdentifier The identifier of the snapshot that the table is being restored from.
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The identifier of the snapshot that the table is being restored from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The identifier of the snapshot that the table is being restored from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The name of the source database that contains the table being
     * restored.
     *
     * @return The name of the source database that contains the table being
     *         restored.
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }
    
    /**
     * The name of the source database that contains the table being
     * restored.
     *
     * @param sourceDatabaseName The name of the source database that contains the table being
     *         restored.
     */
    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }
    
    /**
     * The name of the source database that contains the table being
     * restored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDatabaseName The name of the source database that contains the table being
     *         restored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * The name of the source schema that contains the table being restored.
     *
     * @return The name of the source schema that contains the table being restored.
     */
    public String getSourceSchemaName() {
        return sourceSchemaName;
    }
    
    /**
     * The name of the source schema that contains the table being restored.
     *
     * @param sourceSchemaName The name of the source schema that contains the table being restored.
     */
    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }
    
    /**
     * The name of the source schema that contains the table being restored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSchemaName The name of the source schema that contains the table being restored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
        return this;
    }

    /**
     * The name of the source table being restored.
     *
     * @return The name of the source table being restored.
     */
    public String getSourceTableName() {
        return sourceTableName;
    }
    
    /**
     * The name of the source table being restored.
     *
     * @param sourceTableName The name of the source table being restored.
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }
    
    /**
     * The name of the source table being restored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceTableName The name of the source table being restored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * The name of the database to restore the table to.
     *
     * @return The name of the database to restore the table to.
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }
    
    /**
     * The name of the database to restore the table to.
     *
     * @param targetDatabaseName The name of the database to restore the table to.
     */
    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }
    
    /**
     * The name of the database to restore the table to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDatabaseName The name of the database to restore the table to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * The name of the schema to restore the table to.
     *
     * @return The name of the schema to restore the table to.
     */
    public String getTargetSchemaName() {
        return targetSchemaName;
    }
    
    /**
     * The name of the schema to restore the table to.
     *
     * @param targetSchemaName The name of the schema to restore the table to.
     */
    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }
    
    /**
     * The name of the schema to restore the table to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetSchemaName The name of the schema to restore the table to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
        return this;
    }

    /**
     * The name of the table to create as a result of the table restore
     * request.
     *
     * @return The name of the table to create as a result of the table restore
     *         request.
     */
    public String getNewTableName() {
        return newTableName;
    }
    
    /**
     * The name of the table to create as a result of the table restore
     * request.
     *
     * @param newTableName The name of the table to create as a result of the table restore
     *         request.
     */
    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }
    
    /**
     * The name of the table to create as a result of the table restore
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newTableName The name of the table to create as a result of the table restore
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TableRestoreStatus withNewTableName(String newTableName) {
        this.newTableName = newTableName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableRestoreRequestId() != null) sb.append("TableRestoreRequestId: " + getTableRestoreRequestId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getRequestTime() != null) sb.append("RequestTime: " + getRequestTime() + ",");
        if (getProgressInMegaBytes() != null) sb.append("ProgressInMegaBytes: " + getProgressInMegaBytes() + ",");
        if (getTotalDataInMegaBytes() != null) sb.append("TotalDataInMegaBytes: " + getTotalDataInMegaBytes() + ",");
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSourceDatabaseName() != null) sb.append("SourceDatabaseName: " + getSourceDatabaseName() + ",");
        if (getSourceSchemaName() != null) sb.append("SourceSchemaName: " + getSourceSchemaName() + ",");
        if (getSourceTableName() != null) sb.append("SourceTableName: " + getSourceTableName() + ",");
        if (getTargetDatabaseName() != null) sb.append("TargetDatabaseName: " + getTargetDatabaseName() + ",");
        if (getTargetSchemaName() != null) sb.append("TargetSchemaName: " + getTargetSchemaName() + ",");
        if (getNewTableName() != null) sb.append("NewTableName: " + getNewTableName() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TableRestoreStatus == false) return false;
        TableRestoreStatus other = (TableRestoreStatus)obj;
        
        if (other.getTableRestoreRequestId() == null ^ this.getTableRestoreRequestId() == null) return false;
        if (other.getTableRestoreRequestId() != null && other.getTableRestoreRequestId().equals(this.getTableRestoreRequestId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getRequestTime() == null ^ this.getRequestTime() == null) return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false) return false; 
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null) return false;
        if (other.getProgressInMegaBytes() != null && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false) return false; 
        if (other.getTotalDataInMegaBytes() == null ^ this.getTotalDataInMegaBytes() == null) return false;
        if (other.getTotalDataInMegaBytes() != null && other.getTotalDataInMegaBytes().equals(this.getTotalDataInMegaBytes()) == false) return false; 
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getSourceDatabaseName() == null ^ this.getSourceDatabaseName() == null) return false;
        if (other.getSourceDatabaseName() != null && other.getSourceDatabaseName().equals(this.getSourceDatabaseName()) == false) return false; 
        if (other.getSourceSchemaName() == null ^ this.getSourceSchemaName() == null) return false;
        if (other.getSourceSchemaName() != null && other.getSourceSchemaName().equals(this.getSourceSchemaName()) == false) return false; 
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null) return false;
        if (other.getSourceTableName() != null && other.getSourceTableName().equals(this.getSourceTableName()) == false) return false; 
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null) return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false) return false; 
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null) return false;
        if (other.getTargetSchemaName() != null && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false) return false; 
        if (other.getNewTableName() == null ^ this.getNewTableName() == null) return false;
        if (other.getNewTableName() != null && other.getNewTableName().equals(this.getNewTableName()) == false) return false; 
        return true;
    }
    
    @Override
    public TableRestoreStatus clone() {
        try {
            return (TableRestoreStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    