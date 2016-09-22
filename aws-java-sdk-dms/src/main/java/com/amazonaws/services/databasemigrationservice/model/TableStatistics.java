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
public class TableStatistics implements Serializable, Cloneable {

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
     * The Data Definition Language (DDL) used to build and modify the structure of your tables.
     * </p>
     */
    private Long ddls;
    /**
     * <p>
     * The number of rows added during the Full Load operation.
     * </p>
     */
    private Long fullLoadRows;
    /**
     * <p>
     * The last time the table was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The state of the table.
     * </p>
     */
    private String tableState;

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
     * The Data Definition Language (DDL) used to build and modify the structure of your tables.
     * </p>
     * 
     * @param ddls
     *        The Data Definition Language (DDL) used to build and modify the structure of your tables.
     */

    public void setDdls(Long ddls) {
        this.ddls = ddls;
    }

    /**
     * <p>
     * The Data Definition Language (DDL) used to build and modify the structure of your tables.
     * </p>
     * 
     * @return The Data Definition Language (DDL) used to build and modify the structure of your tables.
     */

    public Long getDdls() {
        return this.ddls;
    }

    /**
     * <p>
     * The Data Definition Language (DDL) used to build and modify the structure of your tables.
     * </p>
     * 
     * @param ddls
     *        The Data Definition Language (DDL) used to build and modify the structure of your tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withDdls(Long ddls) {
        setDdls(ddls);
        return this;
    }

    /**
     * <p>
     * The number of rows added during the Full Load operation.
     * </p>
     * 
     * @param fullLoadRows
     *        The number of rows added during the Full Load operation.
     */

    public void setFullLoadRows(Long fullLoadRows) {
        this.fullLoadRows = fullLoadRows;
    }

    /**
     * <p>
     * The number of rows added during the Full Load operation.
     * </p>
     * 
     * @return The number of rows added during the Full Load operation.
     */

    public Long getFullLoadRows() {
        return this.fullLoadRows;
    }

    /**
     * <p>
     * The number of rows added during the Full Load operation.
     * </p>
     * 
     * @param fullLoadRows
     *        The number of rows added during the Full Load operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withFullLoadRows(Long fullLoadRows) {
        setFullLoadRows(fullLoadRows);
        return this;
    }

    /**
     * <p>
     * The last time the table was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the table was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the table was updated.
     * </p>
     * 
     * @return The last time the table was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the table was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the table was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The state of the table.
     * </p>
     * 
     * @param tableState
     *        The state of the table.
     */

    public void setTableState(String tableState) {
        this.tableState = tableState;
    }

    /**
     * <p>
     * The state of the table.
     * </p>
     * 
     * @return The state of the table.
     */

    public String getTableState() {
        return this.tableState;
    }

    /**
     * <p>
     * The state of the table.
     * </p>
     * 
     * @param tableState
     *        The state of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableStatistics withTableState(String tableState) {
        setTableState(tableState);
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
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getInserts() != null)
            sb.append("Inserts: " + getInserts() + ",");
        if (getDeletes() != null)
            sb.append("Deletes: " + getDeletes() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates() + ",");
        if (getDdls() != null)
            sb.append("Ddls: " + getDdls() + ",");
        if (getFullLoadRows() != null)
            sb.append("FullLoadRows: " + getFullLoadRows() + ",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: " + getLastUpdateTime() + ",");
        if (getTableState() != null)
            sb.append("TableState: " + getTableState());
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
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getTableState() == null ^ this.getTableState() == null)
            return false;
        if (other.getTableState() != null && other.getTableState().equals(this.getTableState()) == false)
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
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTableState() == null) ? 0 : getTableState().hashCode());
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
}
