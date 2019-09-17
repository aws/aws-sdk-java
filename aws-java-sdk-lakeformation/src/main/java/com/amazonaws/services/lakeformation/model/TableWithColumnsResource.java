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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure for a table with columns object. This object is only used when granting a SELECT permission.
 * </p>
 * <p>
 * This object must take a value for at least one of <code>ColumnsNames</code>, <code>ColumnsIndexes</code>, or
 * <code>ColumnsWildcard</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/TableWithColumnsResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableWithColumnsResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of
     * associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a
     * principal.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and
     * Revoke table privileges to a principal.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of column names for the table. At least one of <code>ColumnNames</code> or <code>ColumnWildcard</code>
     * is required.
     * </p>
     */
    private java.util.List<String> columnNames;
    /**
     * <p>
     * A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     * <code>ColumnWildcard</code> is required.
     * </p>
     */
    private ColumnWildcard columnWildcard;

    /**
     * <p>
     * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of
     * associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a
     * principal.
     * </p>
     * 
     * @param databaseName
     *        The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a
     *        set of associated table definitions organized into a logical group. You can Grant and Revoke database
     *        privileges to a principal.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of
     * associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a
     * principal.
     * </p>
     * 
     * @return The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a
     *         set of associated table definitions organized into a logical group. You can Grant and Revoke database
     *         privileges to a principal.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of
     * associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a
     * principal.
     * </p>
     * 
     * @param databaseName
     *        The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a
     *        set of associated table definitions organized into a logical group. You can Grant and Revoke database
     *        privileges to a principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableWithColumnsResource withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and
     * Revoke table privileges to a principal.
     * </p>
     * 
     * @param name
     *        The name of the table resource. A table is a metadata definition that represents your data. You can Grant
     *        and Revoke table privileges to a principal.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and
     * Revoke table privileges to a principal.
     * </p>
     * 
     * @return The name of the table resource. A table is a metadata definition that represents your data. You can Grant
     *         and Revoke table privileges to a principal.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and
     * Revoke table privileges to a principal.
     * </p>
     * 
     * @param name
     *        The name of the table resource. A table is a metadata definition that represents your data. You can Grant
     *        and Revoke table privileges to a principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableWithColumnsResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of column names for the table. At least one of <code>ColumnNames</code> or <code>ColumnWildcard</code>
     * is required.
     * </p>
     * 
     * @return The list of column names for the table. At least one of <code>ColumnNames</code> or
     *         <code>ColumnWildcard</code> is required.
     */

    public java.util.List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * <p>
     * The list of column names for the table. At least one of <code>ColumnNames</code> or <code>ColumnWildcard</code>
     * is required.
     * </p>
     * 
     * @param columnNames
     *        The list of column names for the table. At least one of <code>ColumnNames</code> or
     *        <code>ColumnWildcard</code> is required.
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
     * The list of column names for the table. At least one of <code>ColumnNames</code> or <code>ColumnWildcard</code>
     * is required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNames(java.util.Collection)} or {@link #withColumnNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnNames
     *        The list of column names for the table. At least one of <code>ColumnNames</code> or
     *        <code>ColumnWildcard</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableWithColumnsResource withColumnNames(String... columnNames) {
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
     * The list of column names for the table. At least one of <code>ColumnNames</code> or <code>ColumnWildcard</code>
     * is required.
     * </p>
     * 
     * @param columnNames
     *        The list of column names for the table. At least one of <code>ColumnNames</code> or
     *        <code>ColumnWildcard</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableWithColumnsResource withColumnNames(java.util.Collection<String> columnNames) {
        setColumnNames(columnNames);
        return this;
    }

    /**
     * <p>
     * A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     * <code>ColumnWildcard</code> is required.
     * </p>
     * 
     * @param columnWildcard
     *        A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     *        <code>ColumnWildcard</code> is required.
     */

    public void setColumnWildcard(ColumnWildcard columnWildcard) {
        this.columnWildcard = columnWildcard;
    }

    /**
     * <p>
     * A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     * <code>ColumnWildcard</code> is required.
     * </p>
     * 
     * @return A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     *         <code>ColumnWildcard</code> is required.
     */

    public ColumnWildcard getColumnWildcard() {
        return this.columnWildcard;
    }

    /**
     * <p>
     * A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     * <code>ColumnWildcard</code> is required.
     * </p>
     * 
     * @param columnWildcard
     *        A wildcard specified by a <code>ColumnWildcard</code> object. At least one of <code>ColumnNames</code> or
     *        <code>ColumnWildcard</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableWithColumnsResource withColumnWildcard(ColumnWildcard columnWildcard) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof TableWithColumnsResource == false)
            return false;
        TableWithColumnsResource other = (TableWithColumnsResource) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getColumnNames() == null) ? 0 : getColumnNames().hashCode());
        hashCode = prime * hashCode + ((getColumnWildcard() == null) ? 0 : getColumnWildcard().hashCode());
        return hashCode;
    }

    @Override
    public TableWithColumnsResource clone() {
        try {
            return (TableWithColumnsResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.TableWithColumnsResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
