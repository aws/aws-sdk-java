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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the column that is returned by the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/SelectColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the column.
     * </p>
     */
    private String name;

    private Type type;
    /**
     * <p>
     * Database that has this column.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Table within the database that has this column.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * True, if the column name was aliased by the query. False otherwise.
     * </p>
     */
    private Boolean aliased;

    /**
     * <p>
     * Name of the column.
     * </p>
     * 
     * @param name
     *        Name of the column.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the column.
     * </p>
     * 
     * @return Name of the column.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the column.
     * </p>
     * 
     * @param name
     *        Name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectColumn withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param type
     */

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return
     */

    public Type getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectColumn withType(Type type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Database that has this column.
     * </p>
     * 
     * @param databaseName
     *        Database that has this column.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Database that has this column.
     * </p>
     * 
     * @return Database that has this column.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Database that has this column.
     * </p>
     * 
     * @param databaseName
     *        Database that has this column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectColumn withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Table within the database that has this column.
     * </p>
     * 
     * @param tableName
     *        Table within the database that has this column.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Table within the database that has this column.
     * </p>
     * 
     * @return Table within the database that has this column.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Table within the database that has this column.
     * </p>
     * 
     * @param tableName
     *        Table within the database that has this column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectColumn withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * True, if the column name was aliased by the query. False otherwise.
     * </p>
     * 
     * @param aliased
     *        True, if the column name was aliased by the query. False otherwise.
     */

    public void setAliased(Boolean aliased) {
        this.aliased = aliased;
    }

    /**
     * <p>
     * True, if the column name was aliased by the query. False otherwise.
     * </p>
     * 
     * @return True, if the column name was aliased by the query. False otherwise.
     */

    public Boolean getAliased() {
        return this.aliased;
    }

    /**
     * <p>
     * True, if the column name was aliased by the query. False otherwise.
     * </p>
     * 
     * @param aliased
     *        True, if the column name was aliased by the query. False otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectColumn withAliased(Boolean aliased) {
        setAliased(aliased);
        return this;
    }

    /**
     * <p>
     * True, if the column name was aliased by the query. False otherwise.
     * </p>
     * 
     * @return True, if the column name was aliased by the query. False otherwise.
     */

    public Boolean isAliased() {
        return this.aliased;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getAliased() != null)
            sb.append("Aliased: ").append(getAliased());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectColumn == false)
            return false;
        SelectColumn other = (SelectColumn) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getAliased() == null ^ this.getAliased() == null)
            return false;
        if (other.getAliased() != null && other.getAliased().equals(this.getAliased()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getAliased() == null) ? 0 : getAliased().hashCode());
        return hashCode;
    }

    @Override
    public SelectColumn clone() {
        try {
            return (SelectColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.SelectColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
