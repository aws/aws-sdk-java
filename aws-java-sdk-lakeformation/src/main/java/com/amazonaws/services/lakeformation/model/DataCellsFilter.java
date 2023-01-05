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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes certain columns on certain rows.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DataCellsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCellsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the catalog to which the table belongs.
     * </p>
     */
    private String tableCatalogId;
    /**
     * <p>
     * A database in the Glue Data Catalog.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A table in the database.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name given by the user to the data filter cell.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A PartiQL predicate.
     * </p>
     */
    private RowFilter rowFilter;
    /**
     * <p>
     * A list of column names.
     * </p>
     */
    private java.util.List<String> columnNames;
    /**
     * <p>
     * A wildcard with exclusions.
     * </p>
     * <p>
     * You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     * </p>
     */
    private ColumnWildcard columnWildcard;

    /**
     * <p>
     * The ID of the catalog to which the table belongs.
     * </p>
     * 
     * @param tableCatalogId
     *        The ID of the catalog to which the table belongs.
     */

    public void setTableCatalogId(String tableCatalogId) {
        this.tableCatalogId = tableCatalogId;
    }

    /**
     * <p>
     * The ID of the catalog to which the table belongs.
     * </p>
     * 
     * @return The ID of the catalog to which the table belongs.
     */

    public String getTableCatalogId() {
        return this.tableCatalogId;
    }

    /**
     * <p>
     * The ID of the catalog to which the table belongs.
     * </p>
     * 
     * @param tableCatalogId
     *        The ID of the catalog to which the table belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withTableCatalogId(String tableCatalogId) {
        setTableCatalogId(tableCatalogId);
        return this;
    }

    /**
     * <p>
     * A database in the Glue Data Catalog.
     * </p>
     * 
     * @param databaseName
     *        A database in the Glue Data Catalog.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * A database in the Glue Data Catalog.
     * </p>
     * 
     * @return A database in the Glue Data Catalog.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * A database in the Glue Data Catalog.
     * </p>
     * 
     * @param databaseName
     *        A database in the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A table in the database.
     * </p>
     * 
     * @param tableName
     *        A table in the database.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * A table in the database.
     * </p>
     * 
     * @return A table in the database.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * A table in the database.
     * </p>
     * 
     * @param tableName
     *        A table in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name given by the user to the data filter cell.
     * </p>
     * 
     * @param name
     *        The name given by the user to the data filter cell.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name given by the user to the data filter cell.
     * </p>
     * 
     * @return The name given by the user to the data filter cell.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name given by the user to the data filter cell.
     * </p>
     * 
     * @param name
     *        The name given by the user to the data filter cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A PartiQL predicate.
     * </p>
     * 
     * @param rowFilter
     *        A PartiQL predicate.
     */

    public void setRowFilter(RowFilter rowFilter) {
        this.rowFilter = rowFilter;
    }

    /**
     * <p>
     * A PartiQL predicate.
     * </p>
     * 
     * @return A PartiQL predicate.
     */

    public RowFilter getRowFilter() {
        return this.rowFilter;
    }

    /**
     * <p>
     * A PartiQL predicate.
     * </p>
     * 
     * @param rowFilter
     *        A PartiQL predicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withRowFilter(RowFilter rowFilter) {
        setRowFilter(rowFilter);
        return this;
    }

    /**
     * <p>
     * A list of column names.
     * </p>
     * 
     * @return A list of column names.
     */

    public java.util.List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * <p>
     * A list of column names.
     * </p>
     * 
     * @param columnNames
     *        A list of column names.
     */

    public void setColumnNames(java.util.Collection<String> columnNames) {
        if (columnNames == null) {
            this.columnNames = null;
            return;
        }

        this.columnNames = new java.util.ArrayList<String>(columnNames);
    }

    /**
     * <p>
     * A list of column names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNames(java.util.Collection)} or {@link #withColumnNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnNames
     *        A list of column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withColumnNames(String... columnNames) {
        if (this.columnNames == null) {
            setColumnNames(new java.util.ArrayList<String>(columnNames.length));
        }
        for (String ele : columnNames) {
            this.columnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of column names.
     * </p>
     * 
     * @param columnNames
     *        A list of column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withColumnNames(java.util.Collection<String> columnNames) {
        setColumnNames(columnNames);
        return this;
    }

    /**
     * <p>
     * A wildcard with exclusions.
     * </p>
     * <p>
     * You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     * </p>
     * 
     * @param columnWildcard
     *        A wildcard with exclusions.</p>
     *        <p>
     *        You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     */

    public void setColumnWildcard(ColumnWildcard columnWildcard) {
        this.columnWildcard = columnWildcard;
    }

    /**
     * <p>
     * A wildcard with exclusions.
     * </p>
     * <p>
     * You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     * </p>
     * 
     * @return A wildcard with exclusions.</p>
     *         <p>
     *         You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     */

    public ColumnWildcard getColumnWildcard() {
        return this.columnWildcard;
    }

    /**
     * <p>
     * A wildcard with exclusions.
     * </p>
     * <p>
     * You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     * </p>
     * 
     * @param columnWildcard
     *        A wildcard with exclusions.</p>
     *        <p>
     *        You must specify either a <code>ColumnNames</code> list or the <code>ColumnWildCard</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilter withColumnWildcard(ColumnWildcard columnWildcard) {
        setColumnWildcard(columnWildcard);
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
        if (getTableCatalogId() != null)
            sb.append("TableCatalogId: ").append(getTableCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRowFilter() != null)
            sb.append("RowFilter: ").append(getRowFilter()).append(",");
        if (getColumnNames() != null)
            sb.append("ColumnNames: ").append(getColumnNames()).append(",");
        if (getColumnWildcard() != null)
            sb.append("ColumnWildcard: ").append(getColumnWildcard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCellsFilter == false)
            return false;
        DataCellsFilter other = (DataCellsFilter) obj;
        if (other.getTableCatalogId() == null ^ this.getTableCatalogId() == null)
            return false;
        if (other.getTableCatalogId() != null && other.getTableCatalogId().equals(this.getTableCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRowFilter() == null ^ this.getRowFilter() == null)
            return false;
        if (other.getRowFilter() != null && other.getRowFilter().equals(this.getRowFilter()) == false)
            return false;
        if (other.getColumnNames() == null ^ this.getColumnNames() == null)
            return false;
        if (other.getColumnNames() != null && other.getColumnNames().equals(this.getColumnNames()) == false)
            return false;
        if (other.getColumnWildcard() == null ^ this.getColumnWildcard() == null)
            return false;
        if (other.getColumnWildcard() != null && other.getColumnWildcard().equals(this.getColumnWildcard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableCatalogId() == null) ? 0 : getTableCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRowFilter() == null) ? 0 : getRowFilter().hashCode());
        hashCode = prime * hashCode + ((getColumnNames() == null) ? 0 : getColumnNames().hashCode());
        hashCode = prime * hashCode + ((getColumnWildcard() == null) ? 0 : getColumnWildcard().hashCode());
        return hashCode;
    }

    @Override
    public DataCellsFilter clone() {
        try {
            return (DataCellsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.DataCellsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
