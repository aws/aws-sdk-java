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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeletePartitionIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePartitionIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * Specifies the name of a database from which you want to delete a partition index.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Specifies the name of a table from which you want to delete a partition index.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of the partition index to be deleted.
     * </p>
     */
    private String indexName;

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     * 
     * @param catalogId
     *        The catalog ID where the table resides.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     * 
     * @return The catalog ID where the table resides.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The catalog ID where the table resides.
     * </p>
     * 
     * @param catalogId
     *        The catalog ID where the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePartitionIndexRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * Specifies the name of a database from which you want to delete a partition index.
     * </p>
     * 
     * @param databaseName
     *        Specifies the name of a database from which you want to delete a partition index.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Specifies the name of a database from which you want to delete a partition index.
     * </p>
     * 
     * @return Specifies the name of a database from which you want to delete a partition index.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Specifies the name of a database from which you want to delete a partition index.
     * </p>
     * 
     * @param databaseName
     *        Specifies the name of a database from which you want to delete a partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePartitionIndexRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specifies the name of a table from which you want to delete a partition index.
     * </p>
     * 
     * @param tableName
     *        Specifies the name of a table from which you want to delete a partition index.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Specifies the name of a table from which you want to delete a partition index.
     * </p>
     * 
     * @return Specifies the name of a table from which you want to delete a partition index.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Specifies the name of a table from which you want to delete a partition index.
     * </p>
     * 
     * @param tableName
     *        Specifies the name of a table from which you want to delete a partition index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePartitionIndexRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of the partition index to be deleted.
     * </p>
     * 
     * @param indexName
     *        The name of the partition index to be deleted.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the partition index to be deleted.
     * </p>
     * 
     * @return The name of the partition index to be deleted.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the partition index to be deleted.
     * </p>
     * 
     * @param indexName
     *        The name of the partition index to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePartitionIndexRequest withIndexName(String indexName) {
        setIndexName(indexName);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePartitionIndexRequest == false)
            return false;
        DeletePartitionIndexRequest other = (DeletePartitionIndexRequest) obj;
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
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
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
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        return hashCode;
    }

    @Override
    public DeletePartitionIndexRequest clone() {
        return (DeletePartitionIndexRequest) super.clone();
    }

}
