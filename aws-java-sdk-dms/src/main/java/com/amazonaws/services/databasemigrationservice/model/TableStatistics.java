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
 * Provides a collection of table statistics in response to a request by the <code>DescribeTableStatistics</code>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/TableStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schema name.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     */
    private Long inserts;
    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     */
    private Long deletes;
    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     */
    private Long updates;
    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure of your tables.
     * </p>
     */
    private Long ddls;
    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     */
    private Long fullLoadRows;
    /**
     * <p>
     * The number of rows that failed conditional checks during the full load operation (valid only for migrations where
     * DynamoDB is the target).
     * </p>
     */
    private Long fullLoadCondtnlChkFailedRows;
    /**
     * <p>
     * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB
     * is the target).
     * </p>
     */
    private Long fullLoadErrorRows;
    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     */
    private java.util.Date fullLoadStartTime;
    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     */
    private java.util.Date fullLoadEndTime;
    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     * operation (<code>false</code>).
     * </p>
     */
    private Boolean fullLoadReloaded;
    /**
     * <p>
     * The last time a table was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error |
     * Table all | Table updates | Table is being reloaded
     * </p>
     */
    private String tableState;
    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     */
    private Long validationPendingRecords;
    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     */
    private Long validationFailedRecords;
    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     */
    private Long validationSuspendedRecords;
    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled – Validation isn't enabled for the table in the migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records – Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records – Some records in the table don't match between the source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records – Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key –The table couldn't be validated because it has no primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated – All rows in the table are validated. If the table is updated, the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error – The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending validation – The table is waiting validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing table – Preparing the table enabled in the migration task for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending revalidation – All rows in the table are pending validation after the table was updated.
     * </p>
     * </li>
     * </ul>
     */
    private String validationState;
    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     */
    private String validationStateDetails;

    /**
     * <p>
     * The schema name.
     * </p>
     * 
     * @param schemaName
     *        The schema name.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The schema name.
     * </p>
     * 
     * @return The schema name.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The schema name.
     * </p>
     * 
     * @param schemaName
     *        The schema name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     * 
     * @param inserts
     *        The number of insert actions performed on a table.
     */

    public void setInserts(Long inserts) {
        this.inserts = inserts;
    }

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     * 
     * @return The number of insert actions performed on a table.
     */

    public Long getInserts() {
        return this.inserts;
    }

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     * 
     * @param inserts
     *        The number of insert actions performed on a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withInserts(Long inserts) {
        setInserts(inserts);
        return this;
    }

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     * 
     * @param deletes
     *        The number of delete actions performed on a table.
     */

    public void setDeletes(Long deletes) {
        this.deletes = deletes;
    }

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     * 
     * @return The number of delete actions performed on a table.
     */

    public Long getDeletes() {
        return this.deletes;
    }

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     * 
     * @param deletes
     *        The number of delete actions performed on a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withDeletes(Long deletes) {
        setDeletes(deletes);
        return this;
    }

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     * 
     * @param updates
     *        The number of update actions performed on a table.
     */

    public void setUpdates(Long updates) {
        this.updates = updates;
    }

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     * 
     * @return The number of update actions performed on a table.
     */

    public Long getUpdates() {
        return this.updates;
    }

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     * 
     * @param updates
     *        The number of update actions performed on a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withUpdates(Long updates) {
        setUpdates(updates);
        return this;
    }

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure of your tables.
     * </p>
     * 
     * @param ddls
     *        The data definition language (DDL) used to build and modify the structure of your tables.
     */

    public void setDdls(Long ddls) {
        this.ddls = ddls;
    }

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure of your tables.
     * </p>
     * 
     * @return The data definition language (DDL) used to build and modify the structure of your tables.
     */

    public Long getDdls() {
        return this.ddls;
    }

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure of your tables.
     * </p>
     * 
     * @param ddls
     *        The data definition language (DDL) used to build and modify the structure of your tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withDdls(Long ddls) {
        setDdls(ddls);
        return this;
    }

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     * 
     * @param fullLoadRows
     *        The number of rows added during the full load operation.
     */

    public void setFullLoadRows(Long fullLoadRows) {
        this.fullLoadRows = fullLoadRows;
    }

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     * 
     * @return The number of rows added during the full load operation.
     */

    public Long getFullLoadRows() {
        return this.fullLoadRows;
    }

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     * 
     * @param fullLoadRows
     *        The number of rows added during the full load operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadRows(Long fullLoadRows) {
        setFullLoadRows(fullLoadRows);
        return this;
    }

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load operation (valid only for migrations where
     * DynamoDB is the target).
     * </p>
     * 
     * @param fullLoadCondtnlChkFailedRows
     *        The number of rows that failed conditional checks during the full load operation (valid only for
     *        migrations where DynamoDB is the target).
     */

    public void setFullLoadCondtnlChkFailedRows(Long fullLoadCondtnlChkFailedRows) {
        this.fullLoadCondtnlChkFailedRows = fullLoadCondtnlChkFailedRows;
    }

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load operation (valid only for migrations where
     * DynamoDB is the target).
     * </p>
     * 
     * @return The number of rows that failed conditional checks during the full load operation (valid only for
     *         migrations where DynamoDB is the target).
     */

    public Long getFullLoadCondtnlChkFailedRows() {
        return this.fullLoadCondtnlChkFailedRows;
    }

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load operation (valid only for migrations where
     * DynamoDB is the target).
     * </p>
     * 
     * @param fullLoadCondtnlChkFailedRows
     *        The number of rows that failed conditional checks during the full load operation (valid only for
     *        migrations where DynamoDB is the target).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadCondtnlChkFailedRows(Long fullLoadCondtnlChkFailedRows) {
        setFullLoadCondtnlChkFailedRows(fullLoadCondtnlChkFailedRows);
        return this;
    }

    /**
     * <p>
     * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB
     * is the target).
     * </p>
     * 
     * @param fullLoadErrorRows
     *        The number of rows that failed to load during the full load operation (valid only for migrations where
     *        DynamoDB is the target).
     */

    public void setFullLoadErrorRows(Long fullLoadErrorRows) {
        this.fullLoadErrorRows = fullLoadErrorRows;
    }

    /**
     * <p>
     * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB
     * is the target).
     * </p>
     * 
     * @return The number of rows that failed to load during the full load operation (valid only for migrations where
     *         DynamoDB is the target).
     */

    public Long getFullLoadErrorRows() {
        return this.fullLoadErrorRows;
    }

    /**
     * <p>
     * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB
     * is the target).
     * </p>
     * 
     * @param fullLoadErrorRows
     *        The number of rows that failed to load during the full load operation (valid only for migrations where
     *        DynamoDB is the target).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadErrorRows(Long fullLoadErrorRows) {
        setFullLoadErrorRows(fullLoadErrorRows);
        return this;
    }

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     * 
     * @param fullLoadStartTime
     *        The time when the full load operation started.
     */

    public void setFullLoadStartTime(java.util.Date fullLoadStartTime) {
        this.fullLoadStartTime = fullLoadStartTime;
    }

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     * 
     * @return The time when the full load operation started.
     */

    public java.util.Date getFullLoadStartTime() {
        return this.fullLoadStartTime;
    }

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     * 
     * @param fullLoadStartTime
     *        The time when the full load operation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadStartTime(java.util.Date fullLoadStartTime) {
        setFullLoadStartTime(fullLoadStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     * 
     * @param fullLoadEndTime
     *        The time when the full load operation completed.
     */

    public void setFullLoadEndTime(java.util.Date fullLoadEndTime) {
        this.fullLoadEndTime = fullLoadEndTime;
    }

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     * 
     * @return The time when the full load operation completed.
     */

    public java.util.Date getFullLoadEndTime() {
        return this.fullLoadEndTime;
    }

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     * 
     * @param fullLoadEndTime
     *        The time when the full load operation completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadEndTime(java.util.Date fullLoadEndTime) {
        setFullLoadEndTime(fullLoadEndTime);
        return this;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     * operation (<code>false</code>).
     * </p>
     * 
     * @param fullLoadReloaded
     *        A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     *        operation (<code>false</code>).
     */

    public void setFullLoadReloaded(Boolean fullLoadReloaded) {
        this.fullLoadReloaded = fullLoadReloaded;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     * operation (<code>false</code>).
     * </p>
     * 
     * @return A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     *         operation (<code>false</code>).
     */

    public Boolean getFullLoadReloaded() {
        return this.fullLoadReloaded;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     * operation (<code>false</code>).
     * </p>
     * 
     * @param fullLoadReloaded
     *        A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     *        operation (<code>false</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadReloaded(Boolean fullLoadReloaded) {
        setFullLoadReloaded(fullLoadReloaded);
        return this;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     * operation (<code>false</code>).
     * </p>
     * 
     * @return A value that indicates if the table was reloaded (<code>true</code>) or loaded as part of a new full load
     *         operation (<code>false</code>).
     */

    public Boolean isFullLoadReloaded() {
        return this.fullLoadReloaded;
    }

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time a table was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     * 
     * @return The last time a table was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time a table was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error |
     * Table all | Table updates | Table is being reloaded
     * </p>
     * 
     * @param tableState
     *        The state of the tables described.</p>
     *        <p>
     *        Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table
     *        error | Table all | Table updates | Table is being reloaded
     */

    public void setTableState(String tableState) {
        this.tableState = tableState;
    }

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error |
     * Table all | Table updates | Table is being reloaded
     * </p>
     * 
     * @return The state of the tables described.</p>
     *         <p>
     *         Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table
     *         error | Table all | Table updates | Table is being reloaded
     */

    public String getTableState() {
        return this.tableState;
    }

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error |
     * Table all | Table updates | Table is being reloaded
     * </p>
     * 
     * @param tableState
     *        The state of the tables described.</p>
     *        <p>
     *        Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table
     *        error | Table all | Table updates | Table is being reloaded
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withTableState(String tableState) {
        setTableState(tableState);
        return this;
    }

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     * 
     * @param validationPendingRecords
     *        The number of records that have yet to be validated.
     */

    public void setValidationPendingRecords(Long validationPendingRecords) {
        this.validationPendingRecords = validationPendingRecords;
    }

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     * 
     * @return The number of records that have yet to be validated.
     */

    public Long getValidationPendingRecords() {
        return this.validationPendingRecords;
    }

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     * 
     * @param validationPendingRecords
     *        The number of records that have yet to be validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withValidationPendingRecords(Long validationPendingRecords) {
        setValidationPendingRecords(validationPendingRecords);
        return this;
    }

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     * 
     * @param validationFailedRecords
     *        The number of records that failed validation.
     */

    public void setValidationFailedRecords(Long validationFailedRecords) {
        this.validationFailedRecords = validationFailedRecords;
    }

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     * 
     * @return The number of records that failed validation.
     */

    public Long getValidationFailedRecords() {
        return this.validationFailedRecords;
    }

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     * 
     * @param validationFailedRecords
     *        The number of records that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withValidationFailedRecords(Long validationFailedRecords) {
        setValidationFailedRecords(validationFailedRecords);
        return this;
    }

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     * 
     * @param validationSuspendedRecords
     *        The number of records that couldn't be validated.
     */

    public void setValidationSuspendedRecords(Long validationSuspendedRecords) {
        this.validationSuspendedRecords = validationSuspendedRecords;
    }

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     * 
     * @return The number of records that couldn't be validated.
     */

    public Long getValidationSuspendedRecords() {
        return this.validationSuspendedRecords;
    }

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     * 
     * @param validationSuspendedRecords
     *        The number of records that couldn't be validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withValidationSuspendedRecords(Long validationSuspendedRecords) {
        setValidationSuspendedRecords(validationSuspendedRecords);
        return this;
    }

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled – Validation isn't enabled for the table in the migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records – Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records – Some records in the table don't match between the source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records – Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key –The table couldn't be validated because it has no primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated – All rows in the table are validated. If the table is updated, the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error – The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending validation – The table is waiting validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing table – Preparing the table enabled in the migration task for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending revalidation – All rows in the table are pending validation after the table was updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationState
     *        The validation state of the table.</p>
     *        <p>
     *        This parameter can have the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Not enabled – Validation isn't enabled for the table in the migration task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Pending records – Some records in the table are waiting for validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Mismatched records – Some records in the table don't match between the source and target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Suspended records – Some records in the table couldn't be validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No primary key –The table couldn't be validated because it has no primary key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Validated – All rows in the table are validated. If the table is updated, the status can change from
     *        Validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Error – The table couldn't be validated because of an unexpected error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Pending validation – The table is waiting validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Preparing table – Preparing the table enabled in the migration task for validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Pending revalidation – All rows in the table are pending validation after the table was updated.
     *        </p>
     *        </li>
     */

    public void setValidationState(String validationState) {
        this.validationState = validationState;
    }

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled – Validation isn't enabled for the table in the migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records – Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records – Some records in the table don't match between the source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records – Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key –The table couldn't be validated because it has no primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated – All rows in the table are validated. If the table is updated, the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error – The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending validation – The table is waiting validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing table – Preparing the table enabled in the migration task for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending revalidation – All rows in the table are pending validation after the table was updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The validation state of the table.</p>
     *         <p>
     *         This parameter can have the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Not enabled – Validation isn't enabled for the table in the migration task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Pending records – Some records in the table are waiting for validation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Mismatched records – Some records in the table don't match between the source and target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Suspended records – Some records in the table couldn't be validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No primary key –The table couldn't be validated because it has no primary key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validated – All rows in the table are validated. If the table is updated, the status can change from
     *         Validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Error – The table couldn't be validated because of an unexpected error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Pending validation – The table is waiting validation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Preparing table – Preparing the table enabled in the migration task for validation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Pending revalidation – All rows in the table are pending validation after the table was updated.
     *         </p>
     *         </li>
     */

    public String getValidationState() {
        return this.validationState;
    }

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled – Validation isn't enabled for the table in the migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records – Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records – Some records in the table don't match between the source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records – Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key –The table couldn't be validated because it has no primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated – All rows in the table are validated. If the table is updated, the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error – The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending validation – The table is waiting validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing table – Preparing the table enabled in the migration task for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending revalidation – All rows in the table are pending validation after the table was updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationState
     *        The validation state of the table.</p>
     *        <p>
     *        This parameter can have the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Not enabled – Validation isn't enabled for the table in the migration task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Pending records – Some records in the table are waiting for validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Mismatched records – Some records in the table don't match between the source and target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Suspended records – Some records in the table couldn't be validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No primary key –The table couldn't be validated because it has no primary key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Validated – All rows in the table are validated. If the table is updated, the status can change from
     *        Validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Error – The table couldn't be validated because of an unexpected error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Pending validation – The table is waiting validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Preparing table – Preparing the table enabled in the migration task for validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Pending revalidation – All rows in the table are pending validation after the table was updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withValidationState(String validationState) {
        setValidationState(validationState);
        return this;
    }

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     * 
     * @param validationStateDetails
     *        Additional details about the state of validation.
     */

    public void setValidationStateDetails(String validationStateDetails) {
        this.validationStateDetails = validationStateDetails;
    }

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     * 
     * @return Additional details about the state of validation.
     */

    public String getValidationStateDetails() {
        return this.validationStateDetails;
    }

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     * 
     * @param validationStateDetails
     *        Additional details about the state of validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withValidationStateDetails(String validationStateDetails) {
        setValidationStateDetails(validationStateDetails);
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
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getInserts() != null)
            sb.append("Inserts: ").append(getInserts()).append(",");
        if (getDeletes() != null)
            sb.append("Deletes: ").append(getDeletes()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates()).append(",");
        if (getDdls() != null)
            sb.append("Ddls: ").append(getDdls()).append(",");
        if (getFullLoadRows() != null)
            sb.append("FullLoadRows: ").append(getFullLoadRows()).append(",");
        if (getFullLoadCondtnlChkFailedRows() != null)
            sb.append("FullLoadCondtnlChkFailedRows: ").append(getFullLoadCondtnlChkFailedRows()).append(",");
        if (getFullLoadErrorRows() != null)
            sb.append("FullLoadErrorRows: ").append(getFullLoadErrorRows()).append(",");
        if (getFullLoadStartTime() != null)
            sb.append("FullLoadStartTime: ").append(getFullLoadStartTime()).append(",");
        if (getFullLoadEndTime() != null)
            sb.append("FullLoadEndTime: ").append(getFullLoadEndTime()).append(",");
        if (getFullLoadReloaded() != null)
            sb.append("FullLoadReloaded: ").append(getFullLoadReloaded()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getTableState() != null)
            sb.append("TableState: ").append(getTableState()).append(",");
        if (getValidationPendingRecords() != null)
            sb.append("ValidationPendingRecords: ").append(getValidationPendingRecords()).append(",");
        if (getValidationFailedRecords() != null)
            sb.append("ValidationFailedRecords: ").append(getValidationFailedRecords()).append(",");
        if (getValidationSuspendedRecords() != null)
            sb.append("ValidationSuspendedRecords: ").append(getValidationSuspendedRecords()).append(",");
        if (getValidationState() != null)
            sb.append("ValidationState: ").append(getValidationState()).append(",");
        if (getValidationStateDetails() != null)
            sb.append("ValidationStateDetails: ").append(getValidationStateDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableStatistics == false)
            return false;
        TableStatistics other = (TableStatistics) obj;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getInserts() == null ^ this.getInserts() == null)
            return false;
        if (other.getInserts() != null && other.getInserts().equals(this.getInserts()) == false)
            return false;
        if (other.getDeletes() == null ^ this.getDeletes() == null)
            return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getDdls() == null ^ this.getDdls() == null)
            return false;
        if (other.getDdls() != null && other.getDdls().equals(this.getDdls()) == false)
            return false;
        if (other.getFullLoadRows() == null ^ this.getFullLoadRows() == null)
            return false;
        if (other.getFullLoadRows() != null && other.getFullLoadRows().equals(this.getFullLoadRows()) == false)
            return false;
        if (other.getFullLoadCondtnlChkFailedRows() == null ^ this.getFullLoadCondtnlChkFailedRows() == null)
            return false;
        if (other.getFullLoadCondtnlChkFailedRows() != null && other.getFullLoadCondtnlChkFailedRows().equals(this.getFullLoadCondtnlChkFailedRows()) == false)
            return false;
        if (other.getFullLoadErrorRows() == null ^ this.getFullLoadErrorRows() == null)
            return false;
        if (other.getFullLoadErrorRows() != null && other.getFullLoadErrorRows().equals(this.getFullLoadErrorRows()) == false)
            return false;
        if (other.getFullLoadStartTime() == null ^ this.getFullLoadStartTime() == null)
            return false;
        if (other.getFullLoadStartTime() != null && other.getFullLoadStartTime().equals(this.getFullLoadStartTime()) == false)
            return false;
        if (other.getFullLoadEndTime() == null ^ this.getFullLoadEndTime() == null)
            return false;
        if (other.getFullLoadEndTime() != null && other.getFullLoadEndTime().equals(this.getFullLoadEndTime()) == false)
            return false;
        if (other.getFullLoadReloaded() == null ^ this.getFullLoadReloaded() == null)
            return false;
        if (other.getFullLoadReloaded() != null && other.getFullLoadReloaded().equals(this.getFullLoadReloaded()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getTableState() == null ^ this.getTableState() == null)
            return false;
        if (other.getTableState() != null && other.getTableState().equals(this.getTableState()) == false)
            return false;
        if (other.getValidationPendingRecords() == null ^ this.getValidationPendingRecords() == null)
            return false;
        if (other.getValidationPendingRecords() != null && other.getValidationPendingRecords().equals(this.getValidationPendingRecords()) == false)
            return false;
        if (other.getValidationFailedRecords() == null ^ this.getValidationFailedRecords() == null)
            return false;
        if (other.getValidationFailedRecords() != null && other.getValidationFailedRecords().equals(this.getValidationFailedRecords()) == false)
            return false;
        if (other.getValidationSuspendedRecords() == null ^ this.getValidationSuspendedRecords() == null)
            return false;
        if (other.getValidationSuspendedRecords() != null && other.getValidationSuspendedRecords().equals(this.getValidationSuspendedRecords()) == false)
            return false;
        if (other.getValidationState() == null ^ this.getValidationState() == null)
            return false;
        if (other.getValidationState() != null && other.getValidationState().equals(this.getValidationState()) == false)
            return false;
        if (other.getValidationStateDetails() == null ^ this.getValidationStateDetails() == null)
            return false;
        if (other.getValidationStateDetails() != null && other.getValidationStateDetails().equals(this.getValidationStateDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getInserts() == null) ? 0 : getInserts().hashCode());
        hashCode = prime * hashCode + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getDdls() == null) ? 0 : getDdls().hashCode());
        hashCode = prime * hashCode + ((getFullLoadRows() == null) ? 0 : getFullLoadRows().hashCode());
        hashCode = prime * hashCode + ((getFullLoadCondtnlChkFailedRows() == null) ? 0 : getFullLoadCondtnlChkFailedRows().hashCode());
        hashCode = prime * hashCode + ((getFullLoadErrorRows() == null) ? 0 : getFullLoadErrorRows().hashCode());
        hashCode = prime * hashCode + ((getFullLoadStartTime() == null) ? 0 : getFullLoadStartTime().hashCode());
        hashCode = prime * hashCode + ((getFullLoadEndTime() == null) ? 0 : getFullLoadEndTime().hashCode());
        hashCode = prime * hashCode + ((getFullLoadReloaded() == null) ? 0 : getFullLoadReloaded().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTableState() == null) ? 0 : getTableState().hashCode());
        hashCode = prime * hashCode + ((getValidationPendingRecords() == null) ? 0 : getValidationPendingRecords().hashCode());
        hashCode = prime * hashCode + ((getValidationFailedRecords() == null) ? 0 : getValidationFailedRecords().hashCode());
        hashCode = prime * hashCode + ((getValidationSuspendedRecords() == null) ? 0 : getValidationSuspendedRecords().hashCode());
        hashCode = prime * hashCode + ((getValidationState() == null) ? 0 : getValidationState().hashCode());
        hashCode = prime * hashCode + ((getValidationStateDetails() == null) ? 0 : getValidationStateDetails().hashCode());
        return hashCode;
    }

    @Override
    public TableStatistics clone() {
        try {
            return (TableStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.TableStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
