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
 * A structure for a data cells filter resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DataCellsFilterResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCellsFilterResource implements Serializable, Cloneable, StructuredPojo {

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
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the data cells filter.
     * </p>
     */
    private String name;

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

    public DataCellsFilterResource withTableCatalogId(String tableCatalogId) {
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

    public DataCellsFilterResource withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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

    public DataCellsFilterResource withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the data cells filter.
     * </p>
     * 
     * @param name
     *        The name of the data cells filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data cells filter.
     * </p>
     * 
     * @return The name of the data cells filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data cells filter.
     * </p>
     * 
     * @param name
     *        The name of the data cells filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCellsFilterResource withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCellsFilterResource == false)
            return false;
        DataCellsFilterResource other = (DataCellsFilterResource) obj;
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
        return hashCode;
    }

    @Override
    public DataCellsFilterResource clone() {
        try {
            return (DataCellsFilterResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.DataCellsFilterResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
