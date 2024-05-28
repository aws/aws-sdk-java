/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a table optimizer to retrieve in the <code>BatchGetTableOptimizer</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTableOptimizerEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTableOptimizerEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
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
     * The type of table optimizer.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @param catalogId
     *        The Catalog ID of the table.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @return The Catalog ID of the table.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The Catalog ID of the table.
     * </p>
     * 
     * @param catalogId
     *        The Catalog ID of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerEntry withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the database in the catalog in which the table resides.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     * 
     * @return The name of the database in the catalog in which the table resides.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database in the catalog in which the table resides.
     * </p>
     * 
     * @param databaseName
     *        The name of the database in the catalog in which the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerEntry withDatabaseName(String databaseName) {
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

    public BatchGetTableOptimizerEntry withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The type of table optimizer.
     * </p>
     * 
     * @param type
     *        The type of table optimizer.
     * @see TableOptimizerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of table optimizer.
     * </p>
     * 
     * @return The type of table optimizer.
     * @see TableOptimizerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of table optimizer.
     * </p>
     * 
     * @param type
     *        The type of table optimizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOptimizerType
     */

    public BatchGetTableOptimizerEntry withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of table optimizer.
     * </p>
     * 
     * @param type
     *        The type of table optimizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOptimizerType
     */

    public BatchGetTableOptimizerEntry withType(TableOptimizerType type) {
        this.type = type.toString();
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTableOptimizerEntry == false)
            return false;
        BatchGetTableOptimizerEntry other = (BatchGetTableOptimizerEntry) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTableOptimizerEntry clone() {
        try {
            return (BatchGetTableOptimizerEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BatchGetTableOptimizerEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
