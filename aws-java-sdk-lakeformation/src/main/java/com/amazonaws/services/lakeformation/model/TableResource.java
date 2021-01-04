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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure for the table object. A table is a metadata definition that represents your data. You can Grant and
 * Revoke table privileges to a principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/TableResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, it is the account ID of the caller.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     * definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A wildcard object representing every table under a database.
     * </p>
     * <p>
     * At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     * </p>
     */
    private TableWildcard tableWildcard;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, it is the account ID of the caller.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, it is the account ID of the caller.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, it is the account ID of the caller.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, it is the account ID of the caller.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, it is the account ID of the caller.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, it is the account ID of the caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableResource withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     * definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     * </p>
     * 
     * @param databaseName
     *        The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     *        definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     * definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     * </p>
     * 
     * @return The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     *         definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     * definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     * </p>
     * 
     * @param databaseName
     *        The name of the database for the table. Unique to a Data Catalog. A database is a set of associated table
     *        definitions organized into a logical group. You can Grant and Revoke database privileges to a principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableResource withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param name
     *        The name of the table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param name
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A wildcard object representing every table under a database.
     * </p>
     * <p>
     * At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     * </p>
     * 
     * @param tableWildcard
     *        A wildcard object representing every table under a database.</p>
     *        <p>
     *        At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     */

    public void setTableWildcard(TableWildcard tableWildcard) {
        this.tableWildcard = tableWildcard;
    }

    /**
     * <p>
     * A wildcard object representing every table under a database.
     * </p>
     * <p>
     * At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     * </p>
     * 
     * @return A wildcard object representing every table under a database.</p>
     *         <p>
     *         At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     */

    public TableWildcard getTableWildcard() {
        return this.tableWildcard;
    }

    /**
     * <p>
     * A wildcard object representing every table under a database.
     * </p>
     * <p>
     * At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     * </p>
     * 
     * @param tableWildcard
     *        A wildcard object representing every table under a database.</p>
     *        <p>
     *        At least one of <code>TableResource$Name</code> or <code>TableResource$TableWildcard</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableResource withTableWildcard(TableWildcard tableWildcard) {
        setTableWildcard(tableWildcard);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTableWildcard() != null)
            sb.append("TableWildcard: ").append(getTableWildcard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableResource == false)
            return false;
        TableResource other = (TableResource) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTableWildcard() == null ^ this.getTableWildcard() == null)
            return false;
        if (other.getTableWildcard() != null && other.getTableWildcard().equals(this.getTableWildcard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTableWildcard() == null) ? 0 : getTableWildcard().hashCode());
        return hashCode;
    }

    @Override
    public TableResource clone() {
        try {
            return (TableResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.TableResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
