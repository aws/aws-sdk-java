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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Table represents a database table in Timestream. Tables contain one or more related time series. You can modify the
 * retention duration of the memory store and the magnetic store for a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/Table" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Table implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this table.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the Timestream database that contains this table.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String tableStatus;
    /**
     * <p>
     * The retention duration for the memory store and magnetic store.
     * </p>
     */
    private RetentionProperties retentionProperties;
    /**
     * <p>
     * The time when the Timestream table was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the Timestream table was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this table.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name that uniquely identifies this table.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this table.
     * </p>
     * 
     * @return The Amazon Resource Name that uniquely identifies this table.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this table.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name that uniquely identifies this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timestream table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @return The name of the Timestream table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timestream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the Timestream database that contains this table.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database that contains this table.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database that contains this table.
     * </p>
     * 
     * @return The name of the Timestream database that contains this table.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database that contains this table.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database that contains this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @see TableStatus
     */

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the table:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The table is ready for use.
     *         </p>
     *         </li>
     * @see TableStatus
     */

    public String getTableStatus() {
        return this.tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public Table withTableStatus(String tableStatus) {
        setTableStatus(tableStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public Table withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }

    /**
     * <p>
     * The retention duration for the memory store and magnetic store.
     * </p>
     * 
     * @param retentionProperties
     *        The retention duration for the memory store and magnetic store.
     */

    public void setRetentionProperties(RetentionProperties retentionProperties) {
        this.retentionProperties = retentionProperties;
    }

    /**
     * <p>
     * The retention duration for the memory store and magnetic store.
     * </p>
     * 
     * @return The retention duration for the memory store and magnetic store.
     */

    public RetentionProperties getRetentionProperties() {
        return this.retentionProperties;
    }

    /**
     * <p>
     * The retention duration for the memory store and magnetic store.
     * </p>
     * 
     * @param retentionProperties
     *        The retention duration for the memory store and magnetic store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withRetentionProperties(RetentionProperties retentionProperties) {
        setRetentionProperties(retentionProperties);
        return this;
    }

    /**
     * <p>
     * The time when the Timestream table was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Timestream table was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the Timestream table was created.
     * </p>
     * 
     * @return The time when the Timestream table was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the Timestream table was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Timestream table was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the Timestream table was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the Timestream table was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the Timestream table was last updated.
     * </p>
     * 
     * @return The time when the Timestream table was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the Timestream table was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the Timestream table was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableStatus() != null)
            sb.append("TableStatus: ").append(getTableStatus()).append(",");
        if (getRetentionProperties() != null)
            sb.append("RetentionProperties: ").append(getRetentionProperties()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Table == false)
            return false;
        Table other = (Table) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableStatus() == null ^ this.getTableStatus() == null)
            return false;
        if (other.getTableStatus() != null && other.getTableStatus().equals(this.getTableStatus()) == false)
            return false;
        if (other.getRetentionProperties() == null ^ this.getRetentionProperties() == null)
            return false;
        if (other.getRetentionProperties() != null && other.getRetentionProperties().equals(this.getRetentionProperties()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode());
        hashCode = prime * hashCode + ((getRetentionProperties() == null) ? 0 : getRetentionProperties().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Table clone() {
        try {
            return (Table) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.TableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
