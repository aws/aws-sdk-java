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
 * A structure for the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private CatalogResource catalog;
    /**
     * <p>
     * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions
     * organized into a logical group. You can Grant and Revoke database permissions to a principal.
     * </p>
     */
    private DatabaseResource database;
    /**
     * <p>
     * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke
     * table privileges to a principal.
     * </p>
     */
    private TableResource table;
    /**
     * <p>
     * The table with columns for the resource. A principal with permissions to this resource can select metadata from
     * the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     * </p>
     */
    private TableWithColumnsResource tableWithColumns;
    /**
     * <p>
     * The location of an Amazon S3 path where permissions are granted or revoked.
     * </p>
     */
    private DataLocationResource dataLocation;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalog
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalog(CatalogResource catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public CatalogResource getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalog
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withCatalog(CatalogResource catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions
     * organized into a logical group. You can Grant and Revoke database permissions to a principal.
     * </p>
     * 
     * @param database
     *        The database for the resource. Unique to the Data Catalog. A database is a set of associated table
     *        definitions organized into a logical group. You can Grant and Revoke database permissions to a principal.
     */

    public void setDatabase(DatabaseResource database) {
        this.database = database;
    }

    /**
     * <p>
     * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions
     * organized into a logical group. You can Grant and Revoke database permissions to a principal.
     * </p>
     * 
     * @return The database for the resource. Unique to the Data Catalog. A database is a set of associated table
     *         definitions organized into a logical group. You can Grant and Revoke database permissions to a principal.
     */

    public DatabaseResource getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database for the resource. Unique to the Data Catalog. A database is a set of associated table definitions
     * organized into a logical group. You can Grant and Revoke database permissions to a principal.
     * </p>
     * 
     * @param database
     *        The database for the resource. Unique to the Data Catalog. A database is a set of associated table
     *        definitions organized into a logical group. You can Grant and Revoke database permissions to a principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDatabase(DatabaseResource database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke
     * table privileges to a principal.
     * </p>
     * 
     * @param table
     *        The table for the resource. A table is a metadata definition that represents your data. You can Grant and
     *        Revoke table privileges to a principal.
     */

    public void setTable(TableResource table) {
        this.table = table;
    }

    /**
     * <p>
     * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke
     * table privileges to a principal.
     * </p>
     * 
     * @return The table for the resource. A table is a metadata definition that represents your data. You can Grant and
     *         Revoke table privileges to a principal.
     */

    public TableResource getTable() {
        return this.table;
    }

    /**
     * <p>
     * The table for the resource. A table is a metadata definition that represents your data. You can Grant and Revoke
     * table privileges to a principal.
     * </p>
     * 
     * @param table
     *        The table for the resource. A table is a metadata definition that represents your data. You can Grant and
     *        Revoke table privileges to a principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withTable(TableResource table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The table with columns for the resource. A principal with permissions to this resource can select metadata from
     * the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     * </p>
     * 
     * @param tableWithColumns
     *        The table with columns for the resource. A principal with permissions to this resource can select metadata
     *        from the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     */

    public void setTableWithColumns(TableWithColumnsResource tableWithColumns) {
        this.tableWithColumns = tableWithColumns;
    }

    /**
     * <p>
     * The table with columns for the resource. A principal with permissions to this resource can select metadata from
     * the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     * </p>
     * 
     * @return The table with columns for the resource. A principal with permissions to this resource can select
     *         metadata from the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     */

    public TableWithColumnsResource getTableWithColumns() {
        return this.tableWithColumns;
    }

    /**
     * <p>
     * The table with columns for the resource. A principal with permissions to this resource can select metadata from
     * the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     * </p>
     * 
     * @param tableWithColumns
     *        The table with columns for the resource. A principal with permissions to this resource can select metadata
     *        from the columns of a table in the Data Catalog and the underlying data in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withTableWithColumns(TableWithColumnsResource tableWithColumns) {
        setTableWithColumns(tableWithColumns);
        return this;
    }

    /**
     * <p>
     * The location of an Amazon S3 path where permissions are granted or revoked.
     * </p>
     * 
     * @param dataLocation
     *        The location of an Amazon S3 path where permissions are granted or revoked.
     */

    public void setDataLocation(DataLocationResource dataLocation) {
        this.dataLocation = dataLocation;
    }

    /**
     * <p>
     * The location of an Amazon S3 path where permissions are granted or revoked.
     * </p>
     * 
     * @return The location of an Amazon S3 path where permissions are granted or revoked.
     */

    public DataLocationResource getDataLocation() {
        return this.dataLocation;
    }

    /**
     * <p>
     * The location of an Amazon S3 path where permissions are granted or revoked.
     * </p>
     * 
     * @param dataLocation
     *        The location of an Amazon S3 path where permissions are granted or revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDataLocation(DataLocationResource dataLocation) {
        setDataLocation(dataLocation);
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getTableWithColumns() != null)
            sb.append("TableWithColumns: ").append(getTableWithColumns()).append(",");
        if (getDataLocation() != null)
            sb.append("DataLocation: ").append(getDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getTableWithColumns() == null ^ this.getTableWithColumns() == null)
            return false;
        if (other.getTableWithColumns() != null && other.getTableWithColumns().equals(this.getTableWithColumns()) == false)
            return false;
        if (other.getDataLocation() == null ^ this.getDataLocation() == null)
            return false;
        if (other.getDataLocation() != null && other.getDataLocation().equals(this.getDataLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getTableWithColumns() == null) ? 0 : getTableWithColumns().hashCode());
        hashCode = prime * hashCode + ((getDataLocation() == null) ? 0 : getDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
